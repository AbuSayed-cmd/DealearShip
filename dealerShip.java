import java.util.Arrays;

public class dealerShip {
    private Car[] cars;

    public dealerShip(Car[] cars){
        this.cars = new Car[cars.length];
        for (int i = 0; i < cars.length; i++) {
            this.cars[i]= new Car(cars[i]);
        }
    }

    public void setCar(Car car, int index) {
        this.cars[index] = new Car(car);
    }

    public Car getCar(int index) {
        return new Car(this.cars[index]);
    }

    public void  sell(int index){
        this.cars[index].drive();
        this.cars[index]=null;
    }
    public int search(String make, int budget){
        for (int i = 0; i < this.cars.length; i++) {
            if(this.cars[i]== null){
                continue;
            }else if(this.cars[i].getMake().equalsIgnoreCase(make) && this.cars[i].getPrice() <= budget){
                System.out.println("\nWe found a car in spot" +i+ "\n\n" +this.cars.toString());
                System.out.println("if you are interested, type 'yes'");
                return i;
            }

        }
        System.out.println("\nYour Search didn't match any result");
        return 404;
    }
    public String toString(){
        String temp ="";
        for (int i = 0; i < this.cars.length; i++) {
            temp += "Parking Spot: " +i+ "\n";
            if(this.cars[i] == null){
                temp +="Empty";
            }else{
                temp += this.cars[i].toString() +"\n";
            }


        }
        return temp;
    }

}
