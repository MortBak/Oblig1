package test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Oppgi navn, antall og pris for vare 1:");
        String navn1 = scanner.nextLine();
        int antall1 = scanner.nextInt();
        double pris1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Oppgi navn, antall og pris for vare 2:");
        String navn2 = scanner.nextLine();
        int antall2 = scanner.nextInt();
        double pris2 = scanner.nextDouble();

        try {
            antall1 = Integer.parseInt(scanner.nextLine());
            pris1 = Double.parseDouble(scanner.nextLine());
            antall2 = Integer.parseInt(scanner.nextLine());
            pris2 = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Ugyldig tallformat.");
            return;
        }

        Vare vare1 = new Vare(navn1, antall1, pris1);
        Vare vare2 = new Vare(navn2, antall2, pris2);

        double totalPris = vare1.beregnTotalPris() + vare2.beregnTotalPris();
        System.out.println("Total pris for alle varer: " + totalPris);
    }
}