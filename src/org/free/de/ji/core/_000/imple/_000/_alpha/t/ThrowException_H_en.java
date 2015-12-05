package org.free.de.ji.core._000.imple._000._alpha.t;

import org.free.de.ji.core._000.imple._000._alpha.s.SystemPrint_H_en;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;
import org.free.de.ji.core._000.interf._000.t.ThrowException_enI;

public class ThrowException_H_en 
extends SystemPrint_H_en
implements ThrowException_enI
{

	@Override
	public Alpha_enI ThrowException(Exception e) throws Exception {
		throw e;
	}


	//	return getAlpha();
	

}
