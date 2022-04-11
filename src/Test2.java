public class Test2 {
    private static Student st = null;
    public static void changeInfo(Student st){
        st.setAge(10);
        st.setName("haha");
    }

    public static void main(String[] args) {
        st = new Student("xixi",18);
        System.out.println(st.getName());
        changeInfo(st);
        System.out.println(st.getName());
    }
}



