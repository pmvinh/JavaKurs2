package java2_1;

public class AuthorTest {
    public static void main(String[] args) {
        Author Vinh = new Author("Pham Vinh", "pmvinh99@gmail.com", 'M');
        System.out.println(Vinh.getName());
        System.out.println(Vinh.getEmail());
        Vinh.setEmail("pmvinh99@gmail.com");
        System.out.println(Vinh.getGender());
        System.out.println(Vinh);
    }
}
