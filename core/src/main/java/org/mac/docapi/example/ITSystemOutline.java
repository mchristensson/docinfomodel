package org.mac.docapi.example;

import java.util.LinkedList;
import java.util.List;

import org.mac.docapi.outline.Chapter;
import org.mac.docapi.outline.InformationContainer;
import org.mac.docapi.outline.Outline;

public class ITSystemOutline implements Outline {
	private LinkedList<Chapter> chapters = new LinkedList<>();
	private InformationContainer container;

	@Override
	public void addChapter(Chapter chapter) {
		this.chapters.add(chapter);
	}

	@Override
	public void setInformationContainer(InformationContainer container) {
		this.container = container;
	}

	@Override
	public List<Chapter> getChapters() {
		return this.chapters;
	}

	@Override
	public InformationContainer getInformationContainer() {
		return container;
	}
}