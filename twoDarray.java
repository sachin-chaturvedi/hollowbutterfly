import java.util.Scanner;

/*
 * secondcode
 */
public class secondcode {      
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the number of  row : ");
    int row = sc.nextInt();
    System.out.print("Enter the number of coloum : ");
    int coloum= sc.nextInt();
    int matrix[][]=new int[row][coloum];
    for(int i=0;i<row;i++){
      for(int j=0;j<coloum;j++){
        System.out.print(i+" :: ");
        System.out.print(j+" :: ");
        matrix[i][j]=sc.nextInt();
      }
    } System.out.print("Enter the number  x : ");
    int x=sc.nextInt();
    for(int i=0;i<row;i++){
      for(int j=0;j<coloum;j++){
        if(matrix[i][j]==x){
          System.out.println("x location row "+i+" and coloum "+j);
        } 
        int a=x%10;
        if(i==x/10&&j==a){
 
          System.out.println("x location of matrix "+matrix[i][j]);
        }
      }
    }
  }
}
  
