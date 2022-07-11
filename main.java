import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        Car[] cars = new Car[]{
                new Car("Nissan", 5000, 2022, "Black", new String[]{"tires","Key"}),
                new Car("BMW",6000, 2023, "RED", new String[]{"Break","Key"}),
                new Car("Dodge", 5000, 2022, "yellow", new String[] {"Glasses", "Bumpers", "Doors"}),
                new Car("Toyota",3000, 2023, "Jet Black", new String[]{"Break","Key"}),
                new Car("Shafle",4000, 2023, "Sky Blue", new String[]{"Break","Key"})
        };

        dealerShip Dealer = new dealerShip(cars);
        System.out.println("\\n ****** JAVA DEALERSHIP! ****** \\n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome! Enter the type of car you're looking for: ");
        String make = scan.nextLine();
        System.out.println("Enter Your Budget: ");
        int budget = scan.nextInt();
        int index =Dealer.search(make,budget);


        switch (index){
            case 404: System.out.println("Feel free to browse our collections of cars\n");
            System.out.println(Dealer);
            break;
            default: scan.nextLine();
            String decision = scan.nextLine();
            if(decision.equalsIgnoreCase("yes")){
                Dealer.sell(index);
            }
        }
        scan.close();
    }

}
