package org.free.de.ji.core._000.imple._000._alpha.a;

import org.free.de.ji.core._000.dao._000._alpha.m.MethodOT_Current_D_en;
import org.free.de.ji.core._000.imple._000._alpha.g.GenerateJavaClass_H_en;
import org.free.de.ji.core._000.imple._000._alpha.s.SystemPrint_H_en;
import org.free.de.ji.core._000.interf._000.a.Activate_enI;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;

public class GetMethodName_H_en 
extends SystemPrint_H_en
implements Activate_enI
{
	public static void main(String[] args) { new GetMethodName_H_en().activate(); }	
	
	MethodOT_Current_D_en methodOT_Current_D_en = new MethodOT_Current_D_en();
	
	boolean local=true; //false;
 
    @Override
	public Alpha_enI activate() {
    StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
    StackTraceElement e = stacktrace[1];//coz 0th will be getStackTrace so 1st
    String methodName = e.getMethodName();
    if (local){
    	System.out.println(methodName);
    } else {
    	methodOT_Current_D_en.setMethodOT_current(methodName);
    }
    return null;
	}

}
