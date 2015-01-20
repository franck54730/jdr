package jdr.model;

import java.util.ArrayList;

public class Personnage {

	private ArrayList<Arme> alArme;
	private ArrayList<Protection> alProtection;
	private ArrayList<Objet> alObjet;
	private String nom;
	private String sexe;
	private String origine;
	private String metier;
	private int niveau;
	private int pointVital;
	private int pointAstral;
	private int magiePhys;
	private int magiePsy;
	private int resistanceMagique;
	private int courage;
	private int intelligence;
	private int charisme;
	private int adresse;
	private int force;
	private int attaque;
	private int parade;
	private int experience;
	private int ptDeDestin;
	private int pOr;
	private int pArgent;
	private int pCuivre;
	private int protection;
	
	public Personnage(){
		alArme = new ArrayList<Arme>();
		alProtection = new ArrayList<Protection>();
		alObjet = new ArrayList<Objet>();
		nom = "";
		origine = "";
		sexe = "";
		metier = "";
		niveau = 1;
	}

	public ArrayList<Arme> getAlArme() {
		return alArme;
	}

	public void setAlArme(ArrayList<Arme> alArme) {
		this.alArme = alArme;
	}

	public ArrayList<Protection> getAlProtection() {
		return alProtection;
	}

	public void setAlProtection(ArrayList<Protection> alProtection) {
		this.alProtection = alProtection;
	}

	public ArrayList<Objet> getAlObjet() {
		return alObjet;
	}

	public void setAlObjet(ArrayList<Objet> alObjet) {
		this.alObjet = alObjet;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getOrigine() {
		return origine;
	}

	public void setOrigine(String origine) {
		this.origine = origine;
	}

	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public int getPointVital() {
		return pointVital;
	}

	public void setPointVital(int pointVital) {
		this.pointVital = pointVital;
	}

	public int getPointAstral() {
		return pointAstral;
	}

	public void setPointAstral(int pointAstral) {
		this.pointAstral = pointAstral;
	}

	public int getMagiePhys() {
		return magiePhys;
	}

	public void setMagiePhys(int magiePhys) {
		this.magiePhys = magiePhys;
	}

	public int getMagiePsy() {
		return magiePsy;
	}

	public void setMagiePsy(int magiePsy) {
		this.magiePsy = magiePsy;
	}

	public int getResistanceMagique() {
		return resistanceMagique;
	}

	public void setResistanceMagique(int resistanceMagique) {
		this.resistanceMagique = resistanceMagique;
	}

	public int getCourage() {
		return courage;
	}

	public void setCourage(int courage) {
		this.courage = courage;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getCharisme() {
		return charisme;
	}

	public void setCharisme(int charisme) {
		this.charisme = charisme;
	}

	public int getAdresse() {
		return adresse;
	}

	public void setAdresse(int adresse) {
		this.adresse = adresse;
	}

	public int getForce() {
		return force;
	}

	public void setForce(int force) {
		this.force = force;
	}

	public int getAttaque() {
		return attaque;
	}

	public void setAttaque(int attaque) {
		this.attaque = attaque;
	}

	public int getParade() {
		return parade;
	}

	public void setParade(int parade) {
		this.parade = parade;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getPtDeDestin() {
		return ptDeDestin;
	}

	public void setPtDeDestin(int ptDeDestin) {
		this.ptDeDestin = ptDeDestin;
	}

	public int getpOr() {
		return pOr;
	}

	public void setpOr(int pOr) {
		this.pOr = pOr;
	}

	public int getpArgent() {
		return pArgent;
	}

	public void setpArgent(int pArgent) {
		this.pArgent = pArgent;
	}

	public int getpCuivre() {
		return pCuivre;
	}

	public void setpCuivre(int pCuivre) {
		this.pCuivre = pCuivre;
	}

	public int getProtection() {
		return protection;
	}

	public void setProtection(int protection) {
		this.protection = protection;
	}
}
