package app;

public class Main {

    public static void main(String[] args) {
        DataProvider provider = new DataProvider();
        Corrector corrector = new Corrector();

        String result = corrector.handleData(provider.getData());
        getOutput(result);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}