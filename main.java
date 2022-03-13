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
        getInput();
        
        
    }
    public void getInput(){
         System.out.println("Please type the unit  name");
         unitName.add((new Scanner(System.in).nextString()));
    }
    
}
