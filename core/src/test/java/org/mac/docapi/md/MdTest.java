package org.mac.docapi.md;

import static org.junit.Assert.*;

import org.junit.Test;

import net.steppschuh.markdowngenerator.text.Text;
import net.steppschuh.markdowngenerator.text.emphasis.BoldText;
import net.steppschuh.markdowngenerator.text.emphasis.ItalicText;
import net.steppschuh.markdowngenerator.text.emphasis.StrikeThroughText;
import net.steppschuh.markdowngenerator.text.heading.Heading;

public class MdTest {

	
	@Test
	public void example() throws Exception {
	    StringBuilder sb = new StringBuilder()
	            .append(new Heading("Heading", 1)).append("\n")
	    		.append(new Text("I am normal")).append("\n")
	            .append(new BoldText("I am bold")).append("\n")
	            .append(new ItalicText("I am italic")).append("\n")
	            .append(new StrikeThroughText("I am strike-through"));

	    System.out.println(sb);
	}

}
