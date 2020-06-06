import java.io.*;

public class pregunta2 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double costo;
		double descuento;
		double n_articulos;
		double pago_por_todo;
		double precio_por_articulo;
		System.out.print("Ingrese el valor de N articulos:");
		n_articulos = Double.parseDouble(bufEntrada.readLine());
		System.out.print("Ingrese el valor de precio por articulo:");
		precio_por_articulo = Double.parseDouble(bufEntrada.readLine());
		descuento = 0;
		costo = precio_por_articulo*n_articulos;
		if (costo>=200) {
			descuento = costo*0.15;
		}
		if (costo>100 && costo<200) {
			descuento = costo*0.12;
		}
		if (costo<=100) {
			descuento = costo*0.1;
		}
		pago_por_todo = costo-descuento;
		System.out.println("Valor de costo: "+costo);
		System.out.println("Valor de descuento: "+descuento);
		System.out.println("Valor de pago por todo: "+pago_por_todo);
	}


}

