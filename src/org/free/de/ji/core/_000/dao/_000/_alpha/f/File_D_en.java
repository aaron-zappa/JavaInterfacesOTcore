package org.free.de.ji.core._000.dao._000._alpha.f;
import java.io.*;

import org.free.de.ji.core._000.dao._000._alpha.n.Name_D_en;

public class File_D_en 
extends Name_D_en

implements File_D_enI
{
File file=null;

public File getFile() {
	return file;
}

public org.free.de.ji.core._000.interf._000.a.Alpha_enI setFile(File file) {
	this.file = file;
	return getAlpha();
}

public org.free.de.ji.core._000.interf._000.a.Alpha_enI newFile(String fileName){
	file = new File (getName());
	setExist(file.exists());
	return getAlpha();
}

}
