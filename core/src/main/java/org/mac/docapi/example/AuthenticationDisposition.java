package org.mac.docapi.example;

import org.mac.docapi.outline.DispositionBuilder;
import org.mac.docapi.outline.InformationContainer;
import org.mac.docapi.outline.out.MarkDownPrinter;
import org.mac.docapi.outline.out.OutlinePrinter;
import org.mac.docapi.v2.entity.Application;
import org.mac.docapi.v2.entity.app.function.UserFunction;
import org.mac.docapi.v2.entity.configuration.SchemaConfigurable;
import org.mac.docapi.v2.entity.configuration.ServerConfigurable;
import org.mac.docapi.v2.entity.configuration.UserFunctionConfigurable;
import org.mac.docapi.v2.entity.technology.TechnicalFunction;

import net.steppschuh.markdowngenerator.text.Text;
import net.steppschuh.markdowngenerator.text.emphasis.ItalicText;
import net.steppschuh.markdowngenerator.text.heading.Heading;

public class AuthenticationDisposition implements DispositionBuilder {
	@Override
	public void build(StringBuilder printer, InformationContainer informationContainer) {
		
		Application appl = (Application) informationContainer;
		TechnicalFunction function = appl.getEntities().get(TechnicalFunction.LABEL_AUTHENTICATION);
		
		//Configurability
		printer.append(new Heading("Configurability", 2)).append("\n");
		
		//User functions - level 2
		printer.append(new Heading("User functions", 3)).append("\n");
		if (!function.getUserFunctionConfigurables().isEmpty()) {
			function.getUserFunctionConfigurables().stream().forEach(uf -> {
				UserFunction userFunction = uf.getUserFunction();
				printer.append(new Heading(userFunction.getFunctionName(), 3)).append("\n");
				printer.append(new Text(userFunction.getAbstractText().getText())).append("\n");
			});
		} else {
			printer.append(new ItalicText("No assigned user-functions")).append("\n");
		}
		
		
		
		//Configurability through database - level 3
		if (function.getSchemaConfigurable() != null) {
			printer.append(new Heading("Configurability through database", 3)).append("\n");
				SchemaConfigurable cfg = function.getSchemaConfigurable();
				printer.append(new Text(cfg.getAbstractText().getText())).append("\n");
		} 
		
		//Configuration on application server
		if (function.getSchemaConfigurable() != null) {
			printer.append(new Heading("Configurables on application server", 3)).append("\n");
				ServerConfigurable cfg = function.getServerConfigurable();
				printer.append(new Text(cfg.getAbstractText().getText())).append("\n");
		} 
		
		
		
		
		
	}
}