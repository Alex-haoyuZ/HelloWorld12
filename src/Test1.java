public class Test1 {
    private static int i = 0;

    public static void changeValue(int value){
        value++;
    }

    public static void main(String[] args) {
        System.out.println(i);
        changeValue(i);
        System.out.println(i);
    }
}
