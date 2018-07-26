
package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.UserRole;
import com.bootcamp.repositories.UserRoleRepository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author rintio
 */
@Transactional
public class UserRoleCRUD implements DatabaseConstants{

    public static boolean create(UserRole userRole) throws SQLException {
        UserRoleRepository userRoleRepository = new UserRoleRepository(PERSISTENCE_UNIT);
        return userRoleRepository.create(userRole);
    }

    public static boolean update(UserRole userRole) throws SQLException {
        UserRoleRepository userRoleRepository = new UserRoleRepository(PERSISTENCE_UNIT);
        return userRoleRepository.update(userRole);
    }


    public static boolean delete(UserRole userRole) throws SQLException {
        UserRoleRepository userRoleRepository = new UserRoleRepository(PERSISTENCE_UNIT);
        return  userRoleRepository.delete(userRole);

    }

    @Transactional(readOnly = true)
    public static List<UserRole> read(Criterias criterias) {
        UserRoleRepository userRoleRepository = new UserRoleRepository(PERSISTENCE_UNIT);
        return userRoleRepository.getDataByCriteria(criterias);
    }

    @Transactional(readOnly = true)
    public static List<UserRole> read(Criterias criterias, int page, int size) {
        UserRoleRepository userRoleRepository = new UserRoleRepository(PERSISTENCE_UNIT);
        return userRoleRepository.getDataByCriteria(criterias, page, size);
    }

    @Transactional(readOnly = true)
    public static List<UserRole> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        UserRoleRepository userRoleRepository = new UserRoleRepository(PERSISTENCE_UNIT);
        return userRoleRepository.getDataByCriteria(criterias, fields, page, size);
    }

    @Transactional(readOnly = true)
    public static List<UserRole> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        UserRoleRepository userRoleRepository = new UserRoleRepository(PERSISTENCE_UNIT);
        return userRoleRepository.getDataByCriteria(criterias, fields);
    }

    @Transactional(readOnly = true)
    public static List<UserRole> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        UserRoleRepository userRoleRepository = new UserRoleRepository(PERSISTENCE_UNIT);
        return userRoleRepository.getDataByCriteria(fields);
    }

    @Transactional(readOnly = true)
    public static List<UserRole> read() throws SQLException {
        UserRoleRepository userRoleRepository = new UserRoleRepository(PERSISTENCE_UNIT);
        return userRoleRepository.findAll();
    }

}
