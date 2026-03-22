package Bai1.LibraryManagement.Observer;

public class User implements Observer {
    String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String msg) {
        System.out.println(name + " received: " + msg);
    }
}
