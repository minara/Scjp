package chap2.vegetaux;

public class Botanique{
	public void study(Arbre arbre){
		System.out.println("Je suis passé par un arbre");
		arbre.print();
	}

	public void study(Sapin sapin){
		System.out.println("J'ai vu un sapin");
		sapin.print();
	}

	public void study(String s){
		System.out.println("On m'a dit "+s);
	}

	public static void main(String[] args){
		Botanique b=new Botanique();
		Arbre a= new Arbre();
		Sapin s= new Sapin();
		Arbre as = new Sapin();
		b.study(a);
		b.study(s);
		b.study(as);
		b.study(a.print());
		b.study(s.print());
		b.study(as.print());
	}
}
