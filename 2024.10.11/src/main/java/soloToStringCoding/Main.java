package soloToStringCoding;

public class Main {

    public static void main(String[] args) {
        Object dog = new Dog("바보", 20);


        System.out.println(dog);
        // println 은 기본적으로 toString을 연동 하고 있음

        ObjExtendsToString.add(dog);

    }
}
