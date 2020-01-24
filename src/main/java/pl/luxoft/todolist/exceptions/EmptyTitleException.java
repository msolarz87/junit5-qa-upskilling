package pl.luxoft.todolist.exceptions;

public class EmptyTitleException extends RuntimeException {

    public EmptyTitleException(String s) {
        super(s);
    }
}
