package Day06;

public class ClassRoom {

    String className;
    String students[];

    public ClassRoom(String className, String students[]) {
        this.className = className;
        this.students = students;
    }

    public void showData() {
        System.out.println("Class Name :" + className);
        System.out.print("Students : ");
        for(int i=0; i<students.length; i++) {
            System.out.print(students[i]+" ");
        }
    }
    public static void main(String[] args) {
        String student[] = {"Shashi", "Ashutosh", "Ankit"};
        ClassRoom cr = new ClassRoom("3A",  student);

        cr.showData();
    }
}
