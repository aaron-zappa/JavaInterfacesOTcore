package org.free.de.ji.core._000.imple._000._alpha.r;

import java.util.Random;

import org.free.de.ji.core._000.imple._000._alpha.s.SystemPrint_H_en;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;
import org.free.de.ji.core._000.interf._000.i.Init_enI;

public class Random_H_en 
extends SystemPrint_H_en 
implements Init_enI
{
	public static void main(String[] args) { new Random_H_en().activate(); }
	
	@Override
	public Alpha_enI init() {
		Random random = new Random();
		return getAlpha();
	}

}
