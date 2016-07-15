package net.heavencraft.operators;

class MyObject {

    private final int value;

    MyObject(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }

    public MyObject add(MyObject object) {
        return new MyObject(value + object.getValue());
    }

}
