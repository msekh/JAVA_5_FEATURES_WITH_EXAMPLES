package JAVA_5_Covariant_ReturnType;

public class WashingMachine implements Product{
    String _productName;
    String _ownerName;
    int _modelNo;


    @Override
    public void makeProduct(String productName, String ownerName, int modelNo) {
        _productName=productName;
        _ownerName=ownerName;
        _modelNo=modelNo;
    }
}
