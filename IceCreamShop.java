import java.util.Scanner;

public class IceCreamShop
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
       double oneScoop = 2.50;
       
       System.out.println("What flavor would you like?");
       String flavor = input.nextLine();
       
       System.out.println("How many scoops would you like?");
       int numScoops = input.nextInt();
       
       double totalPrice = oneScoop * numScoops;
       
       System.out.println("So that will be" + numScoops + " scoops of ice cream.");
       System.out.println("The flavor being " + flavor + ".");
       System.out.println("That will make your total = " + totalPrice + "$.");
          
       
       
    }
}