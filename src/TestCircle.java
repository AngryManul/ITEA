public class TestCircle {
    public static void main(String[] args) {
        Circle ourFirstCircle = new Circle();
        ourFirstCircle.radius = 10;
        double area = ourFirstCircle.getArea();
        System.out.println(area);
    }
}
