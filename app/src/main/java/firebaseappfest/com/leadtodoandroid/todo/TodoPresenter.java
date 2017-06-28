package firebaseappfest.com.leadtodoandroid.todo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaurav on 28/6/17.
 */

public class TodoPresenter {
    TodoViewInterface viewInterface;

    public TodoPresenter(TodoViewInterface viewInterface) {
        this.viewInterface = viewInterface;
    }

    void getTodos() {
        List<Todo> todoList = new ArrayList<>();
        todoList.add(new Todo("12", "Code quality", "manikanta", "ongoing", "28-Jun-2017", "manikanta"));
        todoList.add(new Todo("12", "Code testing", "gaurav", "ongoing", "28-Jun-2017", "gaurav"));
        todoList.add(new Todo("12", "INtegrate services", "manikanta", "ongoing", "28-Jun-2017", "gaurav"));
        viewInterface.updateUI(todoList);
    }
}
