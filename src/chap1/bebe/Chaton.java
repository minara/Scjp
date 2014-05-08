package chap1.bebe;

import chap1.animaux.Chat;

class Chaton extends Chat{
	public static void main(String[] args){
		Chiot chiot=new Chiot();
		Chat chat = new Chat();
		
		System.out.println("Le chiot aboie"+chiot.aboie());
		System.out.println("j'entend");
		Chat.entendre();
		//System.out.println("Le chiot dit"+chiot.wouaf);
	}
}
