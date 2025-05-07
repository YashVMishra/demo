package com.example.demo.dto;

import java.util.List;

public class ComplexUnit {
  private List<String> types;
  private List<String> vals;
  private List<String> descs;
  private List<Integer> exps;

  public List<String> getTypes() { return types; }
  public void setTypes(List<String> types) { this.types = types; }

  public List<String> getVals() { return vals; }
  public void setVals(List<String> vals) { this.vals = vals; }

  public List<String> getDescs() { return descs; }
  public void setDescs(List<String> descs) { this.descs = descs; }

  public List<Integer> getExps() { return exps; }
  public void setExps(List<Integer> exps) { this.exps = exps; }
}
