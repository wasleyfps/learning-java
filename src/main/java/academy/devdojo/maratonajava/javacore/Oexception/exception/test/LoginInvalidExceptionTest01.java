package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.LoginInvalidException;

import java.util.Scanner;

public class LoginInvalidExceptionTest01 {
    public static void main(String[] args) {
        try {
            login();
        } catch (LoginInvalidException e) {
            e.printStackTrace();
        }
    }
    private static void login() throws LoginInvalidException {
        Scanner scanner = new Scanner(System.in);
        String usernameDB = "Wasley";
        String passwordDB = "123";
        System.out.println("Username: ");
        String typedUsername = scanner.nextLine();
        System.out.println("Password: ");
        String typedPassword = scanner.nextLine();
        
        if(!usernameDB.equals(typedUsername) || !passwordDB.equals(typedPassword)){
            throw new LoginInvalidException("Username or password invalid");
        } 
        System.out.println("Logged in");
    }
}
