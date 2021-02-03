package dp.singleton;

public class Run {
    public static void main(String[] args) {
        Singleton ref1, ref2;

        ref1 = Singleton.getInstance();
        ref2 = Singleton.getInstance();

        if (ref1 == ref2) System.out.println("Singleton !!");
    }
}
