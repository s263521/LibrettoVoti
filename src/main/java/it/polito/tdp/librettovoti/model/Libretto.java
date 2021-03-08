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
	
	/**
	 * Ricerca un voto del corso di cui è specificato il nome.
	 * Se il corso non esiste, il metodo restituisce null.
	 * 
	 * @param nomeCorso Nome del corso 
	 * @return
	 * 
	 */
	public Voto ricercaCorso(String nomeCorso) {
		Voto risultato = null;
		for(Voto v: this.listaVoti) {
			if (v.getNome().equals(nomeCorso)) {
				risultato = v;
				break;
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
