public class Task extends Event{
    private String title;

    public Task(MyDate date, int hour, String title) {
        super(date, hour);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", date=" + date +
                ", hour=" + hour +
                '}';
    }
}
