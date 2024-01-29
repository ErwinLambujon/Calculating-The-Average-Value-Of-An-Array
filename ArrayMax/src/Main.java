import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

        int arr[] = new int[size];
        int average = 0;

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
            average += arr[i];
        }
        average /= arr.length;
        System.out.println("The average is = " + average);
    }
}