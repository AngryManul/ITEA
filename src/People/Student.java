package People;

public class Student {
    String name;
    static String college = "ITEA";

    Student(String newStudentName){
        name = newStudentName;
    }

    void showDetails() {
        System.out.println(name + " " + college);
    }


}

