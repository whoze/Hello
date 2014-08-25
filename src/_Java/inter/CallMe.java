package _Java.inter;

class CallMe implements InterestingEvent {
    private String name;
    public CallMe(String name){
        this.name = name;
    }    
    public void interestingEvent(String event) {
        System.out.println(name + ":[" +event  + "] happened");
    }
}