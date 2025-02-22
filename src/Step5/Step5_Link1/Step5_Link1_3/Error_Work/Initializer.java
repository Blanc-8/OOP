package Step5.Step5_Link1.Step5_Link1_3.Error_Work;

public class Initializer {
    private static int  initialValue;
    static {
        initialValue = 1000;
    }

    public static int getInitialValue() {
        return initialValue;
    }

    public static void setInitialValue(int initialValue) {
        Initializer.initialValue = initialValue;
    }

    public Initializer() {
    }

    public static void main(String[] args) {
        System.out.println(initialValue);
        Initializer initializer = new Initializer();
        System.out.println(initialValue);
    }
}

