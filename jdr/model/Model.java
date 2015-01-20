package jdr.model;

import java.util.ArrayList;
import java.util.Observable;

public class Model extends Observable{
	private ArrayList<Personnage> alPerso;
	private int indiceVue;
	private int indiceVueAvant;
	
	public Model(){
		alPerso = new ArrayList<Personnage>();
		alPerso.add(new Personnage());
		indiceVue = Constante.VUE_JOUEURS;
	}
	
	public int getNbPerso(){
		return alPerso.size();
	}
	
	public Personnage getPerso(int i){
		return alPerso.get(i);
	}

	public int getIndiceVue() {
		return indiceVue;
	}

	public void setIndiceVue(int indiceVue) {
		this.indiceVue = indiceVue;
	}

	public int getIndiceVueAvant() {
		return indiceVueAvant;
	}

	public void setIndiceVueAvant(int indiceVueAvant) {
		this.indiceVueAvant = indiceVueAvant;
	}
}
