package org.mac.docapi.v2.entity.technology;

import org.mac.docapi.v2.entity.configuration.IntegrationConfigurable;
import org.mac.docapi.v2.entity.configuration.SecurityConfiguration;

public interface IntegrationEntity extends TechnicalFunction, IntegrationConfigurable {
	EndPoint getSourceSystem();
	EndPoint getTargetSystem();
	IntegrationInterface getIntegrationInterface();
	SecurityConfiguration getSecurityConfiguration();
}