package org.free.de.ji.core._000.imple._000._alpha.d;

import java.io.File;

import org.free.de.ji.core._000.dao._000._alpha.v.Visit_D_en;
import org.free.de.ji.core._000.imple._000._alpha.m.Main_H_en;
import org.free.de.ji.core._000.interf._000.a.Activate_enI;
import org.free.de.ji.core._000.interf._000.e.Execute_enI;
import org.free.de.ji.core._000.interf._000.i.Init_enI;
import org.free.de.ji.core._000.interf._000.t.Test_enI;
import org.free.de.ji.core._000.interf._000.v.Visit_enI;



public class DirectoryVisit_H_en
extends org.free.de.ji.core._000.imple._000._alpha.e.Exist_H_en
implements Init_enI,Execute_enI,Activate_enI, Test_enI,Visit_enI

{ 

	String directoryName;
	String[] filesInDirectory;

    Visit_D_en visit_D_en = new Visit_D_en();  	

	public static void main(String[] args) { new DirectoryVisit_H_en().activate(); }

	public String getDirectoryName() {
		return directoryName;
	}

	public void setDirectoryName(String directoryName) {
		this.directoryName = directoryName;
		visit_D_en.setO(directoryName);
	}

	@Override
	public org.free.de.ji.core._000.interf._000.a.Alpha_enI execute() {
		   for ( int i=0; i<filesInDirectory.length; i++ )
		    {			   
  		      visit_D_en.getVisit().visit();
		      System.out.println( "file: " + filesInDirectory[i] );
		    }

		return null;
	}

	@Override
	public org.free.de.ji.core._000.interf._000.a.Alpha_enI init() {
		
		super.init();
		visit_D_en.setVisit(this);
		setDirectoryName("h:\\");
		
		// get a listing of all files in the directory
		File directory = new File(getDirectoryName());
	    filesInDirectory = directory.list();
		return getAlpha();
	}

	@Override
	public org.free.de.ji.core._000.interf._000.a.Alpha_enI visit() {
		System.out.println(visit_D_en.getO());
		return getAlpha();
	}

	@Override
	public org.free.de.ji.core._000.interf._000.a.Alpha_enI test() {
		execute();
		return getAlpha();
	}
 

}
