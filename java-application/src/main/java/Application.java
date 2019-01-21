import io.reactivex.Flowable;

public class Application {

    public static void main(String[] args) {
        Flowable.fromArray("Hello", " ", "world", "!")
                .subscribe(System.out::print);
    }

}
