package soloAbstract;

public class Dog implements Animal {

    @Override
    public void move() {
        System.out.println("기본 강아지 걸음");
    }

    @Override
    public void jump() {
        System.out.println("강아지 점프");
    }
}
