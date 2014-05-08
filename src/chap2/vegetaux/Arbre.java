package chap2.vegetaux;

public class Arbre{
	public enum Type { CADUQUE, MARCESCENT, PERSISTANT}
	protected Type type;
	public static Arbre arbre;

	public Arbre(){
		type=Type.CADUQUE;
	}
	/*public static void main(String [] args){

		if(!(arbre instanceof Object))
			System.out.println("null n'est objet");
		arbre=new Arbre();
		if(arbre instanceof Object)
			System.out.println("arbre objet");
		if(arbre.type instanceof Object)
			System.out.println("les enums sont des objets");
		if(arbre.type instanceof Type)
			System.out.println(arbre.type+" jamais qu'un enum");
		else System.out.println(arbre.type+", qu'ont-ils donc fait?");
	}*/

	public String print(){
		System.out.println("je suis un "+this.getClass().getSimpleName()+" de type "+ type);
		return this.getClass().getSimpleName();
	}
}
