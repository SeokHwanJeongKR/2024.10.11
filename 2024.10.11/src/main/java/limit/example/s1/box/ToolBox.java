package limit.example.s1.box;

import limit.example.s1.Tool;
// toolBoxrk 생성 될때 <T extends Tool>이 확정
public class ToolBox<T extends Tool> extends Box<T> {

    public ToolBox(T content) {
        super(content);
    }

    @Override
    public void open() {
        //위에서 Type을 Tool 타입으로 제한 했기에 Tool의 메소드를 불러 올 수 있음content.getName();
        System.out.println("저는 " + content.getName() + "을/를 가지고 있습니다");
    }



}
