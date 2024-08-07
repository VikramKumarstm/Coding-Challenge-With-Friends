package Day05;

public class Student {

    String name;
    Character grade;

    public Student(String name, Character grade) {
        this.name = name;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGrade(Character grade) {
        this.grade = grade;
    }

    public Character getGrade() {
        return grade;
    }

    public void displayStudentDetails() {
        System.out.println("Student Name : " + name);
        System.out.println("Student Grade : "+ grade);
    }
    public static void main(String[] args) {
        Student st1 = new Student("Sukhnandan", 'S');
        Student st2 = new Student("Ashutosh", 'A');
        Student st3 = new Student("Shashikant", 'S');
        st1.displayStudentDetails();
        st2.displayStudentDetails();
        st3.displayStudentDetails();

    }
}
