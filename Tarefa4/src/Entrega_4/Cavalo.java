package Entrega_4;

public class Cavalo extends Animal {

	public Cavalo(String raca, int idade, String cor) {
		super(raca, idade, cor);
		
	}
	@Override
	public String makeNoise() {
		return "IiIhhiii";
	}

}
