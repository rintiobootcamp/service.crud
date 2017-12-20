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
    /**
     * Insert the censor in the database
     *
     * @param censure
     * @return
     * @throws SQLException
     */
    public static boolean create(Censure censure) throws SQLException {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.create(censure);
    }

    /**
     * Update the censor in the database
     *
     * @param censure
     * @return
     * @throws SQLException
     */
    public static boolean update(Censure censure) throws SQLException {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.update(censure);
    }

    /**
     * Delete the censor in the database
     *
     * @param censure
     * @return
     * @throws SQLException
     */
    public static boolean delete(Censure censure) throws SQLException {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.delete(censure);

    }

    /**
     * Get all the censors in the database matching the given criteria list
     *
     * @param criterias
     * @return censors
     */
    public static List<Censure> read(Criterias criterias) {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the censors in the database matching the given criteria list,
     * page and size
     *
     * @param criterias
     * @param page
     * @param size
     * @return censors
     */
    public static List<Censure> read(Criterias criterias, int page, int size) {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the censors in the database matching the
     * given criteria list, page and size
     *
     * @param criterias
     * @param fields
     * @param page
     * @param size
     * @return censors
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<Censure> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the censors in the database matching the
     * given criteria list
     *
     * @param criterias
     * @param fields
     * @return censors
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<Censure> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the censors in the database
     *
     * @param fields
     * @return censors
     * @throws SQLException
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<Censure> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the censors in the database
     *
     * @return @throws SQLException
     */
    public static List<Censure> read() throws SQLException {
        CensureRepository censureRepository = new CensureRepository(PERSISTENCE_UNIT);
        return censureRepository.findAll();
    }
}
