import java.lang.reflect.Array;
import java.util.Arrays;

public class arraysInJava {
    public static void main(String[] args) {
        String[] name = {"Neeraj","Raju","Micheal","Rahul","Vikas"};
        System.out.println(Arrays.toString(name));
        System.out.println(name[3]);

        String[] surname = new String[10];
        surname[9] = "Tripathi";
        System.out.println(Arrays.toString(surname));



    }
}
