package org.mac.docapi.v2.entity;

import java.util.Map;

import org.mac.docapi.outline.InformationContainer;
import org.mac.docapi.v2.entity.technology.TechnicalFunction;

public interface Application extends InformationContainer {

	Map<String, TechnicalFunction> getEntities();
	void addEntity(String key, TechnicalFunction entity);
}
