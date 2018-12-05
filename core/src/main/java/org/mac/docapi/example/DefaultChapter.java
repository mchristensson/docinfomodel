package org.mac.docapi.example;

import org.mac.docapi.outline.Chapter;
import org.mac.docapi.outline.DispositionBuilder;

public class DefaultChapter implements Chapter {
	private String heading;
	private DispositionBuilder dispositionBuilder;

	@Override
	public void setHeading(String heading) {
		this.heading = heading;
	}

	@Override
	public String getHeading() {
		return this.heading;
	}

	@Override
	public void setDispositionbuilder(DispositionBuilder dispositionBuilder) {
		this.dispositionBuilder = dispositionBuilder;
	}

	@Override
	public DispositionBuilder getDispositionBuilder() {
		return this.dispositionBuilder;
	}
}