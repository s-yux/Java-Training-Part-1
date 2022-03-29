package Week4.Day16_FileIO;

import java.io.*;

class Actor implements Serializable {
    String name;
    int age;
    float height;

    Actor(String name, int age, float height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}

public class SerializableRunner {

    public static void main(String[] args) throws Exception {
        Actor a1 = new Actor("Haziq", 28, 178.5f);
        a1.display();

        String path = "C:\\Users\\PC-2G4\\IdeaProjects\\Training\\src\\Week4\\Day16_FileIO\\files\\output.txt";

        FileOutputStream fos = new FileOutputStream(path);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Actor a2 = (Actor) ois.readObject();
        a2.display();
    }
}
