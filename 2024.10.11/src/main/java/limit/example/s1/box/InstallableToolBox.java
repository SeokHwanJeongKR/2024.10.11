package limit.example.s1.box;

import limit.example.s1.Installable;
import limit.example.s1.Tool;

public class InstallableToolBox<T extends Tool & Installable> extends Box<T> {

    public InstallableToolBox(T content) {
        super(content);
    }

    @Override
    public void open() {
        System.out.println("저는 " + content.getName() + "을 / 를 가지고 있습니다");
        content.installable();
    }
}
