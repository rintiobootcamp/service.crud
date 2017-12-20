package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.LikeTable;
import com.bootcamp.repositories.LikeTableRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class LikeTableCRUD implements DatabaseConstants {

    /* Crud for likeTable */
    /**
     * Insert the like in the database
     *
     * @param likeTable
     * @return
     * @throws SQLException
     */
    public static boolean create(LikeTable likeTable) throws SQLException {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.create(likeTable);
    }

    /**
     * Update the like in the database
     *
     * @param likeTable
     * @return
     * @throws SQLException
     */
    public static boolean update(LikeTable likeTable) throws SQLException {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.update(likeTable);
    }

    /**
     * Delete the like in the database
     *
     * @param likeTable
     * @return
     * @throws SQLException
     */
    public static boolean delete(LikeTable likeTable) throws SQLException {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.delete(likeTable);

    }

    /**
     * Get all the likes in the database matching the given criteria list
     *
     * @param criterias
     * @return likes
     */
    public static List<LikeTable> read(Criterias criterias) {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the likes in the database matching the given criteria list, page
     * and size
     *
     * @param criterias
     * @param page
     * @param size
     * @return likes
     */
    public static List<LikeTable> read(Criterias criterias, int page, int size) {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the likes in the database matching the given
     * criteria list, page and size
     *
     * @param criterias
     * @param fields
     * @param page
     * @param size
     * @return likes
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<LikeTable> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the likes in the database matching the given
     * criteria list
     *
     * @param criterias
     * @param fields
     * @return likes
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<LikeTable> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the likes in the database
     *
     * @param fields
     * @return likes
     * @throws SQLException
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<LikeTable> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the likes in the database
     *
     * @return @throws SQLException
     */
    public static List<LikeTable> read() throws SQLException {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.findAll();
    }
}
