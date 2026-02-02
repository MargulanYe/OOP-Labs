import java.util.Scanner;

public class Time {
    private int hour;
    private int minute;
    private int second;

    // Конструктор
    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    // Метод установки времени с проверкой (Validation)
    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("Ошибка: Некорректный ввод времени! Установлено 00:00:00.");
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }
    }

    // Универсальный формат (24-часовой)
    public String toUniversal() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    // Стандартный формат (12-часовой с AM/PM)
    public String toStandard() {
        int standardHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        String period = (hour < 12) ? "AM" : "PM";
        return String.format("%02d:%02d:%02d %s", standardHour, minute, second, period);
    }

    // Метод сложения времен
    public void add(Time other) {
        this.second += other.second;
        this.minute += this.second / 60;
        this.second %= 60;

        this.minute += other.minute;
        this.hour += this.minute / 60;
        this.minute %= 60;

        this.hour = (this.hour + other.hour) % 24;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите время (часы, минуты, секунды через пробел):");
        int h = input.nextInt();
        int m = input.nextInt();
        int s = input.nextInt();

        Time t1 = new Time(h, m, s);
        
        System.out.println("Universal format: " + t1.toUniversal());
        System.out.println("Standard format: " + t1.toStandard());

        // Пример сложения
        System.out.println("\nВведите второе время для прибавления:");
        int h2 = input.nextInt();
        int m2 = input.nextInt();
        int s2 = input.nextInt();
        
        Time t2 = new Time(h2, m2, s2);
        t1.add(t2);
        
        System.out.println("Результат после сложения (Universal): " + t1.toUniversal());
        
        input.close();
    }
}
