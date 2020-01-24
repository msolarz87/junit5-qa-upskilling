package pl.luxoft.todolist.implementation.arraylist;


import org.junit.jupiter.api.*;
import pl.luxoft.todolist.abstractions.TodoItem;
import pl.luxoft.todolist.exceptions.EmptyTitleException;
import pl.luxoft.todolist.implementations.TodoItemImpl;

@Tag("all")
public class TodoItemTest extends BaseTodoListTest {

    private TodoItem todoItem;
    private final String GOOD_TITLE = "Default title";

    @BeforeEach
    public void setUp() {
        this.todoItem = new TodoItemImpl(GOOD_TITLE);
    }

    @Test
    public void todoItemMustHaveATitle() {
        // Assert
        Assertions.assertNotNull(todoItem.getTitle());
    }

    @Test
    @Tag("not_all")
    public void todoItemTitleDoesNotChangeAfterCreation() {
        Assertions.assertEquals(GOOD_TITLE, todoItem.getTitle(),
                "Title is not the same as set when creating item");
    }

    @Test
    public void checIfTitleCanBeChanged() {
        final String newTitle = "This is new title"; // 25 characters long
        todoItem.setTitle(newTitle);

        Assertions.assertEquals(newTitle, todoItem.getTitle(),
                "Title was not updated after calling setTitle(...)");
    }

    @Test
    @Tag("negative_test")
    public void checkIfEmptyStringCanNotBeUsedAsTitle() {
        Assertions.assertThrows(EmptyTitleException.class, () -> todoItem.setTitle(""));
    }

}
