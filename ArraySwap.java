import java.util.Scanner;

public class ArraySwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the input array values: ");
        String arrayInput = scanner.nextLine();
        int[] inputArray = parseArrayValues(arrayInput);

        System.out.print("Enter the swap Index : ");
        String swapIndex = scanner.nextLine();
        int[] swapElement = parseArrayValues(swapIndex);
        scanner.close();
    
     // Swap elements at specified index
        int[] outputArray = new int[swapElement.length];
        for (int i = 0; i < swapElement.length; i++) {
       
            outputArray[i]=inputArray[swapElement[i]];
        }
    // Print the resulting array
        for (int element : outputArray) {
            System.out.print(element + " ");
        }
        System.out.println();
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
