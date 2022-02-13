import java.util.Scanner;

public class Application {

    public static void printInstructions(){
        System.out.println("""
                \s
                Bienvenido a nuestro reto ejercicio 3 (ﾉ◕ヮ◕)ﾉ*:･ﾟ✧ \s
                Sigue las siguientes instrucciones para usar correctamente el programa \s
                \s
                Opción 1 para ordenarlo por el algoritmo de la burbuja. \s
                Opción 2 para ordenarlo por el algoritmo quick sort. \s
                Opción 3 para salir del programa.""");
    }

    public static double[] generateArrayRealNumber(){
        double[] realNumbersArray = new double[10];
        for (int i = 0; i < 10; i++) {
            realNumbersArray[i] = (int) (Math.random() * 20);
        }
        return realNumbersArray;
    }

    public static void main(String[] args) {

        printInstructions();

        Scanner userInput = new Scanner(System.in);
        String optionSelected;

        do {
            double[] newArrayRealNumbers = generateArrayRealNumber();
            System.out.println("\nArray actual: \n");

            for (double i : newArrayRealNumbers) {
                System.out.println(i);
            }

            System.out.println("\nDigita una opción: ");
            optionSelected = userInput.next();

            if ("1".equals(optionSelected)) {
                System.out.print("Metodo burbuja\n");
                int n = newArrayRealNumbers.length;
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if(newArrayRealNumbers[j] > newArrayRealNumbers[j+1]){
                            double temp = newArrayRealNumbers[j];
                            newArrayRealNumbers[j] = newArrayRealNumbers[j+1];
                            newArrayRealNumbers[j+1] = temp;
                        }
                    }
                }
                for (double i : newArrayRealNumbers) {
                    System.out.println(i);
                }


            } else if ("2".equals(optionSelected)) {
                System.out.print("Metodo ordenamiento");
            }

        } while (3 > Integer.parseInt(optionSelected));
    }
}
