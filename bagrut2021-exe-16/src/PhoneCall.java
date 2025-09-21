public class PhoneCall extends Event {
    private String phoneNumber;
    private  String name;

    public PhoneCall(MyDate date, int hour, String phoneNumber, String name) {
        super(date, hour);
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PhoneCall{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", hour=" + hour +
                '}';
    }

    public boolean match(String name){
        return  this.name.equals(name);
    }

}
