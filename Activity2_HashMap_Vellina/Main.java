

import java.util.HashMap;
import java.util.Scanner;
public class Main {
    
    
    public static void main(String[] args) {
        Character choice, clear;
        Scanner sc=new Scanner(System.in);
        
		HashMap<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        hashmap.put(0, 10);
        hashmap.put(1, 20);
        hashmap.put(2,30);
        hashmap.put(3, 40);
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
        System.out.println("=====================");
        System.out.println("What is your choice :");
        choice = sc.next().charAt(0);
        choice = Character.toLowerCase(choice);
            System.out.println("");
        
            switch(choice){
                case 'a':
                    System.out.println("Note: Only enter composite numbers.");
                    System.out.print("What number you want to add? ");
                    int add = sc.nextInt();
                    System.out.println("");

                    int j = add/2;
                    int isPrime = 0;

                    if(add == 0 || add == 1){
                        System.out.print("Enter key for the number you want to add: ");
                        int key = sc.nextInt();
                        System.out.println("");

                        hashmap.put(key, add);
                        System.out.println(key + "=>" + add + " is successfully added to the HashMap!");

                    }
                    else{
                        for(int i = 2; i <= j; i++){
                            if(add%i == 0){
                                System.out.print("Enter key for the number you want to add: ");
                                int key = sc.nextInt();
                                System.out.println("");

                                hashmap.put(key, add);
                                System.out.println(key + "=>" + add + " is successfully added to the HashMap!");
                                isPrime = 1;
                                break;
                            }
                        }
                        if(isPrime == 0){
                            System.out.println("The number you enter is a prime number. It is not added in the HashMap. Enter a not prime number!");
                        }
                    }

                    break;
                case 'b':
                    System.out.print("What key you want to remove? ");
                    int remove = sc.nextInt();
                    System.out.println("");

                    if(hashmap.containsKey(remove)){
                        System.out.println(remove + "=>" + hashmap.get(remove) + " is successfully removed!");
                        hashmap.remove(remove);
                    }

                    break;

                case 'c':

                    System.out.println("Numbers in yourHashMap");
                    System.out.println("============================");

                    hashmap.entrySet().forEach(entry -> {
                        System.out.println(entry.getKey() + "=>" + entry.getValue());
                    });


                    System.out.println("============================");

                    break;

                case 'd':

                            hashmap.clear();
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




