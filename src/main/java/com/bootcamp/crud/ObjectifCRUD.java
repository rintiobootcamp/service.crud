package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import static com.bootcamp.commons.constants.DatabaseConstants.PERSISTENCE_UNIT;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Objectif;
import com.bootcamp.repositories.ObjectifRepository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author rintio
 */
@Transactional
public class ObjectifCRUD implements DatabaseConstants {

    /* Crud for objectif */
    /**
     * Insert the objectif in the database
     *
     * @param objectif
     * @return
     * @throws SQLException
     */
    public static boolean create(Objectif objectif) throws SQLException {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.create(objectif);
    }

    /**
     * Update the objectif in the database
     *
     * @param objectif
     * @return
     * @throws SQLException
     */
    public static boolean update(Objectif objectif) throws SQLException {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.update(objectif);
    }

    /**
     * Delete the objectif in the database
     *
     * @param objectif
     * @return
     * @throws SQLException
     */
    public static boolean delete(Objectif objectif) throws SQLException {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.delete(objectif);

    }

    /**
     * Get all the objectifs in the database matching the given criteria list
     *
     * @param criterias
     * @return objectifs
     */
    @Transactional(readOnly = true)
    public static List<Objectif> read(Criterias criterias) {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the objectifs in the database matching the given criteria list,
     * page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @return objectifs
     */
    @Transactional(readOnly = true)
    public static List<Objectif> read(Criterias criterias, int page, int size) {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the objectifs in the database matching the
     * given criteria list, page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @param fields
     * @return objectifs
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Objectif> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the objectifs in the database matching the
     * given criteria list
     *
     * @param criterias
     * @param fields
     * @return objectifs
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Objectif> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the objectifs in the database
     *
     * @param fields
     * @return objectifs
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     * @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Objectif> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the objectifs in the database
     *
     * @return objectifs
     * @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Objectif> read() throws SQLException {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.findAll();
    }
}
