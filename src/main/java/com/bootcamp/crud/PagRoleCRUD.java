
package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.PagRole;
import com.bootcamp.repositories.PagRoleRepository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author rintio
 */
@Transactional
public class PagRoleCRUD implements DatabaseConstants{

    public static boolean create(PagRole role) throws SQLException {
        PagRoleRepository roleRepository = new PagRoleRepository(PERSISTENCE_UNIT);
        return roleRepository.create(role);
    }

    public static boolean update(PagRole role) throws SQLException {
        PagRoleRepository roleRepository = new PagRoleRepository(PERSISTENCE_UNIT);
        return roleRepository.update(role);
    }


    public static boolean delete(PagRole role) throws SQLException {
        PagRoleRepository roleRepository = new PagRoleRepository(PERSISTENCE_UNIT);
        return  roleRepository.delete(role);

    }

    @Transactional(readOnly = true)
    public static List<PagRole> read(Criterias criterias) {
        PagRoleRepository roleRepository = new PagRoleRepository(PERSISTENCE_UNIT);
        return roleRepository.getDataByCriteria(criterias);
    }

    @Transactional(readOnly = true)
    public static List<PagRole> read(Criterias criterias, int page, int size) {
        PagRoleRepository roleRepository = new PagRoleRepository(PERSISTENCE_UNIT);
        return roleRepository.getDataByCriteria(criterias, page, size);
    }

    @Transactional(readOnly = true)
    public static List<PagRole> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        PagRoleRepository roleRepository = new PagRoleRepository(PERSISTENCE_UNIT);
        return roleRepository.getDataByCriteria(criterias, fields, page, size);
    }

    @Transactional(readOnly = true)
    public static List<PagRole> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        PagRoleRepository roleRepository = new PagRoleRepository(PERSISTENCE_UNIT);
        return roleRepository.getDataByCriteria(criterias, fields);
    }

    @Transactional(readOnly = true)
    public static List<PagRole> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        PagRoleRepository roleRepository = new PagRoleRepository(PERSISTENCE_UNIT);
        return roleRepository.getDataByCriteria(fields);
    }

    @Transactional(readOnly = true)
    public static List<PagRole> read() throws SQLException {
        PagRoleRepository roleRepository = new PagRoleRepository(PERSISTENCE_UNIT);
        return roleRepository.findAll();
    }

}
