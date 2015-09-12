package Entrega_4;

public class Animal {
	private String raca;
	private int idade;
	private String cor;
	
	
	public Animal(String raca, int idade, String cor) {
		this.raca = raca;
		this.idade = idade;
		this.cor = cor;
	}

	public String makeNoise() {
		return "Noise";
	}
	

}
