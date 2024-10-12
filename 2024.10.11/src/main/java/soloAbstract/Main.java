package soloAbstract;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        DogV2 dogV2 = new DogV2();

        dog.move();
        dog.jump();
        System.out.println();
        cat.move();
        cat.move(10);
        cat.jump();
        System.out.println();
        dogV2.move();
        dogV2.jump();

    }

    // 1.동물이 존재 한다
    // 2.동물들은 걷고 점프가 가능하다

    // 1. 강아지란 동물이 존재하며 걷고 점프가 가능하다. 기본 강아지 걸음 , 강아지 점프가 가능하다.
    // 2. 고양이란 동물이 존재하며 걷고 점프가 가능한데 빠르게 걷고 1m 점프와, 1km/h로 달릴 수있다

    // 동물을 강아지랑 고양이가 완성 해야하며
    // 각각의 특색을 지켜야한다.
}
