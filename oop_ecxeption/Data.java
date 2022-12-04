package oop_ecxeption;

import java.util.Arrays;

public class Data {
    private static final String ALLOWED_CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHKLMNOPQRSTUVWXYZ0123456789";

    private Data() {
    }


    public static boolean validate(String login, String password, String confirmPassword) {
        try {
            checkData(login, password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
            return false;
        }
        finally {
            System.out.println("Проверка выполнена");
        }
        return true;
    }

    public static void checkData(String login, String password, String confirmPassword) throws
            WrongLoginException, WrongPasswordException {
        if (!validate(login)) {
            throw new WrongLoginException("Логин введен неправильно");
        }
        if (!validate(password)) {
            throw new WrongPasswordException("Пароль введен неправильно");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }

    private static boolean validate(String str) {
        if (str.length() > 20) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!ALLOWED_CHARACTERS.contains(String.valueOf(str.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}
