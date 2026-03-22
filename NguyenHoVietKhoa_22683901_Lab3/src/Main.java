import Bai1.CompositeDesignPattern.FileLeaf;
import Bai1.CompositeDesignPattern.Folder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FileLeaf file1 = new FileLeaf("file1.txt");
        FileLeaf file2 = new FileLeaf("file2.txt");

        Folder folder1 = new Folder("Folder1");
        folder1.add(file1);
        folder1.add(file2);

        Folder root = new Folder("Root");
        root.add(folder1);

        root.showInfo();

    }
}