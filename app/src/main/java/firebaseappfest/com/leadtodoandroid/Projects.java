package firebaseappfest.com.leadtodoandroid;

/**
 * Created by gaurav on 28/6/17.
 */

public class Projects {
    public String title;
    public String createdBy;

    public Projects(String title, String createdBy) {
        this.title = title;
        this.createdBy = createdBy;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
