class AgeException extends Exception {
    AgeException(String message) {
        super(message);
    }
}

public class CustomException {
    static void validate(int age) throws AgeException {
        if(age<18)
            throw new AgeException("Age must be 18 or above");
    }

    public static void main(String[] args) {
        try {
            validate(15);
        } catch(AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
