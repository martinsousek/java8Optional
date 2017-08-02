import java.util.Optional;

/**
 * Created by martin on 02.08.17.
 */
public class Main {

    public static void main(String[] args){

        // Throws NPE
        //Optional<String> opt = Optional.of(null);

        Optional<String> optNull = Optional.ofNullable(null);

        Optional<String> optEmpty = Optional.empty();

        optEmpty.ifPresent(s -> System.out.println(s));

        Optional<String> s = Optional.of("abcdefg");

        s.filter(s1 -> s1.contains("ab")).ifPresent(s1 -> System.out.println(s1));

        s.map(String::length).filter(integer -> integer > 1).ifPresent(st -> System.out.println(st));

        Optional<String> name = Optional.of("Martin");
        int len = name.map(String::length).orElse(-1    );


    }
}
