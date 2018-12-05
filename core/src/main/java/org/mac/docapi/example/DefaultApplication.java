package org.mac.docapi.example;

import java.util.HashMap;
import java.util.Map;

import org.mac.docapi.v2.entity.Application;
import org.mac.docapi.v2.entity.technology.TechnicalFunction;

public class DefaultApplication implements Application {
	private Map<String, TechnicalFunction> entities = new HashMap<>();

	@Override
	public Map<String, TechnicalFunction> getEntities() {
		return this.entities;
	}

	@Override
	public void addEntity(String key, TechnicalFunction entity) {
		this.entities.put(key, entity);
	}
}