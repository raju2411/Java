import java.util.ArrayList;

public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        for(int i =0;i<1000;i++){
            name.add("name"+i);
        }
        for (int i=0;i<1000;i++){
            System.out.println(name.get(i));
        }

        System.out.println(name.indexOf("name998"));
    }
}
