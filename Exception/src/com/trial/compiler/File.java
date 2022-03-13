package com.trial.compiler;

import java.io.*;

public class File {
	public static void main(String[] args) throws Exception {
		FileInputStream fis=null;
		fis=new FileInputStream("B:/browser.txt");
		int m;
		while((m=fis.read()) !=-1) {
			System.out.println((char)m);
			}
		fis.close();
	}

}
