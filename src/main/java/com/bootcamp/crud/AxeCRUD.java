package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Axe;
import com.bootcamp.repositories.AxeRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class AxeCRUD implements DatabaseConstants {

    /* Crud for axe */

    public static boolean create(Axe axe) throws SQLException {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.create(axe);
    }

    public static boolean update(Axe axe) throws SQLException {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.update(axe);
    }


    public static boolean delete(Axe axe) throws SQLException {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return  axeRepository.delete(axe);

    }

    public static List<Axe> read(Criterias criterias) {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.getDataByCriteria(criterias);
    }

    public static List<Axe> read(Criterias criterias, int page, int size) {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Axe> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Axe> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Axe> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.getDataByCriteria(fields);
    }

    public static List<Axe> read() throws SQLException {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.findAll();
    }
}
