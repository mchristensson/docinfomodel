package org.mac.docapi.v2.entity.technology;

import org.mac.docapi.v2.entity.configuration.IntegrationConfigurable;

interface IntegrationUseCase extends IntegrationConfigurable {
	IntegrationEntity getIntegrationEntity();
}