import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        size = input.nextInt();

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + (i + 1));
            array[i] = input.nextInt();
        }

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The minimum element of array is: " + min);
    }
}
