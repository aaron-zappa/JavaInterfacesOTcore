package org.free.de.ji.core._000.imple._000._alpha.n;

import org.free.de.ji.core._000.dao._000._alpha.a.Alpha_D_en;
import org.free.de.ji.core._000.interf._000.a.Alpha_enI;
import org.free.de.ji.core._000.interf._000.n.NewP1_enI;

public class New_H_en 
extends org.free.de.ji.core._000.imple._000._alpha.a.Alpha_H_en //Alpha_D_en //Alpha_H_en
//implements NewP1_enI
{

	public Alpha_enI new_(Object o) {
		String className = o.getClass().getCanonicalName();
		try {
			setO(Class.forName(className).newInstance());
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return getAlpha();
	}

}
