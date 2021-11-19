import java.util.Scanner;

class io {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // get an int
        int i = scanner.nextInt();
        System.out.println(i);

        // get a double
        double j = scanner.nextDouble();
        System.out.println(j);

        // get a string
        String str = scanner.next();
        System.out.println(str);

        // get a boolean (true or false)
        boolean bool = scanner.nextBoolean();
        System.out.println(bool);

        // always close scanner after use (just like dispose in flutter)
        scanner.close();
    }    
}
