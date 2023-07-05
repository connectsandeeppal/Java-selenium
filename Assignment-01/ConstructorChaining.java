class Person {
    private String name;
    private int age;
    public Person() {
        System.out.println("Default Constructor:");
    }
    public Person(String name) {
         this.name = name;
         System.out.println("Constructor with Name:"+ name);
       
      
    }  
    private void details() {
        System.out.println("Name: " + name + " and Age: "+ age);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        details();
    }

}
class Employee extends Person {
    private String dept;

    public Employee(String name, int age, String dept) {
        super(name, age);
        this.dept = dept;
        System.out.println("Department of Employee " + name + ": " + dept);
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Person person1=new Person();
        Employee emp=new Employee("sandeep",25,"QA");
    }

    
}
