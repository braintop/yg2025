import java.util.Arrays;

public class Meeting  extends Event{

    private String[]arrnames;
    private  int duration;
    private  String  locatiom;

    public Meeting(MyDate date, int hour, String[] arrnames, int duration, String locatiom) {
        super(date, hour);
        this.arrnames = arrnames;
        this.duration = duration;
        this.locatiom = locatiom;
    }

    public String[] getArrnames() {
        return arrnames;
    }

    public void setArrnames(String[] arrnames) {
        this.arrnames = arrnames;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLocatiom() {
        return locatiom;
    }

    public void setLocatiom(String locatiom) {
        this.locatiom = locatiom;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "arrnames=" + Arrays.toString(arrnames) +
                ", duration=" + duration +
                ", locatiom='" + locatiom + '\'' +
                ", date=" + date +
                ", hour=" + hour +
                '}';
    }
    public boolean match(String name){
        for(int i=0;i<arrnames.length;i++){
            if(arrnames[i].equals(name))
                return true;
        }
        return  false;
    }

}
