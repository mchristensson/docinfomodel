package org.mac.docapi.example.sys.function;

import java.util.ArrayList;
import java.util.List;

import org.mac.docapi.v2.entity.configuration.SchemaConfigurable;
import org.mac.docapi.v2.entity.configuration.ServerConfigurable;
import org.mac.docapi.v2.entity.configuration.UserFunctionConfigurable;
import org.mac.docapi.v2.entity.content.TextSection;
import org.mac.docapi.v2.entity.technology.TechnicalFunction;

public class GenericSystemFunction implements TechnicalFunction {

	private TextSection abstractText;
	private List<UserFunctionConfigurable> userFunctionConfigurables = new ArrayList<>();

	@Override
	public ServerConfigurable getServerConfigurable() {
		return null;
	}

	@Override
	public SchemaConfigurable getSchemaConfigurable() {
		return null;
	}

	@Override
	public List<UserFunctionConfigurable> getUserFunctionConfigurables() {
		return this.userFunctionConfigurables;
	}

	@Override
	public TextSection getAbstractText() {
		return this.abstractText;
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

	private void setAbstractText(TextSection abstractText) {
		this.abstractText = abstractText;
	}

	@Override
	public void addUserFunctionConfigurable(UserFunctionConfigurable userFunctionConfigurable) {
		this.userFunctionConfigurables.add(userFunctionConfigurable);
		
	}
}
