public class UncommonErrorSolution {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // Potential ArithmeticException
            System.out.println(result); 
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unexpected exception caught: " + e.getMessage());
        } finally {
            System.out.println("This always executes.");
        }
        System.out.println("This line is now reachable");
    }
}