package _Java.inter;

import java.util.ArrayList;
import java.util.List;

class EventNotifier {
    private List<CallMe> callMes = new ArrayList<CallMe>();
    
    public void regist(CallMe callMe){
        callMes.add(callMe);
    }
    
    public void doWork(){
        for(CallMe callMe: callMes) {
            callMe.interestingEvent("sample event");
        }
    }    
}