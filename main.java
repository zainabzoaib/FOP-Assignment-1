import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main {
  // instance variables - replace the example below with your own
  private String unitName;
  private ArrayList < Double > stdMarks = new ArrayList < Double > ();

  /**
   * Constructor for objects of class main
   */
  public main() {
    // initialise instance variables
    getUnitName();
    getMarks();
    findMinandMax();
  }
  public void getUnitName() {
    System.out.println("Please type the unit name");
    unitName = ((new Scanner(System.in).next()));
  }

  public void getMarks() {
    boolean numberInput = false;
    int i = 1;
    do {
      System.out.println("Please type the students marks");
      double marks = new Scanner(System.in).nextDouble();
      if (marks > 0 && marks <= 100) {
        stdMarks.add(marks);
        i++;

      } else {
        System.out.println("Incorrect value, please type a number between 0 and 100");
        numberInput = false;
        i--;

      }
    }
    while (!numberInput && i <= 25);
    System.out.println(unitName.toString());
    System.out.println(stdMarks.toString());
  }

  public void findMinandMax() {

  }

  public static void main(String[] args) {
    main myObj = new main();
  }

}