package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import static com.bootcamp.commons.constants.DatabaseConstants.PERSISTENCE_UNIT;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.User;
import com.bootcamp.repositories.UserRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class UserCRUD implements DatabaseConstants {

    /* Crud for user */
    /**
     * Insert the user in the database
     *
     * @param user
     * @return
     * @throws SQLException
     */
    public static boolean create(User user) throws SQLException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.create(user);
    }

    /**
     * Update the user in the database
     *
     * @param user
     * @return
     * @throws SQLException
     */
    public static boolean update(User user) throws SQLException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.update(user);
    }

    /**
     * Delete the user in the database
     *
     * @param user
     * @return
     * @throws SQLException
     */
    public static boolean delete(User user) throws SQLException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.delete(user);

    }

    /**
     * Get all the users in the database matching the given criteria list
     *
     * @param criterias
     * @return users
     */
    public static List<User> read(Criterias criterias) {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the users in the database matching the given criteria list, page,
     * size
     *
     * @param criterias
     * @param page
     * @param size
     * @return users
     */
    public static List<User> read(Criterias criterias, int page, int size) {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the users in the database matching the given
     * criteria list, page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @param fields
     * @return users
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<User> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the users in the database matching the given
     * criteria list
     *
     * @param criterias
     * @param fields
     * @return users
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<User> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the users in the database
     *
     * @param fields
     * @return users
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     * @throws SQLException
     */
    public static List<User> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the users in the database
     *
     * @return users
     * @throws SQLException
     */
    public static List<User> read() throws SQLException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.findAll();
    }
}
