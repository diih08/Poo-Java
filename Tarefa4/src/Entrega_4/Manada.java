package Entrega_4;

import java.util.List;
import java.util.LinkedList;

public abstract class Manada {
	protected List<Animal>animais=new LinkedList<Animal>();
	public abstract String estourar();
	
	public void addAnimal(Animal animal)
	{
		animais.add(animal);
	}
	
	

}
