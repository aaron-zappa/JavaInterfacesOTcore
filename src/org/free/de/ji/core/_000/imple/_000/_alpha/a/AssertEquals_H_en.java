package org.free.de.ji.core._000.imple._000._alpha.a;

//later junit Adapter
//import org.junit.Test;
//import static org.junit.Assert.*;


import org.free.de.ji.core._000.dao._000._alpha.c.ClassOT_Current_D_en;
import org.free.de.ji.core._000.imple._000._alpha.e.Exist_H_en;
import org.free.de.ji.core._000.imple._000._alpha.m.Main_H_en;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;
import org.free.de.ji.core._000.interf._000.a.AssertEqualsOP2_enI;
import org.free.de.ji.core._000.java.help.const_.InObject_C_enI;
import org.free.de.ji.core._000.java.help.const_.ProgressLetterDot_C_enI;
import org.free.de.ji.core._000.java.help.const_._alpha.c.CsvDelimiter_C_enI;
import org.free.de.ji.core._000.java.help.const_._alpha.l.LogWarning_1Letter_C_enI;



public class AssertEquals_H_en
extends Exist_H_en

//_.dao._000._alpha.a.Alpha_D_en
//_.imple._000._alpha.a.Alpha_H_en

implements 
org.free.de.ji.core._000.interf._000.m.Main_enI
,org.free.de.ji.core._000.interf._000.t.Test_enI
,org.free.de.ji.core._000.interf._000.i.Init_enI
,org.free.de.ji.core._000.interf._000.a.Activate_enI
,org.free.de.ji.core._000.interf._000.a.Assert_P2_enI
,org.free.de.ji.core._000.interf._000.j.JuTest_enI
//,_000.interf._000.a.AssertEqualsOP2_enI
,AssertEqualsOP2_enI
,LogWarning_1Letter_C_enI
,CsvDelimiter_C_enI
,InObject_C_enI
,ProgressLetterDot_C_enI
{
	
	public static void main(String[] args) { new AssertEquals_H_en().activate(); }

	ClassOT_Current_D_en classOT_Current_D_en = new ClassOT_Current_D_en();
	
	@Override
	public Alpha_enI activate() {
		classOT_Current_D_en.setClassOT_current(this);
		init().test();
		return getAlpha();
	}

	@Override
	public Alpha_enI test() {
		assertEquals(null, null);
		assertEquals(null, "");
		return getAlpha();
	}

//later junit Adapter
//@Test
	@Override
	public Alpha_enI assert_(Object expected, Object actual) {
		assertEquals(expected,actual);
		return getAlpha();
	}
	@Override

	public Alpha_enI juTest() {
		assert_(exist_D_en.newBoolean(exist_D_en.isExist()),exist_D_en.newBoolean(true));
		return getAlpha();
	}

	@Override
	public Alpha_enI assertEquals(Object expected, Object actual) {
		boolean ok=false;
		if (expected==null){
			if (actual==null) ok=true;
		} else {
			ok = expected.equals(actual);
		}
		if (!ok) {
			println(logW1Letter+csvDelimiter+inObject+classOT_Current_D_en.getClassOT_current());
		} else
			print(progressLetter);
		return getAlpha();
	}


}
