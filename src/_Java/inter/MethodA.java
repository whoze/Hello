package _Java.inter;
/**
 * @since 2012-02-02
 * @desc ����
 */
public class MethodA {
 
    public static void main(String args[]){
        MethodB b=new MethodB();
        //����ֵdֻ��MethodB�йأ��ͽӿ��з����ķ���ֵ�޹�
        double d=b.getTime(new CallBackInterface() {
             
            //����ʵ�������Ķ���Ľӿ�
            public void exectueMethod() {
                new MethodA().testMethod();
            }
             
            @Override
            public void doSome() {
                 
            }
        });
        System.out.println("d="+d);
    }
     
    public void testMethod(){
        for(int i=0;i<10000;i++){
            System.out.print("");
        }
    }
}