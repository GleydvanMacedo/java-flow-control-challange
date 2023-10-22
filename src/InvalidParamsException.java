public class InvalidParamsException extends Exception {
    public InvalidParamsException(){
        super("The second parameter must be greater than the first");
    }
}
