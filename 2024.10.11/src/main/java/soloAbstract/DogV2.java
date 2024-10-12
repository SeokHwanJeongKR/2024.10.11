package soloAbstract;

public class DogV2 extends Dog {

    @Override
    public void move() {
        System.out.println("버전 2의 개는 존나 빠름");
    }

    @Override
    public void jump() {
        super.jump();
        System.out.println("버전 2의 개는 미친 점프를함");
    }
}
