package JAVA_5_Covariant_ReturnType;

public class Samsung implements Manufacture {
    @Override
    public WashingMachine getProductType() {
        return new WashingMachine();
    }
}
