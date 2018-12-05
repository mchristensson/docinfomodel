package org.mac.docapi.example;

import org.mac.docapi.v2.entity.app.function.UserFunction;
import org.mac.docapi.v2.entity.configuration.UserFunctionConfigurable;
import org.mac.docapi.v2.entity.content.TextSection;
import org.mac.docapi.v2.entity.responsibility.ApplicationRole;

public class LoginFunction implements UserFunctionConfigurable {
	private UserFunction userFunction;

	@Override
	public TextSection getAbstractText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserFunction getUserFunction() {
		return this.userFunction;
	}

	@Override
	public ApplicationRole getRole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setUserFunction(UserFunction userFunction) {
		this.userFunction = userFunction;
	}
}