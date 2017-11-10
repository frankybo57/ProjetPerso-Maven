package noyau.outils;

public class Connectivite {
	private Connectivite connectivite = null;
	
	private Connectivite(){
		
	}
	
	public Connectivite getInstance(){
		if(this.connectivite == null) this.connectivite = new Connectivite();
		return connectivite;
	}
}
