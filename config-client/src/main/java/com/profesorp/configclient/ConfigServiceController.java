package com.profesorp.configclient;

import com.profesorp.configclient.bean.BeanConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ConfigServiceController {

  @Value("${values.permanent_value}")
  String permanentValue;

  @Value("${values.function_value}")
  String functionValue;

  @Autowired
  private Configuration configuration;

  @Autowired
  private ConfigurationData configurationData;

  @GetMapping("/limits")
  public BeanConfiguration getConfiguration() {
    return new BeanConfiguration(configuration.getMinimum(),
            configuration.getMaximum(), permanentValue, functionValue);
  }

  @GetMapping("/refreshed")
  public BeanConfiguration getConfigurationRefreshed(@Value("${values.function_value}") String functionValueUpdated) {
    return new BeanConfiguration(configuration.getMinimum(),
            configuration.getMaximum(), permanentValue, functionValueUpdated);
  }

  @GetMapping("/serverData")
  public ConfigurationData retrieveDataFromConfiguration() {
    return configurationData;
  }

}
