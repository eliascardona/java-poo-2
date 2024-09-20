import java.util.Scanner;

public class Main {
/*    static void compararCadenas() throws Exception {
        String datos1 = "123 456 789 012";
        String datos2 = "23-45-62-21";
        String datos3 = "hola amigo como estas";

        Scanner str1 = new Scanner(datos3);
        while(str1.hasNext()) {
            System.out.print("\n palabra = " + str1.Next() + "\n");
        }
        str1.close();
    }*/

    public static void main(String args[]) {
        String datos1 = "123 456 789 012";
        String datos2 = "23-45-62-21";
        String datos3 = "hola amigo como estas";
        String datos4 = "12-34-56-78-90-12";

        Scanner str1 = new Scanner(datos4);
        str1.useDelimiter("-");


        int total = 0;
        while(str1.hasNext()) {
            total += str1.nextInt();
        }
        System.out.print("\n total = " + total + "\n");







//        try {
//            compararCadenas();
//       } catch(Exception e) {
//            System.out.print("\n---\n");
//            System.out.print(e.printStackTrace() + "\n\n");
//        }
    }





}
