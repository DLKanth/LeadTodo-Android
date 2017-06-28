package firebaseappfest.com.leadtodoandroid.todo;

/**
 * Created by gaurav on 28/6/17.
 */

public class Todo {
    public String id;
    public String title;
    public String assignedTo;
    public String status;
    public String createdDate;
    public String createdBy;

    public Todo(String id, String title, String assignedTo, String status, String createdDate, String createdBy) {
        this.id = id;
        this.title = title;
        this.assignedTo = assignedTo;
        this.status = status;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
