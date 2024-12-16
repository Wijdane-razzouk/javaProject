package org.mql.java;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;
public class TimeProcessing {
	
	public TimeProcessing() {
	}
//	Object sera rempalce lors de l'appel par l'instanciation de la classe comme dans l'exemple1 de la classe Examples
	public void run(Object object) {
		//introspection = reflexion
//		pour chaque Object appeler par la methode run on utilise l'introspection pour retourner ces methodes 
		Method methods[]=object.getClass().getDeclaredMethods();
		for(Method m: methods) {
			try {
//			La classe java.time.Instant est utilisée pour capturer l'heure avant et après l'exécution d'une méthode.	
				Instant i1=Instant.now();
//				La méthode invoke() exécute chaque méthode sur l'objet fourni.
				m.invoke(object);
				Instant i2=Instant.now();
				long time= Duration.between(i1,i2).toMillis();
				System.out.print(" - "+ m.getName() +":"+ time + "ms");
				
			}
			catch(Exception e) {}
		}
	}
}
