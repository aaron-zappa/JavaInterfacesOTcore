package org.free.de.ji.core._000.imple._000._alpha.c;

import org.free.de.ji.core._000.imple._000._alpha.s.SystemPrint_H_en;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;
import org.free.de.ji.core._000.interf._000.c.CatchException_enI;

public class CatchExceptionOT_empty_H_en 
extends
SystemPrint_H_en
implements
CatchException_enI
{
	@Override
	public Alpha_enI catchException(Exception e) {
		return getAlpha();
	}

}
