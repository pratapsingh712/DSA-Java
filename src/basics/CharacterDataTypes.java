package basics;

public class CharacterDataTypes {
    public static void main(String[] args) {

//        char ch = 's';
//
//        System.out.println(ch);
//
//        char ch1 = 'e';
//
//        System.out.println(ch1);
//
//        char ch2 = 'A';
//
//        int s = ch2; // implicit type casting
//
//        System.out.println(s);
//
//        char ch3 = 'a';
//
//        int y = (int) ch3; // redundant explicit type cast not needed here
//
//        System.out.println(y);
//
//        char ch4 = '3';
//
//        System.out.println((int)ch4);

//        char ch = 'a';
//
//        System.out.println(ch+ch);
//
//        char ch1 = '9';
//
//        System.out.println(ch1+0);
//
//        int x = 99;
//
//        char chx = (char) x;
//
//        System.out.println(chx);

        for(char ch = 'a'; ch<='z'; ch++){
            System.out.print(ch+" ");
        }

        System.out.println();

        for(int i=32;i<127;i++){
            System.out.print((char)i+" ");
        }
    }
}
