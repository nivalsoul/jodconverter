package org.artofsolving.jodconverter;

import java.io.File;
import java.io.IOException;

public class A {

	public static void main(String[] args) throws IOException {
		//File.createTempFile("test", ".pdf", new File("F:\\test"));
		File file = new File("F:\\test\\t1.pdf");
		file.createNewFile();
	}

}
