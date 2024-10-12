package generic.example.S1;

import java.util.Objects;

public class Container <T> {

    private T value;

    private Container(T value) {
        this.value = value;
    }

    public static <T> Container<T> empty() {
        return  new Container<>(null);
    }

    public static <T> Container<T> of(T value) {
        // java Objects
        return new Container<>(Objects.requireNonNull(value));

    }

    public static <T> Container<T> ofNullable(T value) {
        return  value == null
                ? new Container<>(null)
                : new Container<>(value);
    }

    public T get() {
        if (value == null ) {
            throw new NoSuchElementException("No value present");
        }
            return value;
    }

    public boolean ispresent() {
        return value != null;
    }

//    public boolean isEmpty() {
//        return;
//    }

    //컨테이너 객체를 받는 이유가 없음

}



