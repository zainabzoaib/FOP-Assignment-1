import java.util.Scanner;
import java.util.ArrayList;
/**
 * Allow users to input the unit name.
 * Allow users to input the students’ marks accepting number between 0 and 100 with error 
warning.
 * Print the unit name following with the students marks.
 * Find the highest mark and the lowest mark and print the result.
 * Calculate the mean and standard deviation of the marks and print the result.
 *
 * @author Zainab 23622348
 * @version 1.0
 * @git url https://github.com/zainabzoaib/FOP-Assignment-1
 */
public class main {
    //setting class variables
    private String unitName;
    private ArrayList<Double> stdMarks = new ArrayList<Double>();
    private double sum = 0;
    private double maxValue;
    private double minValue;
    private int numStudents;
    private double mean;    

    /**
     * Constructor for objects of class main
     */
    public main() {
        //calling methods
        //getting unit name
        getUnitName();
        //getting student marks
        getMarks();
        //finding minimum and maximum marks
        findMaxMarks();
        findMinMarks();
        //calculation of mean of marks
        calculateMean();
        //calculation of standard deviation of marks
        calculateDeviation();
    }

    public void getUnitName() {
        //system.out to get user input
        System.out.println("Please type the unit name");
        //setting user input to class variable unitName
        unitName = ((new Scanner(System.in).nextLine()));
    }

    public void getMarks() {
        //getting marks for 25 students in class
        //setting number input to false in order to validate correct input 
        boolean numberInput = false;
        //initial value for loop
        int i = 1;
        do {
            //system.out to get user input for student marks
            System.out.println("Please type the students marks");
            try {
                //setting user input to marks
                String strMarks = new Scanner(System.in).nextLine();
                //checking if marks are > than 0 and <= 100
                double marks = Double.parseDouble(strMarks);
                if (marks > 0 && marks <= 100) {
                    //adding double marks to arraylist stdMarks
                    stdMarks.add(marks);
                    //adding loop initail value
                    i++;
    
                } else {
                    //system.out error for incorrect input value
                    System.out.println("Incorrect value, please type a number between 0 and 100");
                    //setting number input false to get input for correct value
                    numberInput = false;
    
                }
            }catch(NumberFormatException ex) {
               System.out.println("Incorrect value, please type a number."); 
            }
        }
        //loop condition to run 25 times 
        while (!numberInput && i <= 25);
        //printing unit name
        System.out.println("Unit Name : " + unitName.toString());
        //priniting marks
        System.out.println("Student Marks : " + stdMarks.toString());
    }

    public void findMaxMarks() {
        //finding maximum marks from entered values
        //initialising maxValue
        double maxValue = stdMarks.get(0);
        //initialising loop to check maximum marks
        for (int i = 1; i < stdMarks.size(); i++){
            //if loop value is greater than maxValue
            if(stdMarks.get(i) > maxValue){
                //setting maxVale to loop value
                maxValue = stdMarks.get(i);

            }
        }

        //priniting maximum marks
        System.out.println("Highest student marks is: " + maxValue);

    }

    public void findMinMarks() {

        //finding minimum marks from entered values
        //initialising minValue
        double minValue = stdMarks.get(0);
        //initialising loop to check minimum marks
        for (int i = 1; i < stdMarks.size(); i++){
            //if loop value is less than minValue
            if(stdMarks.get(i) < minValue){
                //setting minVale to loop value
                minValue = stdMarks.get(i);
            }
        }
        //printing minimum marks
        System.out.println("Lowest student marks is: " + minValue);
    }

    public void calculateMean(){
        //calculating mean and standard deviation
        //get size of stdMarks arraylist as numStudents 
        int numStudents = stdMarks.size();
        //looping students marks as student mark
        for(double d : stdMarks) {
            //adding value to total sum
            sum += d;
        }
        //sum divided by number of students to get mean
        double mean = sum/numStudents;
        //printing mean
        System.out.println("Total mean of student marks: " + mean);
    }

    public void calculateDeviation(){
        //get size of stdMarks arraylist as numStudents 
        int numStudents = stdMarks.size();
        //initialise standard deviation variable with value 0
        double standardDeviation = 0.0;

        //looping student marks
        for(double num: stdMarks) {
            //setting standard deviation with formula marks - mean to calculate the number 
            //raise to the power 2
            standardDeviation += Math.pow(num - mean, 2);
        }
        //setting standard deviation divided by number of students with square root to 
        //deviation
        double deviation =  Math.sqrt(standardDeviation/numStudents);
        //printing standard deviation
        System.out.println("Standard Deviation of student marks: " + deviation);
    }

    public static void main(String[] args) {
        //intialising class to call constructor
        main myObj = new main();
    }

}