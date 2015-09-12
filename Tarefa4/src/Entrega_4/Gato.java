package Entrega_4;

public class Gato extends Animal {

	public Gato(String raca, int idade, String cor) {
		super(raca, idade, cor);
		
	}
	@Override
	public String makeNoise() {
		return "miau";
	}

}
