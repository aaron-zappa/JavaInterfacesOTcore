package org.free.de.ji.core._000.imple._000._alpha.e;

import org.free.de.ji.core._000.dao._000._alpha.e.Exist_D_en;
import org.free.de.ji.core._000.imple._000._alpha.m.Main_H_en;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;

public class Exist_H_en 
extends Main_H_en 

implements 
org.free.de.ji.core._000.interf._000.t.Test_enI
,org.free.de.ji.core._000.interf._000.i.Init_enI
,org.free.de.ji.core._000.interf._000.a.Activate_enI
{
	protected Exist_D_en exist_D_en = new Exist_D_en();

	public static void main(String[] args) { new Exist_H_en().activate(); }
	
	@Override
	public Alpha_enI test() {
		exist_D_en.setExist(getAlpha()!=null);
		System.out.println("Alpha Methoden Hülle existiert:"+exist_D_en.isExist());
		return getAlpha();
	}

	@Override
	public Alpha_enI init() {
		super.init();
		return getAlpha();
	}

	@Override
	public Alpha_enI activate() {
		init().test();
		return getAlpha();
	} 
	
}
