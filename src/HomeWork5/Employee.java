package HomeWork5;

public class Employee {
    String name;
    String patronymic;
    String surname;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Employee (String name, String patronymic, String surname,
                          String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.patronymic = patronymic;
        this.surname = surname;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void print () {
        System.out.print ("Сотрудник:\n" + name + " " + patronymic + " " + surname + "\n" + age + " лет" + "\n"
                + "Должность: " + position + "\n" + "Зарплата: " + salary + "\n" + email + "\n" + phone );
    }
}
