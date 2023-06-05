public class Car extends Transport{
    int VINnumber;
    int stateNumber;

    public Car(String name, int numberOfSeats) {
        super(name, numberOfSeats);
    }


    public void move(){
        System.out.println("car is moving");

    }
}
