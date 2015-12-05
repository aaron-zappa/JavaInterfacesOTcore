package org.free.de.ji.core._000.imple._000._alpha.p;

import org.free.de.ji.core._000.imple._000._alpha.s.SystemPrint_H_en;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;
import org.free.de.ji.core._000.interf._000.i.Init_enI;
import org.free.de.ji.core._000.interf._000.t.Test_enI;
import org.free.de.ji.core._000.java.tag._alpha.c.CommentTagForLineInJava_enI;

public class ProgramPartCommentDelimiter_H_en 
extends SystemPrint_H_en
implements Init_enI 
,Test_enI
,CommentTagForLineInJava_enI
{
	public static void main(String[] args) { new ProgramPartCommentDelimiter_H_en().activate(); }
	
	@Override
	public Alpha_enI test() {
		return getAlpha();
	}

	@Override
	public Alpha_enI init() {
		println(commentTagInJava);
		return null;
	}

}
