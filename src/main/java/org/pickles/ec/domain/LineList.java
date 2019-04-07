package org.pickles.ec.domain;

import java.util.ArrayList;
import java.util.List;

public class LineList {

	private List<Line> list;

	public LineList(List<Line> list) {
		this.list = list;
	}

	public LineList() {
		this.list = new ArrayList<>();
	}
}
