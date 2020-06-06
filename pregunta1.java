public class pregunta1 {

	public static void main(String args[]) {
		int ano;
		int anio;
		int i;
		double salario_inicial;
		double salario_recibido;
		for (i=1;i<=6;i++) {
			System.out.println("PROCESO "+i);
			salario_inicial = 1500;
			ano = i;
			salario_recibido = salario_inicial*Math.pow((1.1),(ano));
			System.out.println("Valor de salario inicial: "+salario_inicial);
			System.out.println("Valor de salario recibido: "+salario_recibido);
			System.out.println("Valor de año: "+ano);
			System.out.println("");
		}
	}


}