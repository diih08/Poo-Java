package Entrega_4;

public class Manada1 extends Manada {
	String respectiva="";
	@Override
	public String estourar() {
		
		for(Animal a:animais)
		{
			respectiva+=a.makeNoise()+"%";
		}
		return respectiva;
	}

}
