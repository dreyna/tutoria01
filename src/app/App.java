package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Operaciones op = new Operaciones();
        System.out.println("Hello Java");
        Scanner sc = new Scanner(System.in);
        System.out.println("n1: ");
        double a = sc.nextDouble();
        System.out.println("n2: ");
        double b = sc.nextDouble();
        System.out.println("La Suma es: "+op.suma(a, b));
        System.out.println("La Resta es: "+op.resta(a, b));
        System.out.println("La Multiplicación es: "+op.multiplicacion(a, b));
        System.out.println("La División es: "+op.division(a, b));

    }
}