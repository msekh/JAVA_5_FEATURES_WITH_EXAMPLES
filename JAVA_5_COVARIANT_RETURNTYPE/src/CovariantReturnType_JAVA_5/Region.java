package CovariantReturnType_JAVA_5;

class Region {
    Flower yourNationalFlower(){
        return new Flower();
    }
}

class Barisal extends Region{
    @Override
    Jasmine yourNationalFlower() {
        return new Jasmine();
    }
}

class Dhaka extends Region{
    @Override
    Lilly yourNationalFlower(){
        return new Lilly();
    }
}

class Khulna extends Region{
    @Override
    Lotus yourNationalFlower(){
        return new Lotus();
    }
}