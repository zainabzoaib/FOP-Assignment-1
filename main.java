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
         boolean correctInput=false;
        do{
         System.out.println("Please type the students marks");
         stdMarks=((new Scanner(System.in).nextInt()));
         if(stdMarks < 0 && stdMarks>100){
            correctInput=true;
            }else{
                System.out.println("Incorrect value, please type a number between 0 and 100");
            }
             }while(!correctInput);
        }
    }
}
    
    public static void main(String[] args){
        main myObj=new main();
    }
    
}
