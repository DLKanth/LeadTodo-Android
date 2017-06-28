package firebaseappfest.com.leadtodoandroid;

/**
 * Created by gaurav on 28/6/17.
 */

public class Projects {
    public String title;
    public String createdBy;
    public String id;

    public Projects(String title, String createdBy, String id) {
        this.title = title;
        this.createdBy = createdBy;
        this.id = id;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
