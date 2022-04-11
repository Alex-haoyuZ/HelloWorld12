import java.lang.reflect.Array;
import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {
        double a = (5*86.7-5*5.5*10.1)/ ((150*150)*38.5-(150*150)*(5.5*5.5));
        //System.out.println(a);

        double b = ( (150*150) * 1/30 * 10.1 * 38.5 - 1/30 * 150 * 150* 86.7 * 5.5)/ ((150*150) * 38.5 - (150*150) * (5.5*5.5));
        System.out.println(b);
    }
}
