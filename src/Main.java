// Клас Person
class Person {
    private String lastName; // Прізвище
    private String firstName; // Ім'я
    private int age; // Вік

    public Person(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    // Гетери та сетери для полів
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Метод для виведення інформації
    public void printInfo() {
        System.out.println("Людина " + lastName + " " + firstName + ", вік: " + age);
    }
}

// Клас Student, успадковується від класу Person
class Student extends Person {
    private String group; // Група
    private String studentId; // Номер студентського квитка

    public Student(String lastName, String firstName, int age, String group, String studentId) {
        super(lastName, firstName, age);
        this.group = group;
        this.studentId = studentId;
    }

    // Гетери та сетери для додаткових полів
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    // Перевизначений метод для виведення інформації
    @Override
    public void printInfo() {
        System.out.println("Студент групи " + group + " " + getLastName() + " " + getFirstName() +
                ", вік: " + getAge() + ". Номер студентського квитка: " + studentId);
    }
}

// Клас Lecturer, успадковується від класу Person
class Lecturer extends Person {
    private String department; // Кафедра
    private double salary; // Зарплатня

    public Lecturer(String lastName, String firstName, int age, String department, double salary) {
        super(lastName, firstName, age);
        this.department = department;
        this.salary = salary;
    }

    // Гетери та сетери для додаткових полів
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Перевизначений метод для виведення інформації
    @Override
    public void printInfo() {
        System.out.println("Викладач кафедри " + department + " " + getLastName() + " " + getFirstName() +
                ", вік: " + getAge() + ". Зарплата: " + salary);
    }
}

// Клас Main для тестування
public class Main {
    public static void main(String[] args) {
        // Створення об'єктів класів Student та Lecturer
        Student student1 = new Student("Іванов", "Олег", 20, "Група А", "S12345");
        Student student2 = new Student("Петров", "Анна", 21, "Група Б", "S67890");
        Lecturer lecturer1 = new Lecturer("Сидоров", "Ігор", 35, "Математика", 5000.0);
        Lecturer lecturer2 = new Lecturer("Коваленко", "Марія", 40, "Фізика", 5500.0);

        // Створення масиву, який містить об'єкти класів Person, Student та Lecturer
        Person[] people = {student1, student2, lecturer1, lecturer2};

        // Виведення інформації про кожний об'єкт за допомогою циклу
        for (Person person : people) {
            person.printInfo();
        }
    }
}
