import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {

        String email;
        String username;
        String domain;

        Scanner sc = new Scanner(System.in);
        boolean loop = true;

        while(loop){
            System.out.print("Enter your email: ");
            email = sc.nextLine();

            if(email.length()>40) {
                System.out.println("Enter a smaller email!");
            }else if(email.contains("@gmail.com") ||  email.contains("@yahoo.com")){
                username = email.substring(0, email.indexOf("@"));
                System.out.printf("Your username is: '%s'\n", username);
                domain = email.substring(email.indexOf("@")+1);
                System.out.printf("Your domain is: '%s'\n", domain);
                loop = false;
                }else{
                    System.out.println("Invalid email!");
                }
            }

        }
    }









