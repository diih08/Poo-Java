package Entrega_4;

public class Manada2 extends Manada {
	String respectiva="";
	@Override
	public String estourar() {
		
		for(Animal a:animais)
		{
			respectiva+=a.makeNoise()+",";
		}
		return respectiva;
	}

}
