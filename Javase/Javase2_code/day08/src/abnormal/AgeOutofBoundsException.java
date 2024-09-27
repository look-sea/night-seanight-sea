package abnormal;

//自定义异常
public class AgeOutofBoundsException extends RuntimeException{
    public AgeOutofBoundsException() {
    }

    public AgeOutofBoundsException(String message) {
        super(message);
    }
}
