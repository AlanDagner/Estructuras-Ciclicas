import java.io.*;

public class pregunta7 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double compras_realizadas;
		double intereses;
		double multa;
		double pago_del_corte_anterior;
		double pago_minimo;
		double pago_para_no_generar_intereses;
		double saldo_actual;
		double saldo_anterior;
		System.out.print("Ingrese el precio del total de compras realizadas:");
		compras_realizadas = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingrese el precio de pago del corte anterior:");
		pago_del_corte_anterior = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingrese el valor de saldo anterior:");
		saldo_anterior = Double.parseDouble(bufEntrada.readLine());
		if (saldo_anterior*0.15>pago_del_corte_anterior) {
			intereses = saldo_anterior*0.12;
			multa = 200;
		} else {
			intereses = 0;
			multa = 0;
		}
		saldo_actual = saldo_anterior+compras_realizadas-pago_del_corte_anterior+intereses+multa;
		pago_minimo = saldo_actual*0.15;
		pago_para_no_generar_intereses = saldo_actual*0.85;
		System.out.println("Valor de intereses: "+intereses);
		System.out.println("Valor de multa: "+multa);
		System.out.println("Valor de pago minimo: "+pago_minimo);
		System.out.println("Valor de pago para no generar intereses: "+pago_para_no_generar_intereses);
		System.out.println("Valor de saldo actual: "+saldo_actual);
	}


}

