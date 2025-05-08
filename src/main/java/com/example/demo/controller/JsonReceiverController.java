package com.example.demo.controller;

import com.example.demo.dto.RequestDto;
import com.example.demo.dto.Field;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*") // 🚀 This allows CORS from any origin (even local file://)
public class JsonReceiverController {

  private final List<RequestDto> requestStore = new ArrayList<>();
  private final ObjectMapper objectMapper = new ObjectMapper();

  @PostMapping("/submit")
  public ResponseEntity<String> receiveJson(@RequestBody RequestDto requestDto) {
    requestStore.add(requestDto);

    // Debug info
    System.out.println("Received metadata.isUQM: " + requestDto.getMetadata().isUQM());
    System.out.println("Received cities: " + requestDto.getMetadata().getFields().get(0).getInfos());

    return ResponseEntity.ok("JSON received and stored in memory!");
  }

  @GetMapping("/og-data")
  public ResponseEntity<List<RequestDto>> getoriginalData() {
    return ResponseEntity.ok(requestStore);
  }

  @GetMapping("/data")
  public ResponseEntity<Map<String, Object>> getComputedData() {
    Map<String, Object> response = new HashMap<>();
    List<Map<String, Object>> computedList = new ArrayList<>();

    if (!requestStore.isEmpty()) {
      RequestDto requestDto = requestStore.get(0);
      List<Field> fields = requestDto.getMetadata().getFields();
      List<List<Object>> data = requestDto.getData();

      try {
        // Dynamically extract dimensionId from the first field
        String locationFieldName = extractDimensionId(fields.get(0).getId());
        String measureKey = fields.get(1).getKey(); // e.g., "Headcount"

        for (List<Object> entry : data) {
          Map<String, String> locationData = (Map<String, String>) entry.get(0);
          String location = locationData.get("d");
          Integer measureValue = Integer.parseInt(entry.get(1).toString());

          Map<String, Object> formattedEntry = new LinkedHashMap<>();
          formattedEntry.put(measureKey, measureValue);
          formattedEntry.put(locationFieldName, location);
          computedList.add(formattedEntry);
        }
      } catch (IOException e) {
        e.printStackTrace();
        return ResponseEntity.internalServerError().body(Map.of("error", "Invalid dimensionId format"));
      }
    }

    response.put("list", computedList);
    return ResponseEntity.ok(response);
  }

  private String extractDimensionId(String jsonString) throws IOException {
    List<Map<String, String>> idList = objectMapper.readValue(jsonString, new TypeReference<>() {
    });
    return idList.stream()
        .filter(map -> map.containsKey("dimensionId"))
        .findFirst()
        .get()
        .get("dimensionId");
  }

  @DeleteMapping("/clear")
  public ResponseEntity<String> clearData() {
    requestStore.clear();
    return ResponseEntity.ok("All stored data has been cleared!");
  }

}