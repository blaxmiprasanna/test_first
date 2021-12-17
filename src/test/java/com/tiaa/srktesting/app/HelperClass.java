package com.tiaa.srktesting.app;

public class HelperClass {

	// static InvokeBrowser invokeBrowser;
	// static ReadPropertyFile readPropFile;

	// public InvokeBrowser getBrowser() {
	//
	// return invokeBrowser = new InvokeBrowser();
	// }

	public static ReadPropertyFile getPropertyFileData() throws Exception {
		ReadPropertyFile readPropFile = new ReadPropertyFile();
		return readPropFile;
	}

}
