package Bai1.CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileSystemComponent {
    private List<FileSystemComponent> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void add(FileSystemComponent component) {
        children.add(component);
    }

    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    @Override
    public void showInfo() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : children) {
            component.showInfo();
        }
    }
}
