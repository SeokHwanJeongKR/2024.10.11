package soloEquals;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("id 100");
        User user2 = new User("id 100");

        System.out.println("동일성 테스트 : " + (user1 == user2));
        System.out.println("동등성 테스트 : " + user1.equals(user2) );
    }
}
