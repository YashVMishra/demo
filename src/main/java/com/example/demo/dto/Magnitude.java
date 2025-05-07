package com.example.demo.dto;

import java.util.List;

public class Magnitude {
  private List<String> values;
  private List<String> strings;
  private List<String> units;
  private List<String> labels;
  private List<String> magnitudes;
  private List<String> showSignAs;
  private List<String> scaleFormat;
  private List<ComplexUnit> complex_units;

  // Getters and setters
  public List<String> getValues() { return values; }
  public void setValues(List<String> values) { this.values = values; }

  public List<String> getStrings() { return strings; }
  public void setStrings(List<String> strings) { this.strings = strings; }

  public List<String> getUnits() { return units; }
  public void setUnits(List<String> units) { this.units = units; }

  public List<String> getLabels() { return labels; }
  public void setLabels(List<String> labels) { this.labels = labels; }

  public List<String> getMagnitudes() { return magnitudes; }
  public void setMagnitudes(List<String> magnitudes) { this.magnitudes = magnitudes; }

  public List<String> getShowSignAs() { return showSignAs; }
  public void setShowSignAs(List<String> showSignAs) { this.showSignAs = showSignAs; }

  public List<String> getScaleFormat() { return scaleFormat; }
  public void setScaleFormat(List<String> scaleFormat) { this.scaleFormat = scaleFormat; }

  public List<ComplexUnit> getComplex_units() { return complex_units; }
  public void setComplex_units(List<ComplexUnit> complex_units) { this.complex_units = complex_units; }
}

