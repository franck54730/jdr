package jdr.vues;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import jdr.model.Constante;
import jdr.model.Model;
import jdr.vues.joueurs.gestion.VueJoueurs;

public class VuePrincipal extends JFrame implements Observer {

	private static VuePrincipal instance = new VuePrincipal();
	private Model modele;
	private JPanel panel;
    JScrollPane scrollPane;
	
	private VuePrincipal(){
		super("JDR");
	}
	
	public static void setModel(Model m){
		instance.modele = m;
		instance.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // instanciation de la vue de l'animation
		instance.createVue();
	}
	
	public static VuePrincipal getInstance(){
		return instance;
	}
	
	public void createVue(){
		VueJoueurs.setModel(modele);
        panel = Constante.getVue(modele.getIndiceVue());
        
        JPanel panel2 = new JPanel();
        for (int i = 0; i < 10; i++) {
            panel2.add(new JButton("Hello-" + i));
        }
        scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBounds(50, 30, 300, 50);
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(1000, 400));
        contentPane.add(scrollPane);
        setContentPane(scrollPane);
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
        
        setJMenuBar(VueJoueurs.getMenu());
        setPreferredSize(new Dimension(1500, 700));
		setLocationRelativeTo(null);
        pack();			
        setVisible(true);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Stub de la méthode généré automatiquement
		VuePrincipal.setModel(new Model());
	}

	public void update(Observable o, Object arg) {
		// TODO Stub de la méthode généré automatiquement
		panel = Constante.getVue(modele.getIndiceVue());
	}

}
