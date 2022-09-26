
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.stream.Stream;
public class Main
{
  public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    
    ArrayList<String> Mycoscholars = new ArrayList<>();
    System.out.println("Enter your 5 Co-Scholar:");
    Mycoscholars.add(input.nextLine());
    Mycoscholars.add(input.nextLine());
    Mycoscholars.add(input.nextLine());
    Mycoscholars.add(input.nextLine());
    Mycoscholars.add(input.nextLine());
    
    // SimplePrint
    System.out.println(Mycoscholars);
    
    // FOREACH
        for (String Scholar : Mycoscholars){
            System.out.println(" Hello! Nice to meet you " + Scholar);
        }
      
    // while (Iterator)
        Iterator<String> it = Mycoscholars.iterator();
        while(it.hasNext()){
            // System.out.println(it.next());
            System.out.println( it.next());
        }
    //Stream
      Stream<String> str = Mycoscholars.stream();
        str.forEach(name -> {
            System.out.println(" Hello! Nice to meet you " + name);
        });
        
    
    }
    
    
}

