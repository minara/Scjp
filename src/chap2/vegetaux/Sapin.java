package chap2.vegetaux;

public class Sapin extends Arbre{
	public Sapin(){
		super();
		type=Type.PERSISTANT;
	}

	public String print(){
		System.out.println("J'aime pas bien qu'on parle pour moi!");
		return super.print();
	}
}
