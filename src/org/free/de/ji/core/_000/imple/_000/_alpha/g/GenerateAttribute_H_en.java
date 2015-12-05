package org.free.de.ji.core._000.imple._000._alpha.g;


import org.free.de.ji.core._000.interf._000.a.Activate_enI;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;
import org.free.de.ji.core._000.interf._000.g.Generate_enI;
import org.free.de.ji.core._000.interf._000.i.Init_enI;
import org.free.de.ji.core._000.interf._000.t.Test_enI;

public class GenerateAttribute_H_en 
extends GenerateSetter_H_en
implements Generate_enI,Init_enI,Activate_enI
{
	// example: protected O_D_en o_D_en = new O_D_en(); 
	
	public static void main(String[] args) { new GenerateAttribute_H_en().activate(); }
	
	@Override
	public Alpha_enI generate() {
		System.out.println(s_D_en.getS()+"!!");
		return getAlpha();
	}

	@Override
	public Alpha_enI init() {
		super.init();
		s_D_en.setS("Text");
		
		System.out.println(s_D_en.getS()+"_x");
		return getAlpha();
	}

//	@Override public Alpha_enI activate() { return init(); }


}
