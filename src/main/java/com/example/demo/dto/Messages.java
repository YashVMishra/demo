package com.example.demo.dto;

import java.util.List;

public class Messages {
  private List<Object> fatalErrors;
  private List<Object> errors;
  private List<Object> warnings;

  public List<Object> getFatalErrors() { return fatalErrors; }
  public void setFatalErrors(List<Object> fatalErrors) { this.fatalErrors = fatalErrors; }

  public List<Object> getErrors() { return errors; }
  public void setErrors(List<Object> errors) { this.errors = errors; }

  public List<Object> getWarnings() { return warnings; }
  public void setWarnings(List<Object> warnings) { this.warnings = warnings; }
}

