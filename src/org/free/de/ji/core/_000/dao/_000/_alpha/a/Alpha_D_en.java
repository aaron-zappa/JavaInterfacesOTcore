package org.free.de.ji.core._000.dao._000._alpha.a;

import org.free.de.ji.core._000.interf._000.a.Alpha_enI;

// we decided to use only interfaces here and the name reduction 
// Alpha_enI => alfa
// if later on classes are needed, they should be marked with alphaC

public class Alpha_D_en 
//extends _.imple._000._alpha.a.Alpha_H_en
implements org.free.de.ji.core._000.dao._000._alpha.o.O_D_enI
{
	Object o=null;
	
	org.free.de.ji.core._000.interf._000.a.Alpha_enI alpha = null;

	public org.free.de.ji.core._000.interf._000.a.Alpha_enI getAlpha() {
		return alpha;
	}

	public org.free.de.ji.core._000.interf._000.a.Alpha_enI setAlpha(org.free.de.ji.core._000.interf._000.a.Alpha_enI alpha) {
		this.alpha = alpha;
		return getAlpha();
	}

	@Override
	public Object getO() {
		// TODO Auto-generated method stub
		return o;
	}

	@Override
	public Alpha_enI setO(Object o) {
		this.o=o;
		return getAlpha();
	}
}
