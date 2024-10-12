package limit.example.s1.box;


//T = tool
public class Box<T> {
    //box T 타입이 만들어 질때 T의 타입이 정해짐
    T content;


    public Box(T content) {
        this.content = content;
    }

    public void open() {
        System.out.println("뚜껑을 열었습니다");
        System.out.println("저는 " + content + "을/를 가지고 있습니다!");
    }

    public void close() {
        System.out.println("뚜껑을 닫았습니다.!");
    }




}
