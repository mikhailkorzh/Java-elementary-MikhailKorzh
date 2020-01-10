package homeworks.homework14_mapper.exceptions;

public class NotFoundEntityException extends Exception {
    public NotFoundEntityException(String description){
        super(description);
    }
}
