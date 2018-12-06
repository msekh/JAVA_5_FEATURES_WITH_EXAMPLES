package Covariant_ReturnType;

public class Test {
    public static void main(String[] args) {
        Engine engine=new Engine();
        Motor m=new Motor("Red",50,engine);
        m.vehicleInfo();
        m.startMotorEngine();
    }
}
