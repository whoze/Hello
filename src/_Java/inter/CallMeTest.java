package _Java.inter;

public class CallMeTest {
	public static void main(String[] args) {
		EventNotifier ren = new EventNotifier();
		CallMe a = new CallMe("CallMe A");
		CallMe b = new CallMe("CallMe B");

		// regiest
		ren.regist(a);
		ren.regist(b);

		// test
		ren.doWork();
	}
}