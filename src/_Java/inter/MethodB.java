package _Java.inter;
/**
 * @since 2012-02-02
 * @desc ÀîËÄ
 */
public class MethodB {
 
    public double getTime(CallBackInterface callBack) {
        long start = System.currentTimeMillis();
        callBack.exectueMethod();
        long end = System.currentTimeMillis();
        System.out.println("cost time=" + (end - start));
        return end - start;
    }
}