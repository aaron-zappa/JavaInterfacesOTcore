package org.free.de.ji.core._000.imple._000._alpha.g;

import org.free.de.ji.core._000.dao._000._alpha.s.S_D_en;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;
import org.free.de.ji.core._000.interf._000.e.Execute_enI;
import org.free.de.ji.core._000.interf._000.i.Init_enI;
import org.free.de.ji.core._000.interf._000.t.Test_enI;
import org.free.de.ji.core._000.java.help.const_._alpha.a.AlphaInterfaceTag_C_enI;
import org.free.de.ji.core._000.java.keyword._alpha.p.Public_C_enI;
import org.free.de.ji.core._000.java.tag._alpha.g.GetTag_enI;
import org.free.de.ji.core._000.sym._alpha.b.Blank_enI;
import org.free.de.ji.core._000.sym._alpha.b.BracketCloseSym_enI;
import org.free.de.ji.core._000.sym._alpha.b.BracketOpenSym_enI;
import org.free.de.ji.core._000.sym._alpha.s.StatementDelimiterInJava_enI;

public class GenerateGetter_00_H 
extends GenerateFromExist_H_en
implements Init_enI
,Test_enI
,Execute_enI
//Constants
,AlphaInterfaceTag_C_enI
,org.free.de.ji.core._000.java.help.const_._alpha.d.DAO_Postfix_enI
,GetTag_enI
,Blank_enI
,BracketOpenSym_enI
,BracketCloseSym_enI
,Public_C_enI
,StatementDelimiterInJava_enI
{
	protected S_D_en s_D_en   = new S_D_en(); 
	protected S_D_en typ_D_en = new S_D_en(); 

	public static void main(String[] args) { new GenerateGetter_00_H().activate(); }	

	@Override
	public Alpha_enI init() {
		s_D_en.setS("Text");
		typ_D_en.setS("String");
		return getAlpha();
	}

	@Override
	public Alpha_enI test() {
		execute();
		return getAlpha();
	}

	@Override
	public Alpha_enI execute() {
		s_D_en.setS(visibility+blank
				+typ_D_en.getS()+blank
				+GetTag_enI.tag+s_D_en.getS()
				//+DAO_Postfix_enI.dAO_Postfix+
		+bracketOpenSym
		+bracketCloseSym);
		
		println(s_D_en.getS());
		return getAlpha();
	}

}
