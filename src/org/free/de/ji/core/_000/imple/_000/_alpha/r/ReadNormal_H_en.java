package org.free.de.ji.core._000.imple._000._alpha.r;

import java.io.BufferedReader;
import java.io.IOException;



import org.free.de.ji.core._000.imple._000._alpha.s.SystemPrint_H_en;
import org.free.de.ji.core._000.interf._000.r.ReadLine_enI;


public class ReadNormal_H_en 
extends 	SystemPrint_H_en
implements 	ReadLine_enI
{

	@Override
	public String readLine(BufferedReader bufferedReader) {
		String s=null;
		try {
			s = bufferedReader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			exit();
		}
		return s;
	}

	private void exit() {
		System.exit(0);		
	}


	
}
