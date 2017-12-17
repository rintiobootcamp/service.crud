
package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Role;
import com.bootcamp.repositories.RoleRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class RoleCRUD implements DatabaseConstants{

    public static boolean create(Role role) throws SQLException {
        RoleRepository roleRepository = new RoleRepository(PERSISTENCE_UNIT);
        return roleRepository.create(role);
    }

    public static boolean update(Role role) throws SQLException {
        RoleRepository roleRepository = new RoleRepository(PERSISTENCE_UNIT);
        return roleRepository.update(role);
    }


    public static boolean delete(Role role) throws SQLException {
        RoleRepository roleRepository = new RoleRepository(PERSISTENCE_UNIT);
        return  roleRepository.delete(role);

    }

    public static List<Role> read(Criterias criterias) {
        RoleRepository roleRepository = new RoleRepository(PERSISTENCE_UNIT);
        return roleRepository.getDataByCriteria(criterias);
    }

    public static List<Role> read(Criterias criterias, int page, int size) {
        RoleRepository roleRepository = new RoleRepository(PERSISTENCE_UNIT);
        return roleRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Role> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        RoleRepository roleRepository = new RoleRepository(PERSISTENCE_UNIT);
        return roleRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Role> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        RoleRepository roleRepository = new RoleRepository(PERSISTENCE_UNIT);
        return roleRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Role> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        RoleRepository roleRepository = new RoleRepository(PERSISTENCE_UNIT);
        return roleRepository.getDataByCriteria(fields);
    }

    public static List<Role> read() throws SQLException {
        RoleRepository roleRepository = new RoleRepository(PERSISTENCE_UNIT);
        return roleRepository.findAll();
    }

}
