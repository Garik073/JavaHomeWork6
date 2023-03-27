

public class App {
    //String name, String surname, String Patronymic, int age, String gender,  String Work,int Salary )
    public static void main(String[] args) throws Exception {
        Person[] people = new Person[]{

        new Person("Алексей", "Николаевич","Быстров",45 ,"М", "Гуливер",50000),
        new Person("Александр", "Сергеевич","Пушкин",75 ,"М", "Гуливер",75000),
        new Person("Иванов", "Евгений","Михалович",19 ,"М", "Гуливер",20000),
        new Person("Албина ", "Петровна","Зайцева",25 ,"Ж", "Магнит",30000),
        new Person("Александра", "Николаевна","Домовая",18 ,"Ж", "Магнит",50000),
        new Person("Лариса", "Александровна","Лукина",45 ,"М", "Гуливер",100000),
        new Person("Максим", "Савельев","Олегович",20 ,"М", "Магнит",40000)};

        System.out.println(" Все кому болше 20 лет: ");
for (Person person : people) {
    if (person.getAge() > 20) {
        System.out.println(person);
    }
}
System.out.println(" Все кто работают в Магнит: ");
for (Person person : people) {
    if (person.getWork() == "Магнит") {
        System.out.println(person);
    }
}
System.out.println(" Все  у кого зарплата больше 20000 : ");
for (Person person : people) {
    if (person.getSalary() > 20000) {
        System.out.println(person);
    }
}
}
}

    


        