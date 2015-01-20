package jdr.model;

import javax.swing.JPanel;

import jdr.vues.joueurs.gestion.VueJoueurs;

public class Constante {
	public static int ACCEUIL_NB_PERSO_LARGEUR = 5;
	public static int acceuilNbPersoLargeur(int largeurPx){
		return largeurPx;
	}
	
	public static final int VUE_JOUEURS = 1;
	
	public static JPanel getVue(int indice){
		JPanel rep = null;
		switch(indice){
			case Constante.VUE_JOUEURS :rep = VueJoueurs.getInstance(); break;
		}
		return rep;
	}
}
