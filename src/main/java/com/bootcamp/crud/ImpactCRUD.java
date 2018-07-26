package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Impact;
import com.bootcamp.repositories.ImpactRepository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Moh
 */
@Transactional
public class ImpactCRUD implements DatabaseConstants {

    /**
     * Insert the impact in the database
     *
     * @param impact
     * @return
     * @throws SQLException
     */
    public static boolean create(Impact impact) throws SQLException {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.create(impact);
    }

    /**
     * Update the impact in the database
     *
     * @param impact
     * @return
     * @throws SQLException
     */
    public static boolean update(Impact impact) throws SQLException {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.update(impact);
    }

    /**
     * Delete the impact in the database
     *
     * @param impact
     * @return
     * @throws SQLException
     */
    public static boolean delete(Impact impact) throws SQLException {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.delete(impact);

    }

    /**
     * Get all the impacts in the database matching the given criteria list
     *
     * @param criterias
     * @return impacts
     */
    @Transactional(readOnly = true)
    public static List<Impact> read(Criterias criterias) {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the impacts in the database matching the given criteria list,
     * page and size
     *
     * @param criterias
     * @param page
     * @param size
     * @return impacts
     */
    @Transactional(readOnly = true)
    public static List<Impact> read(Criterias criterias, int page, int size) {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the impacts in the database matching the
     * given criteria list, page and size
     *
     * @param criterias
     * @param fields
     * @param page
     * @param size
     * @return impacts
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Impact> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the impacts in the database matching the
     * given criteria list
     *
     * @param criterias
     * @param fields
     * @return impacts
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Impact> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the impacts in the database
     *
     * @param fields
     * @return impacts
     * @throws SQLException
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Impact> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the impacts in the database
     *
     * @return impacts
     * @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Impact> read() throws SQLException {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.findAll();
    }

}
