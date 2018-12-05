package org.mac.docapi.v2.entity.app.function;

import java.util.Collection;
import java.util.Map;

import org.mac.docapi.v2.entity.content.WithAbstract;
import org.mac.docapi.v2.entity.responsibility.ApplicationRole;

public interface UserFunction extends WithAbstract {
	String getFunctionName();
	Map<ApplicationRole, Collection<String>> getAccess();
}
