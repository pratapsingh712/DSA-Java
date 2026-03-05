package basics;

public class ModuloBasics {
    public static void main(String[] args) {

        // Rule one is a is smaller than b you get a

        System.out.println(5%10);

        // Rule two is -b is negative you get a%b

        System.out.println(5%-2);

        // Rule three is -a negative then output becomes -(a%b)
        // or if you have both -a and -b then output is -(a%b)

        System.out.println(-5%-2);
    }
}
