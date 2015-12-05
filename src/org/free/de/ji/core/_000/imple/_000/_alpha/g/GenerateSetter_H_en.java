package org.free.de.ji.core._000.imple._000._alpha.g;

import org.free.de.ji.core._000.interf._000.a.Alpha_enI;
import org.free.de.ji.core._000.interf._000.e.Execute_enI;
import org.free.de.ji.core._000.interf._000.i.Init_enI;
import org.free.de.ji.core._000.java.tag._alpha.g.GetTag_enI;
import org.free.de.ji.core._000.java.tag._alpha.s.SetTag_enI;

public class GenerateSetter_H_en 
extends GenerateGetter_00_H
implements Execute_enI
,org.free.de.ji.core._000.java.help.const_._alpha.a.AlphaInterfaceTag_C_enI
,Init_enI
{
	@Override
	public Alpha_enI init() {
		s_D_en.setS("File");
		return getAlpha();
	}
	@Override
	public Alpha_enI execute() {
		s_D_en.setS(visibility+blank
				+alphaInterface
				+blank+SetTag_enI.tag
				+s_D_en.getS()
				//+DAO_Postfix_enI.dAO_Postfix+
		+bracketOpenSym
		+typ_D_en.getS()
		+blank
		+generateGetJavaNameOfTypeLower(s_D_en.getS())
		+bracketCloseSym);
		
		println(s_D_en.getS());
		return getAlpha();
	}

}
