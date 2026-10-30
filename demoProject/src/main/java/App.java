
public class App {

    public static void main(String[] args) {

        System.out.println(" Maven Jenkins Pipeline Demo");

        int num1 = 20;
        int num2 = 10;

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));

        System.out.println();

        System.out.println("Student Details");
        System.out.println("------------------------");

        String name = "Harshitha";
        String course = "M.Tech";
        int semester = 4;

        System.out.println("Name : " + name);
        System.out.println("Course : " + course);
        System.out.println("Semester : " + semester);

        System.out.println();
        System.out.println("Program Executed Successfully");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }
}
