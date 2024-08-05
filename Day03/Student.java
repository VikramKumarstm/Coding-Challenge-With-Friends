package Day03;

class Student {
    Integer studentId;
    String studentName;
    Character grade;

    Student() {
        this(0, "Don't Know", 'D');
    }

    Student(Integer studentId, String studentName, Character grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }

    public void printStudentDetails() {
        System.out.println("Id :"+ studentId);
        System.out.println("Name :"+ studentName);
        System.out.println("Grade :"+ grade);
    }
    public static void main(String[] args) {
        Student st = new Student(8921, "Sukhnandan Kumar", 'A');
        st.printStudentDetails();
    }
}