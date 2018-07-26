
package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.PagUser;
import com.bootcamp.repositories.UserRepository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author rintio
 */
@Transactional
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

    @Transactional(readOnly = true)
    public static List<PagUser> read(Criterias criterias) {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.getDataByCriteria(criterias);
    }

    @Transactional(readOnly = true)
    public static List<PagUser> read(Criterias criterias, int page, int size) {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.getDataByCriteria(criterias, page, size);
    }

    @Transactional(readOnly = true)
    public static List<PagUser> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.getDataByCriteria(criterias, fields, page, size);
    }

    @Transactional(readOnly = true)
    public static List<PagUser> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.getDataByCriteria(criterias, fields);
    }

    @Transactional(readOnly = true)
    public static List<PagUser> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.getDataByCriteria(fields);
    }

    @Transactional(readOnly = true)
    public static List<PagUser> read() throws SQLException {
        UserRepository userRepository = new UserRepository(PERSISTENCE_UNIT);
        return userRepository.findAll();
    }

}
