package it.polito.tdp.librettovoti.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List<Voto> listaVoti;
	
	
	public Libretto() {
		this.listaVoti = new  ArrayList<>();
	}
	
	public void add(Voto v) {
		this.listaVoti.add(v);
	}
	
	public List<Voto> listaVotiUguali(int punteggio) {
		List<Voto> risultato = new ArrayList();
		
		for(Voto v: this.listaVoti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		
		return risultato;
	}
	
	public Libretto votiUguali(int punteggio) {
		Libretto risultato = new Libretto();
		
		for(Voto v: this.listaVoti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
//				risultato.listaVoti.add(v);
			}
		}
		return risultato;
	}
	
	
	public String toString() {
		String s = "";
		for(Voto v : this.listaVoti) {
			s = s+ v.toString() + "\n" ;
		}
		return s;
	}
}
