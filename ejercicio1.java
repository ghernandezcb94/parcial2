public class Ejercicio1 {

    public static void main(String[] args){
        int i;

        System.out.println("usando ciclo for:");
        for (i = 0; i <= 10; i += 1) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        for (i = 10; i >= 0; i -= 1) {
            System.out.print(i + " ");
        }
        System.out.println("\n\n");
        System.out.println("usando ciclo while:");
        i = 0;
        while (i <= 10) {
            System.out.print(i + " ");
            i += 1; //i=i+1; i++;
        }//i=11;
        System.out.println("\n");

        i = 10;
        while (i >= 0) {
            System.out.print(i + " ");
            i -= 1; //i=i+1; i++;
        }
        System.out.println("\n\n");
        System.out.println("usando el ciclo do while:");

        i = 1;
        do {
            System.out.print(i + " ");
            i += 1;
        } while (i <= 10);

        System.out.println("\n");

        i = 10;
        do {
            System.out.print(i + " ");
            i -= 1;
        } while (i >= 1);
    }
}
