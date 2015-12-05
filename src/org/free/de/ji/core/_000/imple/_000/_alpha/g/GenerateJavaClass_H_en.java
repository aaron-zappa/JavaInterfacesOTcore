package org.free.de.ji.core._000.imple._000._alpha.g;

import org.free.de.ji.core._000.dao._000._alpha.n.Name_D_en;
import org.free.de.ji.core._000.interf._000.a.Activate_enI;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;
import org.free.de.ji.core._000.interf._000.b.BeforeInit_enI;
import org.free.de.ji.core._000.interf._000.e.Execute_enI;
import org.free.de.ji.core._000.interf._000.i.Init_enI;
import org.free.de.ji.core._000.interf._000.t.Test_enI;
import org.free.de.ji.core._000.java.keyword._alpha.c.Class_C_enI;
import org.free.de.ji.core._000.java.keyword._alpha.p.Public_C_enI;
import org.free.de.ji.core._000.sym._alpha.b.BracketCloseCurlySym_enI;
import org.free.de.ji.core._000.sym._alpha.b.BracketOpenCurlySym_enI;

public class GenerateJavaClass_H_en 
extends GenerateAttribute_H_en
implements Init_enI,Test_enI,Execute_enI,Activate_enI,BeforeInit_enI
//Constants
,Class_C_enI
,BracketOpenCurlySym_enI
,BracketCloseCurlySym_enI
{
	protected Name_D_en name_D_en = new Name_D_en();

	public static void main(String[] args) { new GenerateJavaClass_H_en().activate(); }	
	
	@Override
	public Alpha_enI test() {
		execute();
		return getAlpha();
	}

	@Override
	public Alpha_enI init() {
		super.init();
		super.execute();
		name_D_en.setName(typ_D_en.getS());
		return getAlpha();
	}

	@Override
	public Alpha_enI execute() {
		println(Public_C_enI.visibility+blank+class_+blank+name_D_en.getName()+blank 
				+openCurly+BracketCloseCurlySym_enI.closeCurly
				);
		return getAlpha();
	}

	@Override
	public Alpha_enI activate() {
		beforeInit();init();execute();
		return null;
	}

	@Override
	public Alpha_enI beforeInit() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
