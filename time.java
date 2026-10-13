package homework;

public class time {
    public static void main(String[] args) {
        long time = System.currentTimeMillis();

        long seconds = time / 1000;
        long minutes = seconds / 60;
        long hours = minutes / 60;
        long days = hours / 24;

        System.out.println(days);
    }
}