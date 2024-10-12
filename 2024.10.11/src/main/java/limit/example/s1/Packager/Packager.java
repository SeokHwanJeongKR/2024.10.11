package limit.example.s1.Packager;


import limit.example.s1.Installable;
import limit.example.s1.Portable;
import limit.example.s1.box.Box;

public class Packager<T>  {

    //상자를 닫는다.
    public static void closePortableBox(Box<? extends Portable> box) {
        box.close();
    }
    // installable, portable 는 생성 없이 상자를 닫아주고
    public static void closeistallableBox(Box<? extends Installable> box) {
        box.close();
    }

    public void close(Box<T> box) {
        box.close();
    }

    public static void closeBox(Box<?> box) {
        box.close();
    }

    // 1.installable 만 닫아주는 메서드
    // 2.portable 만 닫아주는 메서드

    // 인스턴스 생성뒤

    // 1. 그냥 box 닫기

    // box는 인스턴스로 닫아 줍니다.

}
