package jdr.vues.joueurs.gestion;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

import jdr.model.Constante;
import jdr.model.Model;
import jdr.model.Personnage;

public class VueJoueurs extends JPanel implements Observer {

	private static VueJoueurs instance = new VueJoueurs();
	private Model modele;
	private GridBagLayout layout;
	private JPanel panel;
	private MenuJoueur menu;
	
	private VueJoueurs(){
	}
	
	public static void setModel(Model m){
		instance.modele = m;
		m.addObserver(instance);
		instance.layout = new GridBagLayout();
		instance.panel = new JPanel();
		instance.menu = new MenuJoueur(m);
		instance.panel.setLayout(instance.layout);
        instance.add(instance.panel);
        
        
		instance.update(null, null);
		//instance.setPreferredSize(new Dimension(600, 700));
	}
	
	public static MenuJoueur getMenu(){
		return instance.menu;
	}
	
	public static VueJoueurs getInstance(){
		return instance;
	}
	
	public void update(Observable o, Object arg) {
		// TODO Stub de la méthode généré automatiquement
		panel.removeAll();
		int nbLargeur = Constante.ACCEUIL_NB_PERSO_LARGEUR;
		int reste = modele.getNbPerso()%nbLargeur;
		int manque = reste==0?0:5-reste;
		int nbLigne = (modele.getNbPerso()+manque)/nbLargeur;
		panel.setPreferredSize(new Dimension(nbLargeur*250, nbLigne*200));
		GridBagConstraints gc = new GridBagConstraints();
		gc.weightx=nbLargeur;
		gc.weighty=nbLigne;
		for(int i = 0; i < nbLigne; i++){
			for(int j = 0; j < Constante.ACCEUIL_NB_PERSO_LARGEUR; j++){
				int indice = i*Constante.ACCEUIL_NB_PERSO_LARGEUR+j;
				if(indice < modele.getNbPerso()){
					Personnage p = modele.getPerso(indice);
					gc.gridx=j;
					gc.gridy=i;
					VuePersonnage v = new VuePersonnage(modele, p);
					panel.add(v, gc);
				}else{
					panel.add(VuePersonnage.vide(), gc);
				}
			}
		}
	}
}
