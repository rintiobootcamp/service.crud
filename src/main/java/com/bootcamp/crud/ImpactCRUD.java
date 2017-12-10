package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Impact;
import com.bootcamp.repositories.ImpactRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Moh
 */
public class ImpactCRUD implements DatabaseConstants {

    public static boolean create(Impact impact) throws SQLException {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.create(impact);
    }

    public static boolean update(Impact impact) throws SQLException {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.update(impact);
    }


    public static boolean delete(Impact impact) throws SQLException {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return  ImpactRepository.delete(impact);

    }

    public static List<Impact> read(Criterias criterias) {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.getDataByCriteria(criterias);
    }

    public static List<Impact> read(Criterias criterias, int page, int size) {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Impact> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Impact> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Impact> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.getDataByCriteria(fields);
    }

    public static List<Impact> read() throws SQLException {
        ImpactRepository ImpactRepository = new ImpactRepository(PERSISTENCE_UNIT);
        return ImpactRepository.findAll();
    }

}
