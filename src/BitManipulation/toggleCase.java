package BitManipulation;

public class toggleCase {
    static char convertCharToUpperCase(int num){
        //unset the 5th bit
//        return (char)(num & ~(1<<5));
        return (char)(num & '_');
    }
    static char convertCharToLowerCase(int num){
        //set the 5th bit
//        return (char)(num | (1<<5));
        return (char)(num | ' ');
    }

    public static void main(String[] args) {
        char ch = convertCharToLowerCase('A');
        char ch1 = convertCharToUpperCase('a');
        System.out.println(ch);
        System.out.println(ch1);

    }
}
