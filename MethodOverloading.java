public class MethodOverloading {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double add(double a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverloading calculator = new MethodOverloading();

        int result1 = calculator.add(5, 10);
        System.out.println("Result 1: " + result1); // Output: Result 1: 15

        double result2 = calculator.add(3.5, 2);
        System.out.println("Result 2: " + result2); // Output: Result 2: 6.2

        int result3 = calculator.add(2, 3, 4);
        System.out.println("Result 3: " + result3); // Output: Result 3: 9
    }
}
