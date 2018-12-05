package org.mac.docapi.v2.entity.technology;

import org.mac.docapi.v2.entity.content.HasLabel;
import org.mac.docapi.v2.entity.content.WithAbstract;

public interface IntegrationInterface extends WithAbstract, HasLabel {
	IntegrationInterfaceType getIntegrationInterfaceType();
}
