package Enculpsulation;

public class College {
    public static void main(String[] args) {
        Lecturer lecturer1 = new Lecturer("Asamoah", "12345678", "Male", "Logic Gates");

        lecturer1.addCourseCode("Calculus");

        System.out.println(lecturer1.getId());

        System.out.println(lecturer1.getCourseCode());

    }
}
