public class Event {

    protected  MyDate date;
    protected int hour;

    public Event(MyDate date, int hour) {
        this.date = date;
        this.hour = hour;
    }

    public MyDate getDate() {
        return date;
    }

    public void setDate(MyDate date) {
        this.date = date;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Event{" +
                "date=" + date +
                ", hour=" + hour +
                '}';
    }

    public boolean match(String name){
        return  false;
    }
}
