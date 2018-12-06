package CovariantReturnType_JAVA_5;

 class Flower {
    public String whatsYourName(){
        return "I have many names and types";
    }
}

class Jasmine extends Flower{
    @Override
    public String whatsYourName() {
        return "Jasmine";
    }
}

class Lilly extends Flower{
    @Override
    public String whatsYourName() {
        return "Lilly";
    }
}

class Lotus extends Flower{
    @Override
    public String whatsYourName() {
        return "Lotus";
    }
}