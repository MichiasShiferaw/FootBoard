
import java.util.Scanner;

public class FootBoardDim {
  public static double footBoardDim(double width, double height) {
    
   // height = 144 / (width * length);
    return height;
  }

  public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in);
    double length;
    double height;
    
    System.out.println("Enter the length of the board foot (inches):");
    length = userInput.nextDouble();
    double width;
    
    width = 0.0;
    System.out.println("Enter the width of the board foot (inches):");
    width = userInput.nextDouble();

