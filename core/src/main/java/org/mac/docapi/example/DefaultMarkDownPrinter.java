package org.mac.docapi.example;

import org.mac.docapi.outline.Chapter;
import org.mac.docapi.outline.Outline;
import org.mac.docapi.outline.out.MarkDownPrinter;

import net.steppschuh.markdowngenerator.text.Text;
import net.steppschuh.markdowngenerator.text.emphasis.BoldText;
import net.steppschuh.markdowngenerator.text.emphasis.ItalicText;
import net.steppschuh.markdowngenerator.text.emphasis.StrikeThroughText;
import net.steppschuh.markdowngenerator.text.heading.Heading;

public class DefaultMarkDownPrinter implements MarkDownPrinter {

	@Override
	public void write(Outline outline) {
		outline.getChapters().stream().forEachOrdered(c -> printChapter(outline, c));

	}

	private void printChapter(Outline outline, Chapter c) {
		StringBuilder sb = new StringBuilder()
	            .append(new Heading(c.getHeading(), 1)).append("\n");

c.getDispositionBuilder().build(sb, outline.getInformationContainer());
		

	    System.out.println(sb);
	}

}
