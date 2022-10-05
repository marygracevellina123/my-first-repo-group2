import javax.security.auth.Subject;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    String a[] = {"Bread","Drinks","Cake","Slice Bread","Corneto"};
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter index");
    int choice = sc.nextInt();
    
    try{
        if(choice < 0 ){
        sc.close();
        throw new Exception("the index is negative");
        
        // System.out.println(a[4]);
        }
        if(choice > 4 ){
        sc.close();
        throw new Exception("Way prutas sa ika" + choice + " nga index");
        
        // System.out.println(a[4]);
        }
        System.out.println(a[choice]);

    }catch (Exception e){
        System.out.println(e.getMessage());
     

    }
    sc.close();
    
  }
    
}

