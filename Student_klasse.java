public class Student_klasse {

    String name;
    int age;
    String studentId;

    public Student_klasse(String name, int age, String studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
    }
    public void printInfo() {
        System.out.println(name + ", " + age + " år gammel.");
        if (studentId != null){
            System.out.println(" ID: "+ studentId);
        }
    }
}
