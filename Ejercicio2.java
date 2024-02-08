(5 minutos) Escribir un programa que muestre por consola los mayores números enteros que se pueden representar mediante un char, short e int.


(15 minutos) Calcular la suma de todos los múltiplos de 5 comprendidos entre 1 y 100. Calcular además cuantos hay (ver operaciones sobre arrays) y visualizar cada uno de ellos. Utilizar una función que reciba el número de múltiplos de 5 y devuelva un array conteniedo todos los múltiplos de 5 desde el valor del parámetro begin hasta el valor del parámetro end. Realizar otra función que dado un array como parámetro, lo recorra de inicio a fin y devuelva la suma de todos sus valores.


(10 minutos) Escribe un programa que calcule el mínimo y el máximo de una lista de números enteros positivos introducidos por el usuario. La lista finalizará cuando se introduzca un número negativo.public static int[] getMultiplesOf5(int begin, int end) {
    int count = (end - begin) / 5 + 1;
    int[] multiples = new int[count];

    for (int i = 0; i < count; i++) {
        multiples[i] = begin + i * 5;
    }

    return multiples;
}

public static int calculateSum(int[] numbers) {
    int sum = 0;

    for (int number : numbers) {
        sum += number;
    }

    return sum;
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        do {
            System.out.println("Introduce un número entero positivo (introduce un número negativo para terminar):");
            number = scanner.nextInt();
            if (number >= 0) {
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }
        } while (number >= 0);

        System.out.println("El número mínimo introducido es: " + min);
        System.out.println("El número máximo introducido es: " + max);
    }
}public class Main {
    public static void main(String[] args) {
        int[] multiples = getMultiplesOf5(1, 100);
        int sum = sumArray(multiples);
        System.out.println("La suma de todos los múltiplos de 5 entre 1 y 100 es: " + sum);
    }

    public static int[] getMultiplesOf5(int begin, int end) {
        int count = (end - begin) / 5 + 1;
        int[] multiples = new int[count];
        for (int i = 0; i < count; i++) {
            multiples[i] = begin + i * 5;
        }
        return multiples;
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}public class Main {
    public static void main(String[] args) {
        System.out.println("El mayor número entero que se puede representar con un char es: " + (int)Character.MAX_VALUE);
        System.out.println("El mayor número entero que se puede representar con un short es: " + Short.MAX_VALUE);
        System.out.println("El mayor número entero que se puede representar con un int es: " + Integer.MAX_VALUE);
    }
}