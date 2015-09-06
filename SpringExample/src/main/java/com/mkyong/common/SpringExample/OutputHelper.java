package com.mkyong.common.SpringExample;

import com.mkyong.common.SpringExample.intf.IOutputGenerator;

public class OutputHelper {
	IOutputGenerator ioutputGenerator;

	public void generateOutput() {
		ioutputGenerator.generateOutput();
	}

	public void setIoutputGenerator(IOutputGenerator ioutputGenerator) {
		this.ioutputGenerator = ioutputGenerator;
	}

	
}
