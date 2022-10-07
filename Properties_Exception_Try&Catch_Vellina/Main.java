import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        String myfavoritefoods[] = {"Burger", "Fried Chiken", "Halo2x", "Mang Inasal", "Humba"};
        Scanner Scan = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("   Hello, I am Grasya! ");
        System.out.println("Wanna Know my Favorites? ");
        System.out.println(" ");
        System.out.println("  Index of my Fvorite foods!");
        System.out.println("       ============= ");
        System.out.println("       =           = ");
        System.out.println("       = 1 2 3 4 5 = ");
        System.out.println("       =           = ");
        System.out.println("       ============= ");
        System.out.println(" ");
        System.out.print("Enter the index of my favorite foods you want to know: ");
        int choice = Scan.nextInt();
        try{
            if(choice < 0){
                Scan.close();
                throw new FoodsException("The Index is negative, there is no such index in the menu!");
            }if(choice > 5){
                Scan.close();
                throw new FoodsException("There is no index "+ choice +" and no food!");
            }
            System.out.println(" ");
            System.out.println("Yey! " + myfavoritefoods[choice] +" is one of my favorites. I love it" + ".");
        }catch(FoodsException e){
            System.out.println(e.getMessage());
        }
        Scan.close();
    }
}
