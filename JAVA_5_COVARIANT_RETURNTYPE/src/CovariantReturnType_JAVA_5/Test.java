package CovariantReturnType_JAVA_5;

public class Test {
    public static void main(String[] args) {
        Flower f=new Flower();
        Region r = new Region();
        Barisal b = new Barisal();

        String str = b.yourNationalFlower().whatsYourName();
        System.out.println(str);


    }
}
