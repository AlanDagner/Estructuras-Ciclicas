import java.io.*;

public class pregunta8 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double billetes_de_cincuenta;
		double billetes_de_diez;
		double billetes_de_veinte;
		double cantidad_de_dinero;
		double monedas_de_cinco;
		double monedas_de_diez;
		double monedas_de_un_peso;
		System.out.print("Ingrese el valor de billetes de cincuenta:");
		billetes_de_cincuenta = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingrese el valor de billetes de diez:");
		billetes_de_diez = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingrese el valor de billetes de veinte:");
		billetes_de_veinte = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingrese el valor de monedas de cinco:");
		monedas_de_cinco = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingrese el valor de monedas de diez:");
		monedas_de_diez = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingrese el valor de monedas de un peso:");
		monedas_de_un_peso = Double.parseDouble(bufEntrada.readLine());
		cantidad_de_dinero = monedas_de_diez*10+monedas_de_cinco*5+monedas_de_un_peso+billetes_de_diez*10+billetes_de_veinte*20+billetes_de_cincuenta*50;
		System.out.println("Valor de cantidad de dinero: "+cantidad_de_dinero);
	}


}

