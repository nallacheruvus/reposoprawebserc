package com.sat.impl;


import com.sat.inte.NFace;
import com.sat.mods.Books;

import java.util.*;

import javax.jws.*;

@WebService(endpointInterface = "com.sat.inte.NFace")
public class NFaceImpl implements NFace {
	public String restRev(String a) {
		StringBuffer buf=new StringBuffer(a);
		String b=buf.reverse().toString();
		return b;
	}

	public List<Books> lsBooks() {
		List<Books> ls=new ArrayList<Books>();
		int[] arr1= {1,2,3,4,5};
		String[] arr2= {"Ramayan","Mahabharat","Quiet flows of don","Quiet sigh of moor","Sakuntalam"};
		String[] arr3= {"Valmiki","Vyas","Sholkov","Rushdie","Kalidasa"};
		for (int i = 0; i < arr3.length; i++) {
			Books b=new Books(arr1[i], arr2[i], arr3[i]);
			ls.add(b);
		}
		return ls;
	}

	public Books retSingle() {
		Books  b=new Books(21, "Sanskrit Vyakaran", "Pinakini");
		return b;
	}
}
