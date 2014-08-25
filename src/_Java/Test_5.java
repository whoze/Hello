package _Java;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.concurrent.atomic.AtomicInteger;

public class Test_5 {

	public static final int a = 111;
	public static final int b = 222;
	public static final int c = 333;
	public static final int d = 444;

	public static void main(String[] args) {
		try {
			System.out.println(Test_5.class.getName());
			Class c = Class.forName("_Java.Test_5");
			Field[] fields = c.getDeclaredFields();
			for (int i = 0; i < fields.length; i++) {
				String m = Modifier.toString(fields[i].getModifiers());
				if (m != null && m.indexOf("final") > -1) {
					System.out.println(fields[i].toString() + "="
							+ fields[i].getInt(int.class));
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		System.out.println(.6f);
		System.out.println("cpu="+Runtime.getRuntime().availableProcessors());
		
		AtomicInteger atom=new AtomicInteger(1); 
		for(int i=0;i<4;i++){
			//System.out.println(atom.getAndIncrement());
			System.out.println(atom.getAndAdd(2));
			//System.out.println(atom.getAndIncrement());
			System.out.println("-----------------------------");
		}

	}

}