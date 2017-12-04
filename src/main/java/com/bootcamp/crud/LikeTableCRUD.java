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

    public static boolean create(LikeTable likeTable) throws SQLException {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.create(likeTable);
    }

    public static boolean update(LikeTable likeTable) throws SQLException {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.update(likeTable);
    }


    public static boolean delete(LikeTable likeTable) throws SQLException {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return  likeTableRepository.delete(likeTable);

    }

    public static List<LikeTable> read(Criterias criterias) {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.getDataByCriteria(criterias);
    }

    public static List<LikeTable> read(Criterias criterias, int page, int size) {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<LikeTable> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<LikeTable> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.getDataByCriteria(criterias, fields);
    }

    public static List<LikeTable> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.getDataByCriteria(fields);
    }

    public static List<LikeTable> read() throws SQLException {
        LikeTableRepository likeTableRepository = new LikeTableRepository(PERSISTENCE_UNIT);
        return likeTableRepository.findAll();
    }
}
