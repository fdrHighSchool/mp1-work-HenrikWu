
/**
 * Write a description of class proj2 here.
 *Think java:chapter 2
 * @author (Henrik Wu)
 * @version (9/28)
 */
import java.util.Scanner;
public class Date
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("enter the day of the week: ");
        
        String day = s.nextLine();
        System.out.println(day);
        
        System.out.print("enter the day of the month: ");
        
        String day2 = s.nextLine();
        System.out.println(day2);
        System.out.print("enter the month: ");
        
        String month = s.nextLine();
        System.out.println(month);
         
        System.out.print("enter the year: ");
        
        String year = s.nextLine();
        
        System.out.println("America: "+day+", "+month+" "+day2+", " + year);
        System.out.println("Europe: "+day+" "+day2+" "+month+" " + year);
    }//end of main
    //public static void month(){
       
    //}
}//end of class
