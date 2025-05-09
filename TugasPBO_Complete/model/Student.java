package model;

import service.Displayable;

public class Student extends Person implements Displayable {
    private int classLevel;

    public Student(String name, String id, int classLevel) {
        super(name, id);
        this.classLevel = classLevel;
    }

    @Override
    public void showInfo() {
        System.out.println("Nama: " + name);
        System.out.println("NIM: " + id);
        System.out.println("Kelas: " + classLevel);
    }

    @Override
    public String getDisplayText() {
        return name + " - " + id + " - Kelas " + classLevel;
    }
}