
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — "+fullName);
    }
    public static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullName.toUpperCase());
    }

    public static void task3() {
        String fullName = "Иванов Семён Семёнович";
        fullName = fullName.replace("ё","е");
        System.out.println("Данные ФИО сотрудника — "+fullName);
    }
}