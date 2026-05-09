import java.util.Scanner;

public class LargestArryaElement{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        int[] array= new int[n];
         
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int max=array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
            
        }
        System.out.println(" Largest Value = " + max);
    }
}