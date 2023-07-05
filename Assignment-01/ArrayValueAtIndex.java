import java.util.Scanner;

public class ArrayValueAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array values: ");
        String arrayInput = scanner.nextLine();
        int[] array = parseArrayValues(arrayInput);

        System.out.print("Enter the index  ");
        String indicesInput = scanner.nextLine();
        int[] indices = parseArrayValues(indicesInput);

        scanner.close();

        // Printing values at specified indices
        for (int index : indices) {
            if (index >= 0 && index < array.length) {
                System.out.print("Value present at Index "+ index +" : "+array[index] +" \n");
            }
        }
    }

    private static int[] parseArrayValues(String input) {
        String[] values = input.split(",");
        int[] array = new int[values.length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(values[i].trim());
        }

        return array;
    }
}
