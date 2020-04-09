package com.profesorp.configclient.bean;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BeanConfiguration {
  private int minResults;
  private int maxResults;
  private String permanentValue;
  private String functionValue;

  public BeanConfiguration(int minResults, int maxResults, String permanentValue, String functionValue) {
    this.minResults = minResults;
    this.maxResults = maxResults;
    this.permanentValue = permanentValue;
    this.functionValue = functionValue;
  }
}
