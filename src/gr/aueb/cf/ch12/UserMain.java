package gr.aueb.cf.ch12;

import gr.aueb.cf.ch12.model.User;
//import static java.lang.Math.*;

public class UserMain {

    public static void main(String[] args) {
        User user = new User();
        User anna = new User(2, "Anna", "G.", "anna", "12345", false);

        user.setId(1);
        user.setFirstname("George");
        user.setLastname("D.");
        user.setUsername("georgeg");
        user.setPassword("12345");
        user.setActive(true);

        System.out.println("User id: " + user.getId());
        System.out.println("User Firstname: " + user.getFirstname());
        System.out.println("User Lastname: " + user.getLastname());
        System.out.println("Username: " + user.getUsername());
        System.out.println("User Password: " + user.getPassword());
        System.out.println("Is Active: " + user.isActive());

        System.out.println("User id: " + anna.getId());
        System.out.printf("Firstname: %s, Lastname %s\n", anna.getFirstname(), anna.getLastname());
        System.out.printf("Username: %S, Password: %s\n", anna.getUsername(), anna.getPassword());
        System.out.println("Is Active: " + anna.isActive());


//        int x = Math.min(-3, 5);
    }
}
