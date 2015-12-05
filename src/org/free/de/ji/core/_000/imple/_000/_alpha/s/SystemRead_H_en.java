package org.free.de.ji.core._000.imple._000._alpha.s;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.free.de.ji.core._000.dao._000._alpha.l.Line_D_en;
import org.free.de.ji.core._000.dao._000._alpha.s.S_D_en;
import org.free.de.ji.core._000.dao._000._alpha.s.StringArr_D_en;
import org.free.de.ji.core._000.imple._000._alpha.r.ReadNormal_H_en;
import org.free.de.ji.core._000.interf._000.a.Activate_enI;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;
import org.free.de.ji.core._000.interf._000.e.Execute_enI;
import org.free.de.ji.core._000.interf._000.i.Init_enI;
import org.free.de.ji.core._000.interf._000.t.Test_enI;

public class SystemRead_H_en 
extends ReadNormal_H_en
implements Test_enI,Init_enI,Execute_enI ,Activate_enI
{	
	//DAOs begin
	StringArr_D_en 	stringArr_D_en	= new StringArr_D_en();
	S_D_en 			prompt 			= new S_D_en();
	Line_D_en 		line  			= new Line_D_en();
	//DAOs end

	BufferedReader bufferedReader =null;
	
	public SystemRead_H_en(String[] args2) {
		stringArr_D_en.setStringArr(args2);
	}

	public static void main(String[] args) { new SystemRead_H_en(args).activate(); }
	
	@Override
	public Alpha_enI test() {
		 
		 if (false) {	
		print(prompt.getS());
		line.setLine(readLine(bufferedReader));	
		println("x:"+line);
		 } else
			 execute();  
		return getAlpha();
	}



	@Override
	public Alpha_enI init() {
		prompt.setS(">"); // _.sym._alpha.g.GreaterThanSym_enI.symbol);
		
	    InputStreamReader isr = new InputStreamReader(System.in);
	    bufferedReader = new BufferedReader(isr);
	    line.setLine("");
		return getAlpha();
	}

	@Override
	public Alpha_enI activate() {
		init();test();
		return getAlpha();
	}

	@Override
	public Alpha_enI execute() {
		while (!line.getLine().equals("q")){
			print(prompt.getS());
			line.setLine(readLine(bufferedReader));
			println("x:"+line.getS());
		}
		return getAlpha();
	}
}
