package Bai1.CompositeDesignPattern;

public class FileLeaf extends FileSystemComponent{

    public FileLeaf(String name) {
        super(name);
    }

    @Override
    public void showInfo() {
        System.out.println("File: " + name);
    }
}
