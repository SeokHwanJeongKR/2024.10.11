package limit.example.s1.tools;


import limit.example.s1.Installable;
import limit.example.s1.Tool;

public class HugeGrinder extends Tool implements Installable {

    private final String name = "Huge_Grinder";

    @Override
    public void installable() {
        System.out.println("저는 가지고 다닐 수 없습니다");

    }

    @Override
    public String getName() {
        return this.name;
    }
}
