public class AmbigousPersonException extends RuntimeException {
    public AmbigousPersonException(String fullName) {

        super(fullName + " already exists");    }
}
