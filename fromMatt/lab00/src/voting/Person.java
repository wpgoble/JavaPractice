package voting;

public class Person {
    private String name;
    private String email;

    public static void main(String[] args) {
        Person johnna = new Person("Johnna", "johnna@email.com");
        Person william = new Person("William", "will@email.com");

        System.out.println(johnna.getName() + ": " + johnna.getEmail());
        System.out.println(william.getName() + ": " + william.getEmail());
    }

    /**
     * Constructs a new person with a specified name and email
     * @param p_name
     *          the person's name
     * @param p_email
     *          the person's email
     */         
    public Person(String p_name, String p_email) {
        name = p_name;
        email = p_email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String new_name) {
        name = new_name;
    }

    public void setEmail(String new_email) {
        email = new_email;
    }
}