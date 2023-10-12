import java.util.Scanner;

/**
 * tempCodeRunnerFile
 */
public class printlengthName {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // print input name
        System.out.print("Enter the first name : ");
        String firstname = scan.nextLine();
        //input first name 
        System.out.print("Enter the last name  : ");
        String lastname = scan.nextLine();
        //input last name
        String fullname = firstname+lastname;
        //sum of firstname and lastname 
        System.out.println(fullname.length());
        //length of full name
        System.out.println(fullname);
        }
}