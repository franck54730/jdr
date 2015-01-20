package jdr.vues.ecouteur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import jdr.model.Model;

public class EcouteurQuitter implements ActionListener {

	private Model modele;
	
	public EcouteurQuitter(Model m){
		modele = m;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Stub de la méthode généré automatiquement
		System.exit(1);
	}

}
