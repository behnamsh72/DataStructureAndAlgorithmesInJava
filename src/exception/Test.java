package exception;

public class Test {

    public static void main(String[] args) {
        int x = 5;


        try {

        } catch (Exception e) {
            e.getCause();
            System.out.println(e.getMessage());
        }
    }
}
