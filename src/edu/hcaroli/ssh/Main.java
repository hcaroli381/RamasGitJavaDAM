package edu.hcaroli.ssh;

import java.util.Random;

public class Main {
	public static void main(String[] args) {

		Random random = new Random();
		int numeroPrincipal0 = random.nextInt(1, 50);
		int numeroPrincipal1 = random.nextInt(1, 50);
		int numeroPrincipal2 = random.nextInt(1, 50);
		int numeroPrincipal3 = random.nextInt(1, 50);
		int numeroPrincipal4 = random.nextInt(1, 50);
		int reintegro = random.nextInt(0, 10);

		System.out.println("Números de la Lotería Primitiva:");
		System.out.printf("%d %d %d %d %d Reintegro : %d", numeroPrincipal0, numeroPrincipal1, numeroPrincipal2,
				numeroPrincipal3, numeroPrincipal4, reintegro);

	}
}