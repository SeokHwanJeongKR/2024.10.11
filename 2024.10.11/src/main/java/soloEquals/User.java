package soloEquals;

public class User {

    private String id;


    public User(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        //Object 를 왜 받는가? equals는 당연히 Object의 메서드니까 받는다.
        //그러면 아래의 캐스팅은?
        //당연히 부모 클래스의 타입을 자식은 알 수 있지만 부모는 자식의 타입을 모르니까
        //
        User user = (User) obj;
        return this.id.equals(user.id);
    }
}
