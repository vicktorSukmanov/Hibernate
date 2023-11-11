package jm.task.core.jdbc;


import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;


public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();


        userService.createUsersTable();

        userService.saveUser("Ivan","Ivanov",(byte) 37);
        userService.saveUser("Viktor","Petrov",(byte) 25);
        userService.saveUser("Semen","Smirnov",(byte) 22);
        userService.saveUser("Renat","Sidorov",(byte) 35);

        System.out.println(userService.getAllUsers());

        userService.cleanUsersTable();

        userService.dropUsersTable();


        Util.closeSsesion(userService.getSession());


    }
}
