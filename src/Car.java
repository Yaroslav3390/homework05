public class Car extends Transport{
    int VINnumber;
    int stateNumber;

    public int getVINnumber() {
        return VINnumber;
    }

    public void setVINnumber(int VINnumber) {
        this.VINnumber = VINnumber;
    }

    public int getStateNumber() {
        return stateNumber;
    }

    public void setStateNumber(int stateNumber) {
        this.stateNumber = stateNumber;
    }
    @Override
    public void move(){
        System.out.println("car is moving");

    }
}
