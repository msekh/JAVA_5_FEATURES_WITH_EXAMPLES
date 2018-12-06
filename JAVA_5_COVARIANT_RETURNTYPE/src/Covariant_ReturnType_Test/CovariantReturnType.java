package Covariant_ReturnType_Test;


//        Covariant Return Type in java
//        The covariant return type specifies that the return type
//        may vary in the same direction as the subclass.
//        As we know that we can't override any method by changing
//        return type. But since Java-5, it is possible to override
//        method by changing the return type if subclass overrides
//        any method whose return type is Non-Primitive but it
//        changes its return type to subclass type.
//
//        Benefits Of Covariant Return Type:-
//
//        A covariant return is when you override a method and
//        make the return type of the method in the subclass different
//        than the return type of the method in the super class.
//        The return type of the subclass' method must be a subclass
//        of the return type of the super class method. In other
//        words you can make the return type of the subclass method
//        the same or less general.
//
//        More specifically, covariant (wide to narrower) or contravariant (narrow to wider) return type refers to a situation where the return type of the overriding method is changed to a type related to (but different from) the return type of the original overridden method. The relationship between the two covariant return types is usually one which allows substitution of the one type with the other. This usually implies that the return types of the overriding methods will be subtypes of the return type of the overridden method. The below example specifically illustrates such a case. If substitution is not allowed, the return type is invariant and causes a compile error.


class SuperOne
{
    SuperOne get()
    {
        System.out.println("This is get() method of SuperOne class ");
        return  new SuperOne();      // we can also use this keyword here
    };

    void superMessage()
    {
        System.out.println("This is super class method superMessage");
    };
}

public class CovariantReturnType extends SuperOne
{

    @Override
    CovariantReturnType get()  // here we have changed the return type of get() method
    {
        System.out.println("This is get() method of CovariantReturntype class Override by changing data type");
        return new CovariantReturnType();  // we can also use this key word here
    };

    void childMessage()
    {

        System.out.println("This is a child Class Method childMessage");
    };

    public static void main(String[] s)
    {
        SuperOne so= new SuperOne();
        CovariantReturnType crt=new CovariantReturnType();
        so.get().superMessage();
        crt.get().childMessage();
    }
};