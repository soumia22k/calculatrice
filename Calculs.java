import java.util.Scanner;

    public class Calculs {
    static Scanner input = new Scanner(System.in);
    static float a;
    static float b;
    static void valeurs() {
        System.out.println("Entrer a:");
        a = input.nextFloat();
        System.out.println("Entrer b:");
        b = input.nextFloat();
    }

    static void addition() {
        valeurs();
        System.out.println("la somme de:\n" + a + "+" + b + "\nc'est: " + (a + b));}

    static void soustraction() {
        valeurs();
        System.out.println("la soustraction de:\n" + a + "-" + b + "\nc'est: " + (a - b));
    }

    static void multiplication() {
        valeurs();
        System.out.println("la multiplication de:\n" + a + "*" + b + "\nC'est: " + (a * b));
    }

    static void division() {
        valeurs();
        System.out.println("la division de:\n" + a + "/" + b + "\nc'est:" + (a / b));

    }

    static void puissance() {
        valeurs();
        System.out.println("la puissance de:\n" + a + "^" + b + "\nc'est:" + Math.pow(a, b));
    }
    static void racine() {
        System.out.println("entrer le numero: ");
        a=input.nextFloat();
        System.out.println("la racine carré de:\n" + a +  "\nc'est:" +  Math.sqrt(a));
    }

    static void factorielle() {
        System.out.println("entrer un nombre: ");
        int n = input.nextInt();
        if (n < 0){
            System.out.println("erreur , C'est un nombre négatif  ne définie pas par la fctorielle!! ");
            return;
        }
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.println("la factorielle de:\n" + n + "\nc'est:" + f);


    }
    public static void main(String[] args) {

        int ch;
        do {
            System.out.println("MENU:");
            System.out.println("1: ADDITION");
            System.out.println("2: SOUSTRACTION");
            System.out.println("3: MULTIPLICATION");
            System.out.println("4: DIVISION");
            System.out.println("5: PUISSANCE");
            System.out.println("6: RACINE QUARRE");
            System.out.println("7: FACTORIELLE");
            System.out.println("8: QUITTER");

            System.out.println("ENTRER VOTRE CHOIX:");
            ch = input.nextInt();
            switch (ch) {
                case 1:
                    addition();
                    break;
                case 2:
                    soustraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    puissance();
                    break;
                case 6:
                    racine();
                    break;
                case 7:
                    factorielle();
                    break;
                case 8:
                    System.out.println("Quitter");
                    break;
                default:
                    System.out.println("le Choix invalide ,réessayer!!");
            }
        }
        while (ch != 8);
    }
}
