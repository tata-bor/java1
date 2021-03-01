import HomeWork5.Employee;

public class Main {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Ivan", "Ivanovich",
                "Ivanov", "Engineer", "ivivan@mailbox.com",
                "892312312", 30000, 30);
        employeeArray[1] = new Employee("Sidor", "Sidorovich",
                "Sidorov", "Engineer", "sidorov@mailbox.com",
                "89096788989", 33000, 45);
        employeeArray[2] = new Employee("Petr", "Petrovich",
                "Petrov", "Engineer", "petrov@mailbox.com",
                "89999999999", 35000, 42);
        employeeArray[3] = new Employee("Kuzma", "Kuzmich",
                "Kuzmichev", "Engineer", "kuzmichev@mailbox.com",
                "88888888888", 31000, 39);
        employeeArray[4] = new Employee("Nikita", "Nikitich",
                "Nikitichev", "Engineer", "nikitichev@mailbox.com",
                "80006667788", 40000, 25);
        print(employeeArray);
    }

    public static void print(Employee[] Employees) {
        for (int i = 0; i < 5; i++) {
            if (Employees[i].age >= 40) {
                Employees[i].print();
            }
        }
    }
}

