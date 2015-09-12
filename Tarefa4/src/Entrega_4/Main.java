package Entrega_4;

public class Main {

	public static void main(String[] args) {
		Gato cat1 = new Gato("Ragdoll", 3, "Preto");
		Gato cat2 = new Gato("Himalaio", 7, "Branco");
		Cavalo horse1 = new Cavalo("Marwari", 2, "Marrom");
		Cavalo horse2 = new Cavalo("Crioulo", 4, "Branco");
		Manada1 manas = new Manada1();
		Manada2 manav =new Manada2();
		manav.addAnimal(cat1);
		manav.addAnimal(cat2);
		manav.addAnimal(horse1);
		manav.addAnimal(horse2);
		
		manas.addAnimal(cat1);
		manas.addAnimal(cat2);
		manas.addAnimal(horse1);
		manas.addAnimal(horse2);
		
		System.out.println(manav.estourar());
		System.out.println(manas.estourar());
		

	}

}
