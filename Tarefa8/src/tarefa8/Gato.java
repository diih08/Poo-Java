package tarefa8;

public class Gato extends Animal{

	public Gato(String f,String x, String y, int z) {
		super(f,x, y, z);
		System.out.println("Gato add");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeNoise() {
		// TODO Auto-generated method stub
		return "Miaaauu";
	}

}