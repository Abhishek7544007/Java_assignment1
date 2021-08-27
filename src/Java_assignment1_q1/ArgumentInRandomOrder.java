package Java_assignment1_q1;
import java.util.*;

public class ArgumentInRandomOrder {

    public static void main(String[] args) {
        
        // store arguements in list of string
        List<String> arguements = Arrays.asList(args);
        //Shuffle the arguements
        Collections.shuffle(arguements);

        // Printing the elements using Streams
        arguements.stream()
        .forEach(e->System.out.format("%s ",e));
        System.out.println();
        
        //reshuffle 
        Collections.shuffle(arguements);


        // Printing the elements using for-each
        for (String arg: arguements) {
            System.out.format("%s ", arg);
        }
        
        
       // for testing in run configuration provide the arguements
        System.out.println();
    }
}
