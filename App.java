import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("What's your name?");
        Scanner in = new Scanner(System.in);
        var name = in.nextLine();
        System.out.println("Hello, "+name+".");
        System.out.println("Can you tell us your age?");
        var age = in.nextInt();
        System.out.println("User data: \nName: "+name+"\nAge: "+age);
        in.close();
    }
}
