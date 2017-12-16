package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import static com.bootcamp.commons.constants.DatabaseConstants.PERSISTENCE_UNIT;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Pilier;
import com.bootcamp.repositories.PilierRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class PilierCRUD implements DatabaseConstants {

    /* Crud for pilier */
    /**
     * Insert the pilier in the database
     *
     * @param pilier
     * @return
     * @throws SQLException
     */
    public static boolean create(Pilier pilier) throws SQLException {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.create(pilier);
    }

    /**
     * Update the pilier in the database
     *
     * @param pilier
     * @return
     * @throws SQLException
     */
    public static boolean update(Pilier pilier) throws SQLException {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.update(pilier);
    }

    /**
     * Delete the pilier in the database
     *
     * @param pilier
     * @return
     * @throws SQLException
     */
    public static boolean delete(Pilier pilier) throws SQLException {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.delete(pilier);

    }

    /**
     * Get all the piliers in the database matching the given criteria list
     *
     * @param criterias
     * @return piliers
     */
    public static List<Pilier> read(Criterias criterias) {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the piliers in the database matching the given criteria list,
     * page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @return piliers
     */
    public static List<Pilier> read(Criterias criterias, int page, int size) {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the piliers in the database matching the
     * given criteria list, page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @param fields
     * @return piliers
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<Pilier> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the piliers in the database matching the
     * given criteria list
     *
     * @param criterias
     * @param fields
     * @return piliers
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<Pilier> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the piliers in the database
     *
     * @param fields
     * @return piliers
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     * @throws SQLException
     */
    public static List<Pilier> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the piliers in the database
     *
     * @return piliers
     * @throws SQLException
     */
    public static List<Pilier> read() throws SQLException {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.findAll();
    }
}
