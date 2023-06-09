package es.iesmz.ed.algoritmes;

import java.util.Scanner;

public class calculMental {
    static Scanner sc;
    public static void main(String[] args) {

        System.out.print("Ingrese la cantidad de casos de prueba: ");
        int casosPrueba = validaInt();
        sc.nextLine();

        for (int i = 0; i < casosPrueba; i++) {
            System.out.print("Introduzca la secuencia de cálculo: ");
            String secuencia = sc.nextLine();

            String[] operaciones = secuencia.split(" ");
            int resultado = Integer.parseInt(operaciones[0]);

            for (int j = 1; j < operaciones.length; j += 2) {
                String operador = operaciones[j];
                int operando = Integer.parseInt(operaciones[j + 1]);
                if (operador.equals("+")) {
                    resultado += operando;
                } else if (operador.equals("-")) {
                    resultado -= operando;
                }
                System.out.print(resultado + " ");
            }
            System.out.println();
        }
    }

    private static int validaInt() {
        sc = new Scanner(System.in);
        while (!sc.hasNextInt()) {
            System.out.println("Introduce un número entero");
            sc.next();
        }
        return sc.nextInt();
    }
}
