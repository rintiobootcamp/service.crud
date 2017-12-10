package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Objectif;
import com.bootcamp.repositories.ObjectifRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Moh
 */
public class ObjectifCRUD implements DatabaseConstants {

    public static boolean create(Objectif objectif) throws SQLException {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.create(objectif);
    }

    public static boolean update(Objectif objectif) throws SQLException {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.update(objectif);
    }


    public static boolean delete(Objectif objectif) throws SQLException {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return  objectifRepository.delete(objectif);

    }

    public static List<Objectif> read(Criterias criterias) {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.getDataByCriteria(criterias);
    }

    public static List<Objectif> read(Criterias criterias, int page, int size) {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Objectif> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Objectif> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Objectif> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.getDataByCriteria(fields);
    }

    public static List<Objectif> read() throws SQLException {
        ObjectifRepository objectifRepository = new ObjectifRepository(PERSISTENCE_UNIT);
        return objectifRepository.findAll();
    }

}
