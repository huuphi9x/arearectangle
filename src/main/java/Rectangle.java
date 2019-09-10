import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Width: ");
        float width = scanner.nextFloat();
        System.out.println("Enter the Height: ");
        float height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area: "+ area);
    }
}
