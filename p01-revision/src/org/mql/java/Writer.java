package org.mql.java;

import java.util.List;
//c'est un processus 
public class Writer extends Thread{
//	les donnees partagees par les processus
	private List<Integer> data;
	
	public Writer(List<Integer> data) {
		super();
		this.data=data;
	}

	
	@Override
	public void run() {
		for (int i=0; i<100; i++) {
//			liste d'emtier de 4 chiffre
			int e=(int) (Math.random () * 9000 + 1000);
			data.add(e);
		}
	}
}
