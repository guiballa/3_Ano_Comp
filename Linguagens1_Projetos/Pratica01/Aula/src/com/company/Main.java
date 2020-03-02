package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	    double n1, n2;
        System.out.println("Informe dois valores:");
        n1 = scanner.nextDouble();
        n2 = scanner.nextDouble();

        if (n1>n2)
            System.out.println("n1 maior");
        else if (n2<n1)
            System.out.println("n2 maior");
        else
            System.out.println("n1 e n2 sao iguais");
    }
}
