package JAVA_5_Covariant_ReturnType;

public class Apple implements Manufacture {
    @Override
    public MobilePhone getProductType() {
        return new MobilePhone();
    }
}
