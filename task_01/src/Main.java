public class Main {
    public static void main(String[] args) {
        Owner o1 = new Owner();
        o1.setOwnerName("Aleksey");

        cat c1 = new cat();
        c1.setName("Kristian");
        c1.setAge(5);
        c1.setOwnerName(o1.getOwnerName());
        c1.greet();


    }
}