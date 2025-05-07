package com.example.demo.dto;

import java.util.List;

public class RequestDto {
  private Metadata metadata;
  private List<List<Object>> data;
  private List<Magnitude> magnitude;
  private Messages messages;

  // Getters and setters
  public Metadata getMetadata() { return metadata; }
  public void setMetadata(Metadata metadata) { this.metadata = metadata; }

  public List<List<Object>> getData() { return data; }
  public void setData(List<List<Object>> data) { this.data = data; }

  public List<Magnitude> getMagnitude() { return magnitude; }
  public void setMagnitude(List<Magnitude> magnitude) { this.magnitude = magnitude; }

  public Messages getMessages() { return messages; }
  public void setMessages(Messages messages) { this.messages = messages; }
}
