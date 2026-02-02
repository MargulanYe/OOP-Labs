import java.util.Scanner;

public class StarTriangle {
    private int width;

    public StarTriangle(int width) {
        this.width = width;
    }
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= width; i++) {
            for (int j = 0; j < i; j++) {
                result.append("[*]");
            }
            if (i < width) {
                result.append("\n");
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите ширину треугольника: ");
        if (input.hasNextInt()) {
            int userWidth = input.nextInt();
            StarTriangle triangle = new StarTriangle(userWidth);
            System.out.println("\nВаш треугольник:");
            System.out.println(triangle.toString());
        } else {
            System.out.println("Ошибка: введите целое число.");
        }

        input.close();
    }
}
