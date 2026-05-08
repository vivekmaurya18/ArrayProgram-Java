import java.util.Scanner;

class DecrementArrayValue {

    // Method to decrement array elements
    public static int[] decrementElements(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i]--;
        }

        return arr;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        // Declare array
        int arr[] = new int[n];  //<------------------this mean how to array write-------------------->

        System.out.println("Enter array elements:");

        // Input array elements
        for(int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();
        }

        // Method call
        int result[] = decrementElements(arr);

        //Print array
        System.out.println("After decrement:");

        for(int i = 0; i < result.length; i++) {

            System.out.print(result[i] + " ");
        }
    }
}