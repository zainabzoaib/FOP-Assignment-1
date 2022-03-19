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
  private ArrayList <Double> stdMarks = new ArrayList <Double> ();
  private double sum = 0;
  private double maxValue;
    private double minValue;
  /**
   * Constructor for objects of class main
   */
  public main() {
    // initialise instance variables
    getUnitName();
    getMarks();
    findMinandMax();
    calculateMean();
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
    while (!numberInput && i <=25);
    System.out.println(unitName.toString());
    System.out.println(stdMarks.toString());
  }
  public void calculateMean(){
      int numStudents = stdMarks.size();
        for(Double d : stdMarks) {
        sum += d;
        } 
        double mean = sum/numStudents;
    System.out.println("Total mean of student marks: "+ mean);
    }

  public void findMinandMax() {
      double maxValue = stdMarks.get(0);
      for (int i=1; i < stdMarks.size(); i++){
          if(stdMarks.get(i) > maxValue){
              maxValue = stdMarks.get(i);
              
        }
    }
        double minValue = stdMarks.get(0);
      for (int i=1; i< stdMarks.size(); i++){
          if(stdMarks.get(i) < minValue){
              minValue = stdMarks.get(i);
            }
        }
        System.out.println("Maximum student marks is: "+ maxValue);
        System.out.println("Minimum student marks is: "+ minValue);
  }

  public static void main(String[] args) {
    main myObj = new main();
  }

}