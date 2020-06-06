import java.io.*;

public class pregunta9 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double angulo_en_grados;
		double radianes;
		double seno;
		System.out.print("Ingrese el valor de angulo en grados:");
		angulo_en_grados = Double.parseDouble(bufEntrada.readLine());
		radianes = angulo_en_grados*3.14159265358979323846/180;
		seno = Math.sin(radianes);
		System.out.println("Valor de radianes: "+radianes);
		System.out.println("Valor de seno: "+seno);
	}


}

