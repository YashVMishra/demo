package com.example.demo.dto;

import java.util.List;

public class Metadata {
  private List<Field> fields;
  private boolean isUQM;

  public List<Field> getFields() { return fields; }
  public void setFields(List<Field> fields) { this.fields = fields; }

  public boolean isUQM() { return isUQM; }
  public void setUQM(boolean UQM) { isUQM = UQM; }
}
