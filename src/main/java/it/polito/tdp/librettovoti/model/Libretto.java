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
	
	public String toString() {
		String s = "";
		for(Voto v : this.listaVoti) {
			s = s+ v.toString() + "\n" ;
		}
		return s;
	}
}
