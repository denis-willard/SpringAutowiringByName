package fr.natsystem.formation.bean;

public class Metier {
	
	private Profession profession;
	private String contrat;
	
	public Metier(Profession profession, String contrat) {
		this.profession = profession;
		this.contrat = contrat;
	}
	
	public Metier() {
		
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}

	public String getContrat() {
		return contrat;
	}

	public void setContrat(String contrat) {
		this.contrat = contrat;
	}
	
	public void presenterMetier() {
		profession.fonction();
		System.out.println("et je travaille en tant que " + contrat);
		profession.tache();
	}

}
