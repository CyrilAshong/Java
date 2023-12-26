package OOP;

public class Intro {
    public static void main(String[] args) {


        Student cyril = new Student(12, "Cyril", 95.67f);
        Student Ashong = new Student(15, "Ashong", 98.43f);
        Student Psycho = new Student(1, "Psycho", 33.45f);

        Student random = new Student ();
        random.name = "Otu";
        System.out.println(random.name);

        System.out.println(Psycho.name);

        Psycho.greeting();
        random.greeting();
        Psycho.changeName("Reborn");
        System.out.println(Psycho.name);
    }
    static class Student {
        int roll;
        String name;
        float marks;

        void greeting () {
            System.out.println("How are you doing " + this.name + "?");
        }
        void changeName (String Newname) {
            this.name = Newname;
        }

        Student () {
            this(2, "Nii", 67.45f);
        }
        Student (int roll, String name, float marks) {
            this.roll = roll;
            this.name = name;
            this.marks = marks;
        }
    }
}
