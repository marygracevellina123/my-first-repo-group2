
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
public class Main {
    
    
    public static void main(String[] args) {
        Character choice, clear;
        Scanner sc=new Scanner(System.in);
        
		Set<Integer> numbers = new HashSet<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
    
         // Ask user:
        while(true){
        System.out.println(""); 
        System.out.println("Welcome! ");
        System.out.println(""); 
        System.out.println("These are the menus:");
        System.out.println("======================"); 
        System.out.println("= A. Add number      =");
        System.out.println("= B. Remove number   =");
        System.out.println("= C. Display numbers =");
        System.out.println("= D. Clear numbers   =");
        System.out.println("= E. Exit            =");
        System.out.println("======================");
        System.out.println("What is your choice :");
        choice = sc.next().charAt(0);
        choice = Character.toLowerCase(choice);
            System.out.println("");
        
            switch(choice){
                case 'a':
                    System.out.print("Enter number you want to add: ");
                    int add = sc.nextInt();
                    System.out.println("");
                    
                    if(add > 0){

                        numbers.add(add);
                        
                        System.out.println("Number " + add + " is successfully added to the ArrayList!");
                        break;

                    }
                    else{
                        System.out.println("Invalid! Your input is a negative integer.");
                        break;
                    }

                    
                case 'b':
                    System.out.print("Enter number you want to remove: ");
                    int remove = sc.nextInt();
                    System.out.println("");

                    if(numbers.contains(remove)){
                        numbers.remove(Integer.valueOf(remove));
                        System.out.println("Number " + remove + " is successfully removed!");
                        break;
                    }
                    
                case 'c':
                    System.out.println("Displaying numbers in ArrayList");
                    System.out.println("============================");
                    
                        System.out.println(numbers);
                    
                    System.out.println("============================");
                    break;

                case 'd':
                    System.out.print("Are you sure you want to clear contents?(y/n): ");
                    clear = sc.next().charAt(0);
                    clear = Character.toLowerCase(clear);
                    switch(clear){
                        case 'y':
                            System.out.println("CLEARING!!!");
                            System.out.println("Clearing arraylist...");
                            numbers.clear();
                            System.out.println("============================");
                            System.out.println("Contents all cleared!");
                            System.out.println("============================");
                            break;
                        case 'n':
                            System.out.println("ArrayList not cleared!");
                            break;
                    }
                    break;
                case 'e':
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid! Please input the proper choice!");

            
    
        } 
	}
	}
}

