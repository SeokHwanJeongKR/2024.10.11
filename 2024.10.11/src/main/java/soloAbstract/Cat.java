package soloAbstract;

public class Cat implements Animal {
    @Override
    public void move() {
        System.out.println("엄청 빠르게 걷는 고양이");
    }
    public void move(int a) {
        System.out.println(a + " 배 의 가속도를 더 받을 수도 있다! 슈퍼 고양이다 ");
    }

    @Override
    public void jump() {

        System.out.println("무려 1m 점프를 한다?!");
    }
}
