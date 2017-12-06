package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Censure;
import com.bootcamp.repositories.CensureRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class CensureCRUD implements DatabaseConstants {

    /* Crud for censure */

    public static boolean create(Censure censure) throws SQLException {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.create(censure);
    }

    public static boolean update(Censure censure) throws SQLException {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.update(censure);
    }


    public static boolean delete(Censure censure) throws SQLException {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return  censureRepository.delete(censure);

    }

    public static List<Censure> read(Criterias criterias) {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.getDataByCriteria(criterias);
    }

    public static List<Censure> read(Criterias criterias, int page, int size) {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Censure> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Censure> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Censure> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.getDataByCriteria(fields);
    }

    public static List<Censure> read() throws SQLException {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.findAll();
    }
}
