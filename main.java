import java.util.Scanner;
import java.util.ArrayList;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    // instance variables - replace the example below with your own
    private String unitName;
    private int stdMarks;

    /**
     * Constructor for objects of class main
     */
    public main()
    {
        // initialise instance variables
        getUnitName();
        getMarks();
        
    }
    public void getUnitName(){
         System.out.println("Please type the unit name");
         unitName=((new Scanner(System.in).next()));
    }
    
     public void getMarks(){
         System.out.println("Please type the students marks");
         unitName=((new Scanner(System.in).next()));
    }
    
    public static void main(String[] args){
        main myObj=new main();
    }
    
}
