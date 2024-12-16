package org.mql.java;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

public class Examples {
	public Examples() {
//		exp01();
		exp02();
//		exp04();

	}
	void exp01(){
//		la rasion de la classe TimeProcessing est de determiner le temps de traitement de chaque methode(chaque type de collection dans la methode)
		TimeProcessing tp= new TimeProcessing();
		tp.run(new ListeTests(1000000));
	}
	void exp02() {
//		la ressource partagee=shared ressource
		List<Integer> data = new ArrayList<Integer>();
		Writer w1= new Writer(data);
		Writer w2= new Writer(data);
//		lancer un processus
		w1.start();
		w2.start();
//		attendre que les deux processus se termine
		try {
			w1.join();
			w2.join();
		}
		catch(Exception e) {}
		System.out.print("taille de data : "+data.size());
	}
	
	void exp03() {
		TimeProcessing tp= new TimeProcessing();
		tp.run(new StringTests(1000000));
	}
	
    
	public static void main(String[] args) {
//		Examples e=new Examples();
//		e.exp01();
		new Examples();
	}

}
