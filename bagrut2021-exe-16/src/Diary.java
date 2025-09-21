public class Diary {

    Event[]events = new Event[1000];


    public  PhoneCall[] allCalls(MyDate date){

        PhoneCall[]phoneCalls = new PhoneCall[100];
        int counter = 0;
        for(int i=0;i<events.length;i++){
            if(events[i].getDate().sameDate(date)){
                if(events[i] instanceof  PhoneCall && counter < 100){
                    phoneCalls[counter] = (PhoneCall) events[i];
                    counter++;
                }
            }
        }//end of for
        return  phoneCalls;

    }

}
