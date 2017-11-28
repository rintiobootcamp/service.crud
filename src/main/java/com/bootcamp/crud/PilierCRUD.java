package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
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

    public static boolean create(Pilier pilier) throws SQLException {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.create(pilier);
    }

    public static boolean update(Pilier pilier) throws SQLException {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.update(pilier);
    }


    public static boolean delete(Pilier pilier) throws SQLException {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return  pilierRepository.delete(pilier);

    }

    public static List<Pilier> read(Criterias criterias) {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.getDataByCriteria(criterias);
    }

    public static List<Pilier> read(Criterias criterias, int page, int size) {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Pilier> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Pilier> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Pilier> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.getDataByCriteria(fields);
    }

    public static List<Pilier> read() throws SQLException {
        PilierRepository pilierRepository = new PilierRepository(PERSISTENCE_UNIT);
        return pilierRepository.findAll();
    }
}
