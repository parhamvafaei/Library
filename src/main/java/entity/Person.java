package entity;

abstract class Person {
    int id;
    String name;
    Role role ;

    public Person(int id, String name, Role role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }
    public Person(){

    }
}
