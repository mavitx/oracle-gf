
public class IMC {

	public static void main(String[] args) {
		double peso = 52.7;
		double altura = 1.72;
		double imc = peso / (altura * altura);

		System.out.println(" === IMC ===");
		System.out.println("Peso: " + peso + " kg.");
		System.out.println("Altura: " + altura + " m.");
		System.out.println(" ");
		System.out.print("IMC da Maria: " + imc);
	}
}
