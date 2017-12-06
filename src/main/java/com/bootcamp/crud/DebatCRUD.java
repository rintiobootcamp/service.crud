package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Debat;
import com.bootcamp.repositories.DebatRepository;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class DebatCRUD implements DatabaseConstants {

    /* Crud for debat */

    public static boolean create(Debat debat) throws SQLException {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.create(debat);
    }

    public static boolean update(Debat debat) throws SQLException {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.update(debat);
    }


    public static boolean delete(Debat debat) throws SQLException {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return  debatRepository.delete(debat);

    }

    public static List<Debat> read(Criterias criterias) {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.getDataByCriteria(criterias);
    }

    public static List<Debat> read(Criterias criterias, int page, int size) {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Debat> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Debat> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Debat> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.getDataByCriteria(fields);
    }

    public static List<Debat> read() throws SQLException {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.findAll();
    }
}
