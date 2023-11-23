import java.util.Scanner;

/**
 * tempCodeRunnerFile
 */
public class bubblesorting {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the Number of array Element : ");
    //Number of array element
    int n= scan.nextInt();
    //define the array 
    int arr[] = new int[n];
    System.out.println("Enter the arr Element  : ");
    for (int i = 0; i <= arr.length - 1; i++) {
      //input in array element
      arr[i] = scan.nextInt();
    }
     System.out.println(" before sorting array ");
     for (int i = 0; i < arr.length; ++i) {
      //before sorting array
       System.out.print(arr[i] + " ");
    }

     
    for (int i = 0; i <= arr.length - 1; i++) {
      //Number of itreation in this array.
      for (int j = 0; j <= arr.length - i - 2; j++) {
        //Number of sorting in this element.
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
    System.out.println();
    //Display array
    System.out.println("sorted array element");
    for (int i = 0; i < arr.length; ++i) {
      System.out.print(arr[i] + " ");
    }
  }
}
