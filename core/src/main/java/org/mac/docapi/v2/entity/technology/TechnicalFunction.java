package org.mac.docapi.v2.entity.technology;

import org.mac.docapi.v2.entity.configuration.ConfigurableFeature;
import org.mac.docapi.v2.entity.configuration.UserFunctionConfigurable;
import org.mac.docapi.v2.entity.content.WithAbstract;
import org.mac.docapi.v2.entity.deployment.DeployableFeature;

public interface TechnicalFunction extends DeployableFeature, ConfigurableFeature, WithAbstract {

	public static final String LABEL_AUTHENTICATION = "app.sys.function.authentication"; 
	
}