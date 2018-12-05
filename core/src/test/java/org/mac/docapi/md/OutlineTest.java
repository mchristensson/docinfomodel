package org.mac.docapi.md;

import org.junit.Test;
import org.mac.docapi.example.AuthenticationDisposition;
import org.mac.docapi.example.DefaultApplication;
import org.mac.docapi.example.DefaultChapter;
import org.mac.docapi.example.DefaultMarkDownPrinter;
import org.mac.docapi.example.ITSystemOutline;
import org.mac.docapi.example.LoginFunction;
import org.mac.docapi.example.app.function.GenericFunction;
import org.mac.docapi.example.sys.function.GenericSystemFunction;
import org.mac.docapi.outline.Chapter;
import org.mac.docapi.outline.DispositionBuilder;
import org.mac.docapi.outline.Outline;
import org.mac.docapi.outline.out.OutlinePrinter;
import org.mac.docapi.v2.entity.Application;
import org.mac.docapi.v2.entity.configuration.UserFunctionConfigurable;
import org.mac.docapi.v2.entity.technology.TechnicalFunction;



public class OutlineTest {

	@Test
	public void testOutline() throws Exception {

		// Information model
		Application container = new DefaultApplication();
		
		GenericFunction loginFunction = new GenericFunction();
		loginFunction.setAbstractText("Hello World");
		
		UserFunctionConfigurable authenticationConfigurable = new LoginFunction();
		authenticationConfigurable.setUserFunction(loginFunction);
		
		TechnicalFunction authenticationFunction = new GenericSystemFunction();
		authenticationFunction.addUserFunctionConfigurable(authenticationConfigurable);
		
		container.addEntity(TechnicalFunction.LABEL_AUTHENTICATION, authenticationFunction);
		
		
	    Outline outline = new ITSystemOutline();
		outline.setInformationContainer(container);
	    
	    Chapter authenticationChapter = new DefaultChapter();
		authenticationChapter.setHeading("Authentication");
		outline.addChapter(authenticationChapter);
	    DispositionBuilder cdb = new AuthenticationDisposition();
	    authenticationChapter.setDispositionbuilder(cdb);
	    
	    
	    OutlinePrinter op = new DefaultMarkDownPrinter();
	    op.write(outline);
	}
}
