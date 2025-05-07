package com.example.demo.dto;

import java.util.List;

public class Field {
  private String id;
  private String name;
  private String semanticType;
  private String dataType;
  private String key;
  private double maxAbsValue;
  private List<Info> infos;

  public String getId() { return id; }
  public void setId(String id) { this.id = id; }

  public String getName() { return name; }
  public void setName(String name) { this.name = name; }

  public String getSemanticType() { return semanticType; }
  public void setSemanticType(String semanticType) { this.semanticType = semanticType; }

  public String getDataType() { return dataType; }
  public void setDataType(String dataType) { this.dataType = dataType; }

  public String getKey() { return key; }
  public void setKey(String key) { this.key = key; }

  public double getMaxAbsValue() { return maxAbsValue; }
  public void setMaxAbsValue(double maxAbsValue) { this.maxAbsValue = maxAbsValue; }

  public List<Info> getInfos() { return infos; }
  public void setInfos(List<Info> infos) { this.infos = infos; }
}
