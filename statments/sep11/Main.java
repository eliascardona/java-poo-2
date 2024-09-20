import java.util.Scanner;

class Auxiliar {
    static void forLoopFn() {
        System.out.print("\n");
        for(int i=0; i<5; i++) {
            System.out.print("i+1 = "+ (i+1) +"\n");
        }
        System.out.print("\nfin del ciclo for");
    }

    static void whileLoopFn() {
        System.out.print("\n");
        for(int i=0; i<5; i++) {
            System.out.print("i+1 = "+ (i+1) +"\n");
        }
        System.out.print("\nfin del ciclo for");
    }


    static void dosome() {
        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;

        while(keepGoing) {
            System.out.print("1. ciclo for");
            System.out.print("2. ciclo while");
            System.out.print("3. ciclo switch\n");
            System.out.print("ingrese una opcion ");
            int op = scanner.nextInt();
            switch(op) {
                case 1:
                    forLoopFn();
                    break;

                default:
                    System.out.print("\nopcion no valida\n");
                    break;
            } // end of switch statment
        }
    } // end of main function
}


public class Main {
    public static void main(String args[]) {
        Auxiliar.dosome();

    }

}
























