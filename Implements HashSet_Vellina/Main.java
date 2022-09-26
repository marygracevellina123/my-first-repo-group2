
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
        // "malahi ang ilang arrangement"
        Set<String> set = new HashSet<String>();
        // Set<String> set = new TreeSet<String>();
        System.out.println("Enter your 5 Favorite person:");
        set.add(input.nextLine());
        set.add(input.nextLine());
        set.add(input.nextLine());
        set.add(input.nextLine());
        set.add(input.nextLine());
        
        // SimplePrint
    System.out.println(set);
       // while (Iterator)
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            // System.out.println(it.next());
            System.out.println("Hello! Nice to meet you " + it.next());
        }
    }
}


