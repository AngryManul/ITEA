package People;

public class TestClass {
    public static void main(String[] args) {

        Student halya = new Student("Halya");
        Student vova = new Student("Volodya");
        Student mariya = new Student("Mariya");

        halya.showDetails();
        vova.showDetails();
        mariya.showDetails();

        Student.college = "SuperITEA";
        halya.showDetails();
        vova.showDetails();
        mariya.showDetails();
    }
}
