package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Debat;
import com.bootcamp.repositories.DebatRepository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
@Transactional
public class DebatCRUD implements DatabaseConstants {

    /* Crud for debat */
    /**
     * Insert the debate in the database
     *
     * @param debat
     * @return
     * @throws SQLException
     */
    public static boolean create(Debat debat) throws SQLException {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.create(debat);
    }

    /**
     * Update the debate in the database
     *
     * @param debat
     * @return
     * @throws SQLException
     */
    public static boolean update(Debat debat) throws SQLException {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.update(debat);
    }

    /**
     * Delete the debate in the database
     *
     * @param debat
     * @return
     * @throws SQLException
     */
    public static boolean delete(Debat debat) throws SQLException {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.delete(debat);

    }

    /**
     * Get all the comments in the database matching the given criteria list
     *
     * @param criterias
     * @return comments
     */
    @Transactional(readOnly = true)
    public static List<Debat> read(Criterias criterias) {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.getDataByCriteria(criterias);
    }

    /**
     *
     * Get all the comments in the database matching the given criteria list,
     * page and size
     *
     * @param criterias
     * @param page
     * @param size
     * @return comments
     */
    @Transactional(readOnly = true)
    public static List<Debat> read(Criterias criterias, int page, int size) {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the comments in the database matching the
     * given criteria list, page and size
     *
     * @param criterias
     * @param fields
     * @param page
     * @param size
     * @return comments
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Debat> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the comments in the database matching the
     * given criteria list
     *
     * @param criterias
     * @param fields
     * @return comments
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Debat> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the comments in the database
     *
     * @param fields
     * @return
     * @throws SQLException
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Debat> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the comments in the database
     *
     * @return @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Debat> read() throws SQLException {
        DebatRepository debatRepository = new DebatRepository(PERSISTENCE_UNIT);
        return debatRepository.findAll();
    }
}
