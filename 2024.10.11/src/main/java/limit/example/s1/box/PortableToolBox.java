package limit.example.s1.box;

import limit.example.s1.Portable;
import limit.example.s1.Tool;

//도구 상자를 Tool을 상속 받음과 동시에 Portable을 구현해야 한다는 제한을 부여

public class PortableToolBox<T extends Tool & Portable> extends Box<T> {

    public PortableToolBox(T content) {
        super(content);
    }

    @Override
    public void open() {
        System.out.println("저는 " + content.getName() + "을 / 를 가지고 있습니다");
        content.portable();
    }
}
