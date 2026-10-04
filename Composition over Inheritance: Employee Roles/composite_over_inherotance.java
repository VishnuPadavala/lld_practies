import java.util.*;

interface Payable{
    void payment();
}
interface Manageable{
    void addemployee(Employee emplo);
}
interface Reportable{
    void report();
}
class Person{
    String name;
    String phoneno;
    Person(String name,String phoneno){
        this.name=name;
        this.phoneno=phoneno;
    }
}
class Reportgenarate{
    public void genaratereport(String name){
        System.out.println(name+"report genarated");
    }
}
class Paymentgenarate{
    public void genaratepayment(String name){
        System.out.println(name+"payment genarated");
    }
}

class Employee implements Payable,Reportable{
    Person person;
    int salary;
    Employee(String name,String phoneno,int salary){
        this.person=new Person(name,phoneno);
        this.salary=salary;
    }
    void payment(){
        Paymentgenarate.genaratepayment(person.name);
    }
    void report(){
        Reportgenarate.genaratereport(person.name);
    }
}
class Manager implements Payable,Reportable,Manageable{
    Person person;
    int salary;
    List<Employee>l=new ArrayList<>();
    Manager(String name,String phoneno,int salary){
       this.person=new Person(name,phoneno);
       this.salary=salary;
    }
    void payment(){
        Paymentgenarate.genaratepayment(person.name);
    }
    void report(){
        Reportgenarate.genaratereport(person.name);
    }
   void addemployee(Employee emplo){
        l.add(emplo);
        System.out.println(emplo.person.name);
   }
}

class Comtractor implements Payable{
    Person person;
    int salary;
    int contractDuration;
    Contractor(String name,String phoneno,int salary,int contractDuration){
        this.person=new Person(name,phoneno);
        this.salary=salary;
        this.contractDuration = contractDuration;
    }
    void payment(){
        Paymentgenarate.genaratepayment(person.name);
    }
}

public class main{
    public static void main(String[] args){
        Employee e1=new Employee("vishnu","99325",30000);
        Employee e2=new Employee("srija","93234",40000);
        Employee e3=new Employee("vardhan","99429",20000);
        Manager m1=new Manager("siri","23455",70000);
        m1.addemployee(e1);
        m1.addemployee(e2);
        Manager m2=new Manager("sai","24555",80000);
        m2.addemployee(e3);
        e1.report();
        m1.report();
        Contractor c1=new Contractor("manish","12345",40000,30);
        c1.payment();
    }
}
