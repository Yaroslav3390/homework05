public class Transport {
    private String name;
    private int numberOfSeats;
    public void move() {
        System.out.println("transport is moving");}
    public void options(){
        System.out.println("can move back and forward");
    }
    public Transport(String name, int numberOfSeats) {
        this.name = name;
        this.numberOfSeats = numberOfSeats;
        System.out.println("new object Transport is created");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;

    }
}
