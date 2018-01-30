package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // 1.6.​ Parašyti programą, kuri leistų vartotojui įvesti savo masę ir ūgį, pagal gautus duomenis
        // paskaičiuotų ir atvaizduotų jo kūno masės indeksą.
        // KMI = masė (kg) / (ūgis(m))^2
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite savo svori(kg): ");
        int mase = sc.nextInt();
        System.out.println("Iveskite savo ugi(metrais): ");
        float ugis = sc.nextFloat();
        float KMI = (float)mase/(ugis*ugis);
        System.out.println("Jusu KMI yra: " + KMI);
    }
}
