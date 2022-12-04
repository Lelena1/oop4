package oop_ecxeption;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        boolean test = Data.validate("login", "passwords", "password");
        if (test) {
            System.out.println("Данные введены правильно");
        } else {
            System.out.println("Данные введены неправильно");
        }
    }
}
