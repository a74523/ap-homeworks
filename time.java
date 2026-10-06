package homework;
public class time {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        System.out.println(time / 1000 / 60 / 60 /24);
    }
}