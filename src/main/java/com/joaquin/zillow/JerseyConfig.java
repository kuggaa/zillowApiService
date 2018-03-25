package com.joaquin.zillow;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.joaquin.zillow.controller.ZillowController;

@Component
@ApplicationPath("/api")
public class JerseyConfig extends ResourceConfig {
	public JerseyConfig() {
		register(ZillowController.class);
	}
}
