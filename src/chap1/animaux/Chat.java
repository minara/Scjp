package chap1.animaux;

import chap1.bebe.Chiot;

public class Chat{
	
	protected static void entendre(){
		Chiot chiot=new Chiot();
		Chien chien= new Chien();
		System.out.println("Le chien dit"+chien.wouaf);
		//System.out.println("Le chiot aboie"+chiot.aboie());
		System.out.println("Le chiot dit"+chiot.wouaf);
	}
}
