package firebaseappfest.com.leadtodoandroid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gaurav on 28/6/17.
 */

public class MainPresenter {
    MainViewInterface viewInterface;

    public MainPresenter(MainViewInterface viewInterface) {
        this.viewInterface = viewInterface;
    }

    void getProjects() {
        List<Projects> projectsList = new ArrayList<>();
        projectsList.add(new Projects("Project 1", "Anon"));
        projectsList.add(new Projects("Project 2", "shubankar"));
        projectsList.add(new Projects("Project 3", "hitesh"));
        projectsList.add(new Projects("Project 4", "mani"));
        projectsList.add(new Projects("Project 5", "Gaurav"));
        viewInterface.updateUI(projectsList);
    }
}
