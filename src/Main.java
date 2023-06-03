public class Main {
    public static void main(String[] args) throws InterruptedException {

        String name = "omid";
        for (int i = 0; i < 20; i++) {
            Thread.sleep(2000);


            System.out.println(name);
        }
    }
}