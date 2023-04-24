package exception2;

public class LAB6 {

    public static void main(String[] args) {
        // System.out.println(1/0);
        try {
            System.out.println(1/0);
        } catch (ArithmeticException e) {
//            e.getStackTrace();
//            e.printStackTrace();
            System.out.println(e.getMessage());
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            System.out.println(stackTraceElements[0].getMethodName());
            System.out.println(stackTraceElements[0].getClassName());
            System.out.println(stackTraceElements[0].getLineNumber());
        } 
    }
    
}
