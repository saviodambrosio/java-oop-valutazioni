package it.corso.valutazioni;

public class CalcolaValutazione {

	//inserisco gli attributi dello stuente
	int id;
	int assenze;
	double media;
	
	//costruttore
	CalcolaValutazione(int id,int assenze,double media){
		this.id = id;
		this.assenze = assenze;
		this.media = media;
		}
	
	//inserisco metodo per calcolare la valutazione
	boolean esito(){
		boolean esito;
		if ((assenze < 25 && media >=2) || (assenze < 50 && media > 2)) {
	        esito = true;
		}
		else {
			esito = false;
		}
		return esito;
	}
	
	
	
	
}
