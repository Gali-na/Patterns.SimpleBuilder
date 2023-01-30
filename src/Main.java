public class Main {
    public static void main(String[] args) {
        CarBuilder car =new  CarBuilder()
                .builderColor("black")
                .builderName("Shcoda")
                .builderNumberDoors(4)
                .builderSpeed(180).build();
        System.out.println( car);

    }
}