package Enculpsulation;

public class Lecturer extends User {
    private String course;

    Lecturer() {
        super ();
        this.course = "Web Development";
    }

    public Lecturer(String name, String Id, String gender, String course) {
        super(name, Id, gender);
        this.course = course;
    }
}
