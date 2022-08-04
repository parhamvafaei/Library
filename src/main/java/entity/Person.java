package entity;

abstract class Person {
    int id;
    String name;
    Role role ;

    public void setName(String name) {
        this.name = name;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }
}
