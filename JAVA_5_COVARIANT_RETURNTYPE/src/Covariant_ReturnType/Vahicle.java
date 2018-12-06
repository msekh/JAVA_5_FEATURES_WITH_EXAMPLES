package Covariant_ReturnType;

class Vehicle {
    private String color;
    private int maxSpeed;

    public Vehicle(String color, int maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void vehicleInfo(){
        System.out.println("Vehicle color: "+color+", Max Speed: "+maxSpeed);
    }
}

class Motor extends Vehicle {

   private Engine engine;

    public Motor(String color, int maxSpeed, Engine engine) {
        super(color, maxSpeed);
        this.engine = engine;
    }
    public void startMotorEngine(){
        engine.start();
    }
}