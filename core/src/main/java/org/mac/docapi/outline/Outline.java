package org.mac.docapi.outline;

import java.util.List;


public interface Outline {

	void setInformationContainer(InformationContainer container);

	void addChapter(Chapter chapter);

	List<Chapter> getChapters();

	InformationContainer getInformationContainer();


}
