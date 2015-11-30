package tarefa8;


import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class Main {

	@Test
	public void Main() {
		List<Animal> animais= new ArrayList<Animal>();
		
		Gato cat1 = new Gato("Anakin","SRD", "0 ano", 50);
		Gato cat2 = new Gato("Kyro","Sphynks","3 anos",45);
		Cachorro dog1 = new Cachorro("Pipoca","`Poodle", "2 anos", 35);
		Cachorro dog2 = new Cachorro("Melody","Basse", "5 anos", 79);

		ManadaMoney v = new ManadaMoney();
		v.addAnimal(cat1);
		v.addAnimal(dog1);
		v.addAnimal(cat2);
		v.addAnimal(dog2);
		
		
		Gato cat3 = new Gato("Hanna","Siames", "5 anos", 32);
		Cachorro dog3 = new Cachorro("Felix","almata", "7 anos", 55);
		Gato cat4 = new Gato("Bilbo","Persa","2 anos",42);
		Cachorro dog4 = new Cachorro("Rex","Pit Bull", "10 anos", 14);
		
		ManadaComerc s = new ManadaComerc();
		s.addAnimal(cat3);
		s.addAnimal(dog3);
		s.addAnimal(cat4);
		s.addAnimal(dog4);
		
		System.out.println(v.estourar());
		System.out.println(s.estourar());
		
		animais.add(cat1);
		animais.add(cat2);
		animais.add(cat3);
		animais.add(cat4);
		animais.add(dog1);
		animais.add(dog2);
		animais.add(dog2);
		animais.add(dog4);
		
		
		this.byName(animais);
		System.out.println("Ordenando por nomes: " + animais);
		
		Collections.sort(animais);
		System.out.println("Ordenando por pesos: " + animais);
	
	}
	private void byName(List<Animal> animais) {
		comparadorNomes comp = new comparadorNomes();
		Collections.sort(animais, comp);
}

}