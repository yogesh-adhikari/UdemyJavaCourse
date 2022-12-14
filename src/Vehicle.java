public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentDirection = 0;
        this.currentVelocity = 0;
    }

    public void steer(int directtion){
        this.currentDirection += directtion;
        System.out.println("vehicle.steer(): Moving at " + currentDirection + "degrees.");
    }

    public void move(int velocity, int direction){
        currentDirection = direction;
        currentVelocity = velocity;
        System.out.println("velocity.move(): moving at " + currentVelocity + "in direction" + currentDirection);
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }
}
