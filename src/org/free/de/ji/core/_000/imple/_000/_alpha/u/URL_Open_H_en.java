package org.free.de.ji.core._000.imple._000._alpha.u;

import org.free.de.ji.core._000.dao._000._alpha.e.Exist_D_en;
import org.free.de.ji.core._000.dao._000._alpha.u.URL_D_en;
import org.free.de.ji.core._000.imple._000._alpha.m.Main_H_en;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;

public class URL_Open_H_en 
extends org.free.de.ji.core._000.imple._000._alpha.e.Exist_H_en
implements 
org.free.de.ji.core._000.interf._000.t.Test_enI

{
  //protected Exist_D_en exist_D_en = new Exist_D_en();
	protected URL_D_en uRL_D_en = new URL_D_en();

	public static void main(String[] args) { new URL_Open_H_en().activate(); }

	@Override
	public Alpha_enI test() {
		System.out.println("x");
		return getAlpha();
	}
	
}
