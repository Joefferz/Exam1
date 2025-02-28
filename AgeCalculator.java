
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    // instance variables - replace the example below with your own
    private int currentYear = 2025;
    private int age;
    
    public int drivingEligibility(int yearOfBirth)
    {
        age = currentYear - yearOfBirth;
        
        //Fix: Fixed grammar mistakes
        if(age>=16)
        {
            System.out.println("You are " + age + ", you are eligible to drive.");
        }
        else
        {
            System.out.println("You will have to wait " + (16 - age) + " more year(s).");
        }
        
        //Fix: Returned age
        return age;
    }
}
