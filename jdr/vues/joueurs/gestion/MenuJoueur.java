package jdr.vues.joueurs.gestion;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import jdr.model.Model;
import jdr.vues.ecouteur.EcouteurQuitter;

public class MenuJoueur extends JMenuBar{
	private Model modele;
	
	public MenuJoueur(Model m){
		super();
		modele = m;
		JMenu menuFichier = new JMenu("Fichier");
		JMenuItem itemQuitter = new JMenuItem("Quitter");
		itemQuitter.addActionListener(new EcouteurQuitter(modele));
		menuFichier.add(itemQuitter);
		add(menuFichier);
		JMenu menuJoueurs = new JMenu("Joueurs");
		JMenuItem itemAjouter = new JMenuItem("Ajouter");
		menuJoueurs.add(itemAjouter);
		JMenuItem itemEquipe = new JMenuItem("Equipes");
		menuJoueurs.add(itemEquipe);
		add(menuJoueurs);
		JMenu menuQuete= new JMenu("Quête");
		JMenuItem itemNouvelleQuete = new JMenuItem("Nouvelle Quête");
		menuQuete.add(itemNouvelleQuete);
		add(menuQuete);
	}
}
