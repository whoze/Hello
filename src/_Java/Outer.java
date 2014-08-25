package _Java;

public class Outer {
	private static int i = 1;
	private int j = 10;
	private int k = 20;

	public static void outer_f1() {
	}

	public void outer_f2() {
	}

	// ��Ա�ڲ����У����ܶ��徲̬��Ա
	// ��Ա�ڲ����У����Է����ⲿ������г�Ա
	class Inner {
		// static int inner_i = 100; //�ڲ����в������徲̬����
		int j = 100; // �ڲ�����ⲿ���ʵ���������Թ���
		int inner_i = 1;

		void inner_f1() {
			System.out.println(i);
			// ���ڲ����з����ڲ����Լ��ı���ֱ���ñ�����
			System.out.println(j);
			// ���ڲ����з����ڲ����Լ��ı���Ҳ������this.������
			System.out.println(this.j);
			// ���ڲ����з����ⲿ�������ڲ���ͬ����ʵ���������ⲿ����.this.������
			System.out.println(Outer.this.j);
			// ����ڲ�����û�����ⲿ��ͬ���ı����������ֱ���ñ����������ⲿ�����
			System.out.println(k);
			outer_f1();
			outer_f2();
		}
	}

	// �ⲿ��ķǾ�̬�������ʳ�Ա�ڲ���
	public void outer_f3() {
		Inner inner = new Inner();
		inner.inner_f1();
	}

	// �ⲿ��ľ�̬�������ʳ�Ա�ڲ��࣬�����ⲿ���ⲿ���ʳ�Ա�ڲ���һ��
	public static void outer_f4() {
		// step1 �����ⲿ�����
		Outer out = new Outer();
		// step2 �����ⲿ��������ڲ������
		Inner inner = out.new Inner();
		// step3 �����ڲ���ķ���
		inner.inner_f1();
	}

	public static void main(String[] args) {
		// outer_f4(); //��������������������������������һ��
		// ���Ҫֱ�Ӵ����ڲ���Ķ��󣬲����뵱Ȼ����Ϊֻ�������Χ��Outer�����֣�
		// �Ϳ��԰���ͨ�������������ڲ���Ķ��󣬶��Ǳ���ʹ�ô���Χ���һ��������
		// �������ڲ����һ������
		// Outer.Inner outin = out.new Inner()
		// ��ˣ��������Ѿ�������Χ���һ�����󣬷��򲻿��������ڲ���Ķ�����Ϊ��
		// �ڲ���Ķ�������ĵ����ӵ�����������Χ��Ķ���������õ��Ǿ�̬���ڲ��࣬
		// �ǾͲ���Ҫ������Χ���������á�
		Outer out = new Outer();
		Outer.Inner outin = out.new Inner();
		outin.inner_f1();
	}
}