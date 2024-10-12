package limit.example.s1;

import limit.example.s1.Packager.Packager;
import limit.example.s1.box.Box;
import limit.example.s1.box.InstallableToolBox;
import limit.example.s1.box.PortableToolBox;
import limit.example.s1.box.ToolBox;
import limit.example.s1.others.Apple;
import limit.example.s1.tools.Hammer;
import limit.example.s1.tools.HugeCrowbar;

public class LimitGenericTypeTests {

    public static void main(String[] args) {
        test1();
        System.out.println();
        test2();
        System.out.println();
        test3();
        System.out.println();
        test4();
    }

    static void test1() {
        System.out.println("LimitGenericTypeTests.test1");
        Apple apple = new Apple();
        Box<Apple> appleBox = new Box<>(apple);
        appleBox.open();
        appleBox.close();

    }

    static void test2() {
        System.out.println("LimitGenericTypeTests.test2");

        Apple apple = new Apple();
        Hammer hammer = new Hammer();

        //new ToolBox<>(apple);
        ToolBox<Hammer> hammerToolBox = new ToolBox<>(hammer);
        hammerToolBox.open();
        hammerToolBox.close();

    }

    static void test3() {
        System.out.println("LimitGenericTypeTests.test3");


        Hammer hammer = new Hammer();
        HugeCrowbar hugeCrowbar = new HugeCrowbar();

        PortableToolBox<Hammer> tinyBox = new PortableToolBox<>(hammer);
        tinyBox.open();
        tinyBox.close();


        InstallableToolBox<HugeCrowbar> hugeBox = new InstallableToolBox<>(hugeCrowbar);
        hugeBox.open();
        hugeBox.close();
    }
    static void test4() {
        System.out.println("LimitGenericTypeTests.test4");

        Hammer hammer = new Hammer();
        HugeCrowbar hugeCrowbar = new HugeCrowbar();
        PortableToolBox<Hammer> tinyBox = new PortableToolBox<>(hammer);
        InstallableToolBox<HugeCrowbar> hugeBox = new InstallableToolBox<>(hugeCrowbar);


        Apple apple = new Apple();
        Box<Apple> appleBox = new Box<>(apple);

        Packager.closePortableBox(tinyBox);
        Packager.closeistallableBox(hugeBox);
        Packager.closeBox(appleBox);
        Packager.closeBox(hugeBox);

    }


}
