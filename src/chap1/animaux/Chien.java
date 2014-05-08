package chap1.animaux;

public class Chien{
	protected final int wouaf;

	public Chien(){
		wouaf=2;
	}
	//Changer les arguments = "override" possible
	 public final int aboie(int sept){
		return wouaf;
	}

	//private ou default = invisible => fct qui se trouve avoir le même nom
	private final int aboie(){
		return wouaf;
	}

	/*Changer le type de retour = pas d'override
	public final String aboie(){
		return ((Integer)wouaf).toStrings;
	}*/
}
