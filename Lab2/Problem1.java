import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите ID: ");
        String id = in.nextLine();
        Student s = new Student(name, id);
        System.out.println("\n--- Информация о студенте ---");
        System.out.println("Имя: " + s.getName());
        System.out.println("ID:  " + s.getId());
        System.out.println("Курс: " + s.getYearOfStudy());
        s.incrementYearOfStudy();
        System.out.println("Новый курс: " + s.getYearOfStudy());
    }
}

class Student {
    private String name;
    private String id;
    private int yearOfStudy;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 1;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void incrementYearOfStudy() {
        this.yearOfStudy++;
    }
}
