package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Axe;
import com.bootcamp.repositories.AxeRepository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
@Transactional
public class AxeCRUD implements DatabaseConstants {

    /* Crud for axe */
    /**
     * Insert the axe in the database
     *
     * @param axe
     * @return
     * @throws SQLException
     */
    public static boolean create(Axe axe) throws SQLException {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.create(axe);
    }

    /**
     * Update the axe in the database
     *
     * @param axe
     * @return
     * @throws SQLException
     */
    public static boolean update(Axe axe) throws SQLException {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.update(axe);
    }

    /**
     * Delete the axe in the database
     *
     * @param axe
     * @return
     * @throws SQLException
     */
    public static boolean delete(Axe axe) throws SQLException {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.delete(axe);

    }

    /**
     * Get all the axes in the database matching the given criteria list
     *
     * @param criterias
     * @return axes
     */
    @Transactional(readOnly = true)
    public static List<Axe> read(Criterias criterias) {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the axes in the database matching the given criteria list, page,
     * size
     *
     * @param criterias
     * @param page
     * @param size
     * @return axes
     */
    @Transactional(readOnly = true)
    public static List<Axe> read(Criterias criterias, int page, int size) {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the axes in the database matching the given
     * criteria list, page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @param fields
     * @return axes
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Axe> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the axes in the database matching the given
     * criteria list
     *
     * @param criterias
     * @param fields
     * @return axes
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Axe> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the axes in the database
     *
     * @param fields
     * @return axes
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     * @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Axe> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the axes in the database
     *
     * @return axes
     * @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Axe> read() throws SQLException {
        AxeRepository axeRepository = new AxeRepository(PERSISTENCE_UNIT);
        return axeRepository.findAll();
    }
}
