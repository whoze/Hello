/**
 * 
 */
package _Java;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;

/**
 * @author whoze
 * 
 */
public class FastJson {
	public static void main(String[] args) {
		Student st = new Student(1, 20, "xiao hu");
		System.out.println(JSON.toJSONString(st));
		List<Student> sts = new ArrayList<Student>();
		for (int i = 0; i < 5; i++) {
			sts.add(new Student(i, i + 20, "xiaohu" + i));
		}
		// for(int i=0;i<10;i++)
		System.out.println(JSON.toJSONString(sts));
		String sJson = JSON.toJSONString(sts);
		List<Student> ls = JSON.parseArray(sJson, Student.class);

		for (Student ss : ls) {
			System.err.println(ss.toString());
		}
		List<Teacher> tes = new ArrayList<Teacher>();
		for (int i = 0; i < 3; i++) {
			Teacher te = new Teacher(i, 45 + i, "Mrwang" + i);
			List<Student> ss = new ArrayList<Student>();
			for (int j = 0; j < 2; j++) {
				ss.add(new Student(i + j, i + j, "xiaohu" + i + j));
			}
			te.setStudents(ss);
			tes.add(te);
		}
		System.out.println(JSON.toJSONString(tes));

		String tesJson = JSON.toJSONString(tes);
		@SuppressWarnings("unused")
		List<Teacher> lts = JSON.parseArray(tesJson, Teacher.class);
		for (Teacher ta : tes) {
			System.out.println(ta.getId() + "---"
					+ ta.getStudents().get(0).toString());

		}

		System.out.println(JSON.toJSONString(tes, true));
		SimplePropertyPreFilter filter = new SimplePropertyPreFilter(
				Student.class, "id", "age", "name");
		String jsonStu = JSON.toJSONString(sts, filter);
		System.out.println(jsonStu);

	}
}
