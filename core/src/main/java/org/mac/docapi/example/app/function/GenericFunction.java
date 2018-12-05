package org.mac.docapi.example.app.function;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.mac.docapi.v2.entity.app.function.UserFunction;
import org.mac.docapi.v2.entity.content.TextSection;
import org.mac.docapi.v2.entity.responsibility.ApplicationRole;

public class GenericFunction implements UserFunction {

	private String functionName;
	private TextSection abstractText;
	private final Map<ApplicationRole, Collection<String>> accessMap;
	
	public GenericFunction() {
		this.accessMap = new HashMap<>();
	}
	
	public void setFunctionName(String functionName) {
		this.functionName = functionName;
	}

	public void setAbstractText(TextSection abstractText) {
		this.abstractText = abstractText;
	}

	@Override
	public TextSection getAbstractText() {
		return this.abstractText;
	}

	@Override
	public String getFunctionName() {
		return functionName;
	}

	@Override
	public Map<ApplicationRole, Collection<String>> getAccess() {
		return this.accessMap;
	}
	
	public void addAccessPattern(ApplicationRole role, String... label) {
		Collection<String> labels = Arrays.asList(label);
		if (!this.accessMap.containsKey(role)) {
			this.accessMap.put(role, labels);
		} else {
			this.accessMap.get(role).addAll(Arrays.asList(label));
		}
	}

	public void setAbstractText(String text) {
		TextSection sect = new TextSection() {

			private
			String text;
			@Override
			public void setText(String text) {
				this.text = text;
			}

			@Override
			public String getText() {
				return this.text;
			}
			
		};
		this.setAbstractText(sect);
	}


}
