
import java.util.Objects;


public class Person {

    String name;
    String surname;
    String patronymic;
    int age;
    String gender;
    String work;
    int salary;

    public Person(String name, String surname, String patronymic, int age, String gender,  String work,int salary ) { 
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.age = age;
        this.gender = gender;
        this.work = work;
        this.salary = salary;
        
     
    }
    public String getName() { 
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPatronymic() {
        return patronymic;
    }
    public String getWork() {
        return work;
    }

    public int getSalary() {
        return salary;
    }

    
    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        boolean objIsPerson = obj instanceof Person;
        if (!objIsPerson) {
            return false;
        }

        Person anotherPerson = (Person) obj;
        return Objects.equals(name, anotherPerson.name)
                && Objects.equals(surname, anotherPerson.surname)
                && Objects.equals(patronymic, anotherPerson.patronymic)
                && Objects.equals(gender, anotherPerson.gender)
                && Objects.equals(work, anotherPerson.work)
                && Objects.equals(salary, anotherPerson.salary)
                && age == anotherPerson.age;
    }
    @Override
    public int hashCode() {
        
        return Objects.hash(name, surname, patronymic, age, gender,work,salary);
       
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %s %s %d", name, surname, patronymic, age, gender,work,salary);
    }
}

