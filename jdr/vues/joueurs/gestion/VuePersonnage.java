package jdr.vues.joueurs.gestion;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.util.Observable;
import java.util.Observer;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import jdr.model.Model;
import jdr.model.Personnage;

public class VuePersonnage extends JPanel implements Observer {

	private Model modele;
	private Personnage perso;
	private JLabel labelNom;
	private JLabel labelOrigine;
	private JLabel labelMetier;
	private JLabel labelSexe;
	private JLabel labelNiveau;
	private JButton buttonRetirer;
	private JButton buttonModifier;
	
	public VuePersonnage(Model m, Personnage p){
		super();
		modele = m;
		buttonModifier = new JButton("Modifier");
		buttonRetirer = new JButton("Retirer");
		perso = p;
		m.addObserver(this);
		setPreferredSize(new Dimension(250,200));
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setBackground(Color.WHITE);
		labelNom = new JLabel();
		labelMetier = new JLabel();
		labelSexe = new JLabel();
		labelOrigine = new JLabel();
		labelNiveau = new JLabel();
		setLayout(new GridLayout(6,2));
		add(new JLabel("  Nom : "));	
		add(labelNom);		
		add(new JLabel("  Origine : "));	
		add(labelOrigine);
		add(new JLabel("  Métier : "));
		add(labelMetier);
		add(new JLabel("  Sexe : "));	
		add(labelSexe);
		add(new JLabel("  Niveau : "));	
		add(labelNiveau);
		add(buttonModifier);
		add(buttonRetirer);
		update(null, null);
	}

	public void update(Observable o, Object arg) {
		// TODO Stub de la méthode généré automatiquement
		labelNom.setText(perso.getNom());
		labelOrigine.setText(perso.getOrigine());
		labelMetier.setText(perso.getMetier());
		labelSexe.setText(perso.getSexe());
		labelNiveau.setText(""+perso.getNiveau());
	}
	
	public static JPanel vide(){
		JPanel rep = new JPanel();
		rep.setPreferredSize(new Dimension(250,200));
		rep.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		rep.setBackground(Color.WHITE);
		rep.setLayout(new GridBagLayout());
		return rep;
	}

}
