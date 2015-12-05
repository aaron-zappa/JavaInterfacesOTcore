package org.free.de.ji.core._000.imple._000._alpha.m;

import org.free.de.ji.core._000.imple._000._alpha.n.New_H_en;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;

public class Main_H_en 
extends New_H_en 

//_.dao._000._alpha.a.Alpha_D_en
//_.imple._000._alpha.a.Alpha_H_en

implements 
org.free.de.ji.core._000.interf._000.m.Main_enI
,org.free.de.ji.core._000.interf._000.t.Test_enI
,org.free.de.ji.core._000.interf._000.i.Init_enI
,org.free.de.ji.core._000.interf._000.a.Activate_enI

{
	
	public static void main(String[] args) { new Main_H_en().activate(); }
	
	@Override
	public Alpha_enI test() {
		System.out.println(1+" "+getAlpha());
		super.setAlpha( (Alpha_enI) this);
		System.out.println(2+" "+getAlpha());
		return getAlpha();
	}
	@Override
	public Alpha_enI init() {
		super.setAlpha( (Alpha_enI) this);
		return getAlpha();
	}
	@Override
	public Alpha_enI activate() {
		test();
		init();
		return getAlpha();
	}

}
