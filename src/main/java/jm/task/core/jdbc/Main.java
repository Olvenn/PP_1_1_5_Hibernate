package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDao userDao = new UserDaoHibernateImpl();
        userDao.createUsersTable();

        userDao.saveUser("Lewis", "Hamilton", (byte) 39);
        userDao.saveUser("Michael", "Michael", (byte) 49);
        userDao.saveUser("Ayrton", "Senna", (byte) 29);
        userDao.saveUser("Alain", "Prost", (byte) 34);
        for (User user : userDao.getAllUsers()) {
            System.out.println(user);
        }

        userDao.removeUserById(2);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
