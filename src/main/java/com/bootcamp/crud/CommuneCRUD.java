
package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Commune;
import com.bootcamp.repositories.CommuneRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class CommuneCRUD implements DatabaseConstants{
    public static boolean create(Commune commune) throws SQLException {
        CommuneRepository communeRepository = new CommuneRepository(PERSISTENCE_UNIT);
        return communeRepository.create(commune);
    }

    public static boolean update(Commune commune) throws SQLException {
        CommuneRepository communeRepository = new CommuneRepository(PERSISTENCE_UNIT);
        return communeRepository.update(commune);
    }


    public static boolean delete(Commune commune) throws SQLException {
        CommuneRepository communeRepository = new CommuneRepository(PERSISTENCE_UNIT);
        return  communeRepository.delete(commune);

    }

    public static List<Commune> read(Criterias criterias) {
        CommuneRepository communeRepository = new CommuneRepository(PERSISTENCE_UNIT);
        return communeRepository.getDataByCriteria(criterias);
    }

    public static List<Commune> read(Criterias criterias, int page, int size) {
        CommuneRepository communeRepository = new CommuneRepository(PERSISTENCE_UNIT);
        return communeRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Commune> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        CommuneRepository communeRepository = new CommuneRepository(PERSISTENCE_UNIT);
        return communeRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Commune> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        CommuneRepository communeRepository = new CommuneRepository(PERSISTENCE_UNIT);
        return communeRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Commune> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        CommuneRepository communeRepository = new CommuneRepository(PERSISTENCE_UNIT);
        return communeRepository.getDataByCriteria(fields);
    }

    public static List<Commune> read() throws SQLException {
        CommuneRepository communeRepository = new CommuneRepository(PERSISTENCE_UNIT);
        return communeRepository.findAll();
    }
}
