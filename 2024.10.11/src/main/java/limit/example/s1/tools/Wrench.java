package limit.example.s1.tools;


import limit.example.s1.Portable;
import limit.example.s1.Tool;

public class Wrench extends Tool implements Portable {

    private final String name = "Wrench";

    @Override
    public void portable() {
        System.out.println("저는 가지고 다닐 수 있습니다");

    }

    @Override
    public String getName() {
        return this.name;
    }
}
