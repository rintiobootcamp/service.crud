
package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.PagUser;
import com.bootcamp.repositories.UserRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class PagUserCRUD implements DatabaseConstants{

    public static boolean create(PagUser user) throws SQLException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.create(user);
    }

    public static boolean update(PagUser user) throws SQLException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.update(user);
    }


    public static boolean delete(PagUser user) throws SQLException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return  userRepository.delete(user);

    }

    public static List<PagUser> read(Criterias criterias) {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.getDataByCriteria(criterias);
    }

    public static List<PagUser> read(Criterias criterias, int page, int size) {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<PagUser> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<PagUser> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.getDataByCriteria(criterias, fields);
    }

    public static List<PagUser> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.getDataByCriteria(fields);
    }

    public static List<PagUser> read() throws SQLException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.findAll();
    }

}
