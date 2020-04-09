package com.profesorp.configclient;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@ConfigurationProperties("limits")
public class Configuration {
	private int minimum;
	private int maximum;	
	private int otherData; // no esta definida como propiedd pero no pasa nada. Su valor sera 0.
}
