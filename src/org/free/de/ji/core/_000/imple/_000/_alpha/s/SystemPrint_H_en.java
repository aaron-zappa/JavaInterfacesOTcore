package org.free.de.ji.core._000.imple._000._alpha.s;

import org.free.de.ji.core._000.imple._000._alpha.d.DirectoryVisit_H_en;
import org.free.de.ji.core._000.interf._000.a.Activate_enI;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;
import org.free.de.ji.core._000.interf._000.p.Printer_enI;
import org.free.de.ji.core._000.interf._000.t.Test_enI;

public class SystemPrint_H_en 
extends org.free.de.ji.core._000.dao._000._alpha.a.Alpha_D_en

implements Test_enI
,Printer_enI,Activate_enI
{
	public static void main(String[] args) { new SystemPrint_H_en().activate(); }

	@Override
	public Alpha_enI print(Object o) {
		return print(o.toString());
	}

	@Override
	public Alpha_enI println(Object o) {
		
		return println(o.toString());
	}

	@Override
	public Alpha_enI print(String s) {
		System.out.print(s);
		return  getAlpha();
	}

	@Override
	public Alpha_enI println(String s) {
		// TODO Auto-generated method stub
		print(s);
		print("\n");
		return getAlpha();
	}

	@Override
	public Alpha_enI test() {
		println("test1");
		println("test2");
		println("classname:"+getClass().getCanonicalName());

		return getAlpha();
	}

	@Override
	public Alpha_enI activate() {
		 init();
		 test();
		return getAlpha();
	}

	public Alpha_enI init() {
		// TODO Auto-generated method stub
		return getAlpha();
	}

}
