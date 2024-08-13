//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

//Your code here:
public class Program3 {
public static void main(String[] args){
    int length = 0;//Declare Variables
    int width = 0;
    int area = 0;
    int perimeter = 0;
    //Create my Scanner
    Scanner nScanner = new Scanner(System.in);
    
    //Ask for user input
    System.out.println("Enter the length: ");
    length = nScanner.nextInt();
    
    System.out.println("Enter the width: ");
    width = nScanner.nextInt();
    
    //Calc 
    area = length*width;
    perimeter = 2*(length+width);
    //Print results
    System.out.println("The length is: "+length);
    System.out.println("The width is: "+width);
    System.out.println("The area is: "+area);
    System.out.println("The perimeter is: "+perimeter);
    
    
}
}



//Paste console output below:
/*


*/
