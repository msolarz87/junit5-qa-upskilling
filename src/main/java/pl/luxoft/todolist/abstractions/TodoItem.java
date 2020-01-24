package pl.luxoft.todolist.abstractions;

import pl.luxoft.todolist.interfaces.Obtainable;
import pl.luxoft.todolist.interfaces.Togglable;

public abstract class TodoItem implements Togglable{

    public abstract String getTitle();
    public abstract void setTitle(String newTitle);

}
