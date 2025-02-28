import java.util.ArrayList;
/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
    // instance variables - replace the example below with your own
    private ArrayList<Bird> zooBirds;
    private int numberOfBlueBirds = 0;
    
    public Zoo()
    {
        zooBirds = new ArrayList<Bird>(); //ChatGPT. Forgot to initialize the ArrayList
        zooBirds.add(new Bird("blue","blue jay",2));
        zooBirds.add(new Bird("red","red cardinal",2));
        zooBirds.add(new Bird("red","red cardinal",2));
        zooBirds.add(new Bird("blue","blue jay",2));
    }
    
    int countBlueBirds()
    {
        for(Bird bird : zooBirds)
        {
            if(bird.color.equals("blue"))
            {
                numberOfBlueBirds++;
            }
        }
        
        return numberOfBlueBirds;
    }
}    