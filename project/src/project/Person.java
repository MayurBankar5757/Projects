package project;

public class Person{
    private String name;
    private int age;
    
    public Person(String name, int age){
    this.name  = name;
    this.age = age;
    }
    public static void main (String[]args){
        Person person1 = new Person("Alice",25);
        
        System.out.println("person 1 :"+person1.name+ "Age = "+ person1.age);
    }
}