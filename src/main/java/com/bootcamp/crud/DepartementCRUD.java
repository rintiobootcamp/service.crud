
package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Departement;
import com.bootcamp.repositories.DepartementRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class DepartementCRUD implements DatabaseConstants{
    public static boolean create(Departement departement) throws SQLException {
        DepartementRepository departementRepository = new DepartementRepository(PERSISTENCE_UNIT);
        return departementRepository.create(departement);
    }

    public static boolean update(Departement departement) throws SQLException {
        DepartementRepository departementRepository = new DepartementRepository(PERSISTENCE_UNIT);
        return departementRepository.update(departement);
    }


    public static boolean delete(Departement departement) throws SQLException {
        DepartementRepository departementRepository = new DepartementRepository(PERSISTENCE_UNIT);
        return  departementRepository.delete(departement);

    }

    public static List<Departement> read(Criterias criterias) {
        DepartementRepository departementRepository = new DepartementRepository(PERSISTENCE_UNIT);
        return departementRepository.getDataByCriteria(criterias);
    }

    public static List<Departement> read(Criterias criterias, int page, int size) {
        DepartementRepository departementRepository = new DepartementRepository(PERSISTENCE_UNIT);
        return departementRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Departement> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        DepartementRepository departementRepository = new DepartementRepository(PERSISTENCE_UNIT);
        return departementRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Departement> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        DepartementRepository departementRepository = new DepartementRepository(PERSISTENCE_UNIT);
        return departementRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Departement> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        DepartementRepository departementRepository = new DepartementRepository(PERSISTENCE_UNIT);
        return departementRepository.getDataByCriteria(fields);
    }

    public static List<Departement> read() throws SQLException {
        DepartementRepository departementRepository = new DepartementRepository(PERSISTENCE_UNIT);
        return departementRepository.findAll();
    }
}
