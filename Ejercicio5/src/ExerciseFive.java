import java.util.Locale;
import java.util.StringJoiner;
public class ExerciseFive {
    public static void main(String args[]) {
        String[] array = {"FirstWorld", "SecondWorld", "THIRDWORLD"};
        StringJoiner joiner = new StringJoiner(" ");
        for(int i = 0; i < array.length; i++) {
            joiner.add(array[i]);
        }
        String str = joiner.toString().toLowerCase(Locale.ROOT);
        System.out.println(str);
    }
}

