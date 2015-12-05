package org.free.de.ji.core._000.imple._000._alpha.e;

import org.free.de.ji.core._000.dao._000._alpha.s.S_D_en;
import org.free.de.ji.core._000.imple._000._alpha.m.Main_H_en;
import org.free.de.ji.core._000.imple._000._alpha.s.SystemPrint_H_en;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;
import org.free.de.ji.core._000.interf._000.e.Execute_enI;
import org.free.de.ji.core._000.interf._000.i.Init_enI;
import org.free.de.ji.core._000.interf._000.t.Test_enI;

public class _01_ExampleExecute_H_en 
extends SystemPrint_H_en
implements 
Init_enI
,Execute_enI
,Test_enI
{
	S_D_en s_D1 = new S_D_en(); //String Data access object
	
	public static void main(String[] args) { 
		new _01_ExampleExecute_H_en().activate(); 
	}
	@Override
	public Alpha_enI init() {
		s_D1.setS("Test_H_en");
		return getAlpha();
	}
	@Override
	public Alpha_enI execute() {
		
		s_D1.setS(s_D1.getS().substring(0,1).toLowerCase()+s_D1.getS().substring(1));
		return null;
	}
	@Override
	public Alpha_enI test() {
		execute();
		println(s_D1.getS());
		return getAlpha();
	}
}
