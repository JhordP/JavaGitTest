import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("What's your name?");
        Scanner in = new Scanner(System.in);
        var name = in.nextLine();
<<<<<<< HEAD
        System.out.println("Hello, "+name+". What's your age?");
        var edad = in.nextInt();

        System.out.println("User data: \nName: "+name+"\nAge: "+edad);

=======
        System.out.println("Hello, "+name+". Job?");
        var job = in.nextLine();

        System.out.println("User data: \nName:"+name+"\nJob:"+job);
>>>>>>> ocup
        in.close();
    }
}
