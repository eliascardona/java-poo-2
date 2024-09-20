import java.util.Scanner;


public class Main {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n ---");
        System.out.println(" PROGRAMA PARA TESTEAR SENTENCIAS EN JAVA \n");

        boolean keepGoing = true;

        while(keepGoing) {
            System.out.print("1. ciclo for");
            System.out.print("2. ciclo while");
            System.out.print("3. ciclo switch\n");
            System.out.print("ingrese una opcion ");
            int op = scanner.nextInt();
            switch(op) {
                case 1: {
                    System.out.print("\n");
                    for(int i=0; i<5; i++) {
                        System.out.print("i+1 = "+ (i+1) +"\n");
                    }
                    System.out.print("\nfin del ciclo for");
                }
                break;


                default:
                    System.out.print("\nopcion no valida\n");
                break;
            } // end of switch statment
        }

    } // end of static void main

}



