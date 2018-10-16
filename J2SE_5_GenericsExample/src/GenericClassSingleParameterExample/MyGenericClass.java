package GenericClassSingleParameterExample;

public class MyGenericClass<T> {
private T object;

public MyGenericClass(T object) {
	this.object=object;
}
public T getObject() {
	return object;
}
}
