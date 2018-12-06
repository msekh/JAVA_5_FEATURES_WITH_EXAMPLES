package JAVA_5_Covariant_ReturnType;

public class MobilePhone implements Product, Cloneable {
    String _productName;
    String _ownerName;
    int _IMEINo;
    MobilePhone _clonedProduct;

    @Override
    public void makeProduct(String productName, String ProductOwner, int IMEINo) {
        _productName = productName;
        _ownerName = _ownerName;
        _IMEINo = IMEINo;
    }

    protected MobilePhone clone() throws CloneNotSupportedException{
        _clonedProduct=(MobilePhone)super.clone();
        return _clonedProduct;
    }
}
