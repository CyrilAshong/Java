package Enculpsulation;

public class User {
    private String name;
    private String Id;
    private String gender;
    private String courseCode;

    public User () {
        this.name = "Default";
        this.Id = "00000000";
        this.gender = "male";
    }
    public User (String name, String Id, String gender) {
        this.name = name;
        this.Id = Id;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return Id;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        Id = id;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void addCourseCode(String courseCode) {
        this.courseCode = courseCode;

    }
    public static void greeting() {
        System.out.println("Hello! how are you doing?");
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
