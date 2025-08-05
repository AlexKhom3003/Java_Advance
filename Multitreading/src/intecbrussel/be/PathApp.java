package intecbrussel.be;

public class PathApp {
    public static void main(String[] args) {
        MyThread thread01 = new MyThread("*");
        MyThread thread02 = new MyThread("-");

        System.out.println(thread01.getState());
        thread01.start();
        thread02.start();
        System.out.println(thread01.getState());
    }
}
