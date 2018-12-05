package org.mac.docapi.v2.entity.configuration;

import java.util.List;

public interface ConfigurableFeature {
	ServerConfigurable getServerConfigurable();
	SchemaConfigurable getSchemaConfigurable();
	List<UserFunctionConfigurable> getUserFunctionConfigurables();
	void addUserFunctionConfigurable(UserFunctionConfigurable userFunctionConfigurable);

}