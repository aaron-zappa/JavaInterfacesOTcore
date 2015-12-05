package org.free.de.ji.core._000.dao._000._alpha.v;

import org.free.de.ji.core._000.dao._000._alpha.h.Handler_D_en;
import org.free.de.ji.core._000.interf._000.v.Visit_enI;

public class Visit_D_en 
extends Handler_D_en 

implements Visit_D_enI
{
Visit_enI visit;

public Visit_enI getVisit() {
	return visit;
}

public org.free.de.ji.core._000.interf._000.a.Alpha_enI setVisit(Visit_enI visit) {
	this.visit = visit;
	return getAlpha();
}
}
