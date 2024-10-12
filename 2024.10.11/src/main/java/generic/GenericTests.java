package generic;

import generic.basic.MyGeneric;

public class GenericTests {
    public static void main(String[] args) {
        test1();
        test2();
        test3();
    }

    static void test1() {

        System.out.println("GenericTests.test1");

        //MyGeneric<Object, Object, Object> objectObjectObjectMyGeneric = new MyGeneric<>();
        MyGeneric<String, String, String> generic = new MyGeneric<>();

        generic.setKey("key");
//            generic.setKey(1);
        generic.setType("type");
//            generic.setType(1);
        generic.setValue("value");

        System.out.println(generic.toString());
    }
    static void test2() {

        System.out.println("GenericTests.test2");
        MyGeneric<String, Integer, Boolean> generic = new MyGeneric<>();

        generic.setKey("key");
//        generic.setKey(1);
        generic.setValue(1);
        generic.setType(false);

        System.out.println(generic.toString());


    }
    static void test3() {
        System.out.println("GenericTests.test3 - 1");

        MyGeneric<String, String, Boolean> generic1 = new MyGeneric<>();
        generic1.setKey("key");
        generic1.setType(false);
        generic1.setValue("value");

        System.out.println(generic1.toString());

        MyGeneric<String, Boolean, String> generic2 = new MyGeneric<>();

        System.out.println("GenericTests.test3 - 2");

        generic2.setKey("key");
        generic2.setValue(true);
        generic2.setType("Type");
        System.out.println(generic2.toString());
    }

}
