package models.exceptions;

public class DomainExceptions extends RuntimeException{
    public DomainExceptions(String stg){
        super(stg);
    }
}
