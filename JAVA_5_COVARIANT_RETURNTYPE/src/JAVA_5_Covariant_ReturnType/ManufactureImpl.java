package JAVA_5_Covariant_ReturnType;

public class ManufactureImpl {
    public static void main(String[] args) throws CloneNotSupportedException {
        Apple s1 = new Apple();
        MobilePhone b1 = s1.getProductType();

        b1.makeProduct("iPhone8", "Mahadi", 1234);
        MobilePhone b2 = b1.clone();
        b2._ownerName = "Maenul";
        b2._IMEINo = 6789;
        System.out.println("IMEI Number Of Phone1->" + b1._IMEINo);
        System.out.println("IMEI Number Of Phone2->" + b2._IMEINo);
        System.out.println("Owner of Phone2-> " + b2._ownerName);

        Samsung f1 = new Samsung();
        WashingMachine w1 = f1.getProductType();
        w1.makeProduct("samsungWashingMachine", "Sekh", 2014);

        System.out.println("Owner Name Of WasingMachine->" + w1._ownerName);
    }
}
