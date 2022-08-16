public class mathJavaClass {
    public static void main(String[] args) {
        int calc = Math.addExact(2,22);
        double sqrt =  Math.sqrt(6);
        int max = Math.max(50,1020);
        int min = Math.min(50,1020);

        //Math.random()*(max-min+1)+min) ---> to generate a number in a range
        double randomNumber = Math.random()*(20-1+1)+1;

        System.out.println((int)randomNumber);
    }
}
