package pl.luxoft.todolist.implementations;

import pl.luxoft.todolist.abstractions.TodoItem;
import pl.luxoft.todolist.exceptions.EmptyTitleException;

import static java.util.Objects.isNull;

public class TodoItemImpl extends TodoItem {

    private String title;

    public TodoItemImpl(String title) {
        super();
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String newTitle) {
        if (isNull(newTitle)) {
            throw new EmptyTitleException("Could not set null title for[" + this + "]");
        } if ("".equals(newTitle.trim())) {
            String exceptionDesc = "At least one non-whitespace character is required for title."
                    + "Could not set title[" + newTitle + "] for [" + this + "]";
            throw new EmptyTitleException(exceptionDesc);
        }
        this.title = newTitle;
    }
}
