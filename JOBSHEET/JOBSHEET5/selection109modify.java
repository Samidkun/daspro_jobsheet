import java.util.Scanner;
/**
 * selection109
 */
public class selection109 {

    public static void main(String[] args) {
          Scanner input09 = new Scanner(System.in);
int number;
String Say;

System.out.println("Input a number = ");
number = input09.nextInt();
Say = ( number%2 == 0) ? number+"is an even number!" : number+"is an odd number";
System.out.println(Say);        
    
    
    }

}