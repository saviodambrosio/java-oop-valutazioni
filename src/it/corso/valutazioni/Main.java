package it.corso.valutazioni;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
	//impostazione di array e random
	CalcolaValutazione[] studenteId = new CalcolaValutazione[20];
	Random random = new Random();
	int id; int assenze; double media;
	 for(int i=0; i < studenteId.length; i++) {
	   id = i+1;
	   assenze = random.nextInt(101);
	   media = random.nextDouble()*5;
	   
	   studenteId[i] = new CalcolaValutazione(id,assenze,media);
	   boolean esito = studenteId[i].esito();
	   if (esito ==true) {
		   System.out.println("Lo studente " + id + "è promosso");
	   }else {
		   System.out.println("Lo studente " + id + "è bocciato");
	   }
	 }

	}

}
