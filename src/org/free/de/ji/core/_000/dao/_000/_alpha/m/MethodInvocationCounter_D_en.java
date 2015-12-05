//markAs noAutomaticGeneration
package org.free.de.ji.core._000.dao._000._alpha.m;

import org.free.de.ji.core._000.dao._000._alpha.c.CounterOneStepChange_enI;

public class MethodInvocationCounter_D_en 
extends org.free.de.ji.core._000.dao._000._alpha.a.Alpha_D_en
implements 
MethodInvocationCounter_D_enI
,CounterOneStepChange_enI
{
long methodInvocationLCounter=0;

public long getMethodInvocationLCounter() {
	return methodInvocationLCounter;
}

public org.free.de.ji.core._000.interf._000.a.Alpha_enI setMethodInvocationLCounter(long methodInvocationLCounter) {
	this.methodInvocationLCounter = methodInvocationLCounter;
	return getAlpha();
}

public org.free.de.ji.core._000.interf._000.a.Alpha_enI dec(){
	methodInvocationLCounter--;
	return getAlpha();
}

public org.free.de.ji.core._000.interf._000.a.Alpha_enI inc(){
	methodInvocationLCounter++;
	return getAlpha();
}
// Additional Methods in
}
