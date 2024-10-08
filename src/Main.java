public class Main {

    public static void main(String[] args) {
        //задача 1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        System.out.println("Ф. И. О. сотрудника - " + lastName + " " + firstName + " " + middleName);

        //задача 2
        String fullName = "Ivanov Ivan Ivanovich";
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());
        //задача 3
        String name = "Иванов Семён Семёнович";
        System.out.println("Данные Ф. И. О. сотрудника — " + name.replace("ё", "e"));
    }
}

