import java.util.Scanner;

public class PracticaExamen3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Creem en un boolea per donar-li una condició al bucle.
		boolean condicio = false;
		// Creem variables per guardar el valor 
		double preu = 0;
		int dia = 0;
		// Creem un bucle el qual ens aconsegueix que mentre es compleixi la condició
		// pregunti
		do {
			dia++;
			System.out.println("Preu dia " + dia + ":");
			double preuFinal = entrada.nextDouble();
			// Al cumplir-se la condició surt del bucle.
			if (preuFinal <= preu) {
				condicio = true;
			}
			preu = preuFinal;
		} while (!condicio);

		// Restem el dia actual i el dia que ha pujat
		dia = dia - 2;
		System.out.print("El preu ha estat pujant durant " + dia + " dies.");
		entrada.close();
	}

}
