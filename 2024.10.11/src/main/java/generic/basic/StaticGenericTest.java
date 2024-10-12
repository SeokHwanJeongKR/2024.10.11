package generic.basic;

public class StaticGenericTest {
    public static void main(String[] args) {
        test1();
    }

    static void test1() {

        String test1Result = MyStaticGeneric.test1("Hello");
        MyStaticGeneric.test1("Hello");
        MyStaticGeneric.test1(1);
        MyStaticGeneric.test1(false);
        System.out.println();
        MyStaticGeneric.test2("Hello2?");
        MyStaticGeneric.test2(1);
        MyStaticGeneric.test2(false);

        System.out.println("test1Result = " + test1Result);
    }
}
