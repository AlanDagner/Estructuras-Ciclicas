import java.io.*;

public class pregunta5 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cubo;
		String tecla_repetir;
		double un_numero;
		do {
			System.out.print("Ingrese el número que quiere calcular al cubo:");
			un_numero = Double.parseDouble(bufEntrada.readLine());
			cubo = un_numero*un_numero*un_numero;
			System.out.println("Valor del número al cubo: "+cubo);
			System.out.println("");
			do {
				System.out.print("¿Desea repetir el proceso? (Si/No):");
				tecla_repetir = bufEntrada.readLine();
			} while (!(tecla_repetir.equals("si") || tecla_repetir.equals("no") || tecla_repetir.equals("Si") || tecla_repetir.equals("No")));
		} while (!(tecla_repetir.equals("no") || tecla_repetir.equals("No")));
	}


}

