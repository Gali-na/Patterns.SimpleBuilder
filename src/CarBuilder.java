public class CarBuilder {
  private   String name ="";
  private  int speed =0;
  private String color="";

  private int numberDoors =0;


    public CarBuilder builderName (String name) {
        this.name = name;
        return this ;
    }

    public CarBuilder builderSpeed (int speed) {
        this.speed = speed;
        return this ;
    }
    public CarBuilder builderColor(String color) {
        this.color = color;
        return this;
    }
    public CarBuilder builderNumberDoors (int numberDoors) {
        this.numberDoors = numberDoors;
        return this;
    }

    public CarBuilder build () {
        return this;
    }

    @Override
    public String toString() {
        return "CarBuilder{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                ", numberDoors=" + numberDoors +
                '}';
    }
}
