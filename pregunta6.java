import java.io.*;

public class pregunta6 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double i;
		double numero;
		double resultado;
		System.out.println("Ingrese el número que quiere ver de la tabla de multiplicar: ");
		numero = Double.parseDouble(bufEntrada.readLine());
		System.out.println("");
		for (i=1;i<=10;i++) {
			resultado = i*numero;
			System.out.println(numero+"x"+i+"="+resultado);
		}
	}


}

