public class switchInJava {
    public static void main(String[] args) {

        int i=1;

        switch (i){
            case 1:
                System.out.println("1");
                break;
            case 24:
                System.out.println("24");
                break;
            default:
                System.out.println("Default");
                break;
        }


        String name = "Neeraj";

        switch (name){
            case "JOhn":
                System.out.println("This is john");
                break;
            case "Neeraj":
                System.out.println("This is Neeraj");
                break;
            default:
                System.out.println("Something else");
        }

        //'char, byte, short, int, Character, Byte, Short, Integer, String, or an enum

    }


}
