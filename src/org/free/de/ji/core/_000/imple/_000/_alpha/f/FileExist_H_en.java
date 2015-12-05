package org.free.de.ji.core._000.imple._000._alpha.f;

import org.free.de.ji.core._000.dao._000._alpha.f.File_D_en;
import org.free.de.ji.core._000.dao._000._alpha.n.Name_D_en;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;

public class FileExist_H_en 
extends org.free.de.ji.core._000.imple._000._alpha.e.Exist_H_en

implements
org.free.de.ji.core._000.interf._000.t.Test_enI
{
	//protected Exist_D_en exist_D_en = new Exist_D_en();
	protected File_D_en file_D_en = new File_D_en() ; 
	protected Name_D_en name_D_en = new Name_D_en();
	
	@Override
	public Alpha_enI test() {
		name_D_en.setName("h:\\");
		System.out.println(name_D_en.getName());
		System.out.println(file_D_en.newFile(name_D_en.getName()).isExist() );
		return getAlpha();
	}

}
