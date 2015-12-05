package org.free.de.ji.core._000.imple._000._alpha.g;

import org.free.de.ji.core._000.dao._000._alpha.s.S_D_en;
import org.free.de.ji.core._000.dao._000._alpha.v.Visit_D_en;
import org.free.de.ji.core._000.imple._000._alpha.e.Exist_H_en;
import org.free.de.ji.core._000.imple._000._alpha.s.SystemPrint_H_en;
import org.free.de.ji.core._000.interf._000.a.Activate_enI;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;
import org.free.de.ji.core._000.interf._000.g.Generate_enI;
import org.free.de.ji.core._000.interf._000.g.GetJavaNameOfTypeLower_enI;
import org.free.de.ji.core._000.interf._000.i.Init_enI;
import org.free.de.ji.core._000.interf._000.t.Test_enI;

public class GenerateFromExist_H_en 
extends SystemPrint_H_en
implements Generate_enI,Init_enI,Test_enI
,GetJavaNameOfTypeLower_enI
{
	protected S_D_en s_D_en = new S_D_en(); 
	
	public static void main(String[] args) { new GenerateFromExist_H_en().activate(); }
	
	@Override
	public Alpha_enI generate() {
		System.out.println(s_D_en.getS()+"!");
		return getAlpha();
	}

	@Override
	public Alpha_enI init() {
		super.init();
		s_D_en.setS("Test");
		System.out.println(
				generateGetJavaNameOfTypeLower( (String) s_D_en.getS() )
				);
		return getAlpha();
	}

	@Override
	public Alpha_enI test() {	
		return generate();
	}

	@Override
	public String generateGetJavaNameOfTypeLower(String s) {
		//System.out.println(s.substring(1));
		//System.out.println(s.substring(0,1).toLowerCase());
		return s.substring(0,1).toLowerCase()+s.toLowerCase().substring(1);
	}


}
