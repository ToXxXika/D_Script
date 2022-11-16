import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Main {
    //creates a Commandmenu that has as a title DOCKER SCRIPT
    public static void main(String[] args) {
       System.out.println("******* Docker SCRIPT*******");
         System.out.println("1. Create a new container");
         System.out.println("2. Start a container");
            System.out.println("3. Stop a container");
            System.out.println("4. Delete a container");
            System.out.println("5. List all containers");
            System.out.println("6. List all images");
            System.out.println("7. Delete an image");
System.out.println("8. Exit");
            System.out.println("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();



    }

}