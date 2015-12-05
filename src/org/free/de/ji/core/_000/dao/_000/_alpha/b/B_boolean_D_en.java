package org.free.de.ji.core._000.dao._000._alpha.b;

public class B_boolean_D_en 
extends org.free.de.ji.core._000.dao._000._alpha.a.Alpha_D_en

implements B_boolean_D_enI

{
boolean boolean_ = false;

public boolean isBoolean_() {
	return boolean_;
}

public org.free.de.ji.core._000.interf._000.a.Alpha_enI setBoolean_(boolean boolean_) {
	this.boolean_ = boolean_;
	return getAlpha();
}

@Override
public Boolean newBoolean(boolean boolean_) {
	// TODO Auto-generated method stub
	return new Boolean(boolean_);
}
}
