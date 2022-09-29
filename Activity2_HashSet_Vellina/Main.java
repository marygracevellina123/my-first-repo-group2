
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
                    System.out.print("What number you want to add? ");
                    int add = sc.nextInt();
                    System.out.println("");
                    
                    if(add < 0){
                        System.out.println("Invalid! Please add positive number!");
                        
                    }else if(numbers.contains(add)){
                        System.out.println("Value already exists! Value not added!");


                    }
                    else{
                        numbers.add(add);
                        System.out.println("Number " + add + " is successfully added to the HashSet!");
                    }

                    break;

                    
                case 'b':
                    System.out.print("What number you want to remove? ");
                    int remove = sc.nextInt();
                    System.out.println("");

                    if(numbers.contains(remove)){
                        numbers.remove(Integer.valueOf(remove));
                        System.out.println("Number " + remove + " is successfully removed!");
                        break;
                    }
                    
                case 'c':
                    System.out.println("Numbers in YOUR ArrayList");
                    System.out.println("============================");
                    
                        System.out.println(numbers);
                    
                    System.out.println("============================");
                    break;

                case 'd':
                            numbers.clear();
                            System.out.println("============================");
                            System.out.println("Contents all cleared!");
                            System.out.println("============================");
                            break;
                case 'e':
                    sc.close();
                    System.out.println("Thank You!");
                    System.exit(0);
                   
                default:
                    System.out.println("Invalid! Please input the proper choice!");

            
    
        } 
	}
	}
}





