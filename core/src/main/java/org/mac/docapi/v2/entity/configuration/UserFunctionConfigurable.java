package org.mac.docapi.v2.entity.configuration;

import org.mac.docapi.v2.entity.app.function.UserFunction;
import org.mac.docapi.v2.entity.responsibility.ApplicationRole;

/**
 * Entity configurable through user interface by a Role
 * @author magnus
 *
 */
public interface UserFunctionConfigurable extends Configuration {
	ApplicationRole getRole();
	UserFunction getUserFunction();void setUserFunction(UserFunction userFunction);

}
