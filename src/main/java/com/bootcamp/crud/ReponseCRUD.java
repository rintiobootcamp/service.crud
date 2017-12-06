package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Reponse;
import com.bootcamp.repositories.ReponseRepository;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class ReponseCRUD implements DatabaseConstants {

    /* Crud for reponse */

    public static boolean create(Reponse reponse) throws SQLException {
        ReponseRepository reponseRepository = new ReponseRepository(PERSISTENCE_UNIT);
        return reponseRepository.create(reponse);
    }

    public static boolean update(Reponse reponse) throws SQLException {
        ReponseRepository reponseRepository = new ReponseRepository(PERSISTENCE_UNIT);
        return reponseRepository.update(reponse);
    }


    public static boolean delete(Reponse reponse) throws SQLException {
        ReponseRepository reponseRepository = new ReponseRepository(PERSISTENCE_UNIT);
        return  reponseRepository.delete(reponse);

    }

    public static List<Reponse> read(Criterias criterias) {
        ReponseRepository reponseRepository = new ReponseRepository(PERSISTENCE_UNIT);
        return reponseRepository.getDataByCriteria(criterias);
    }

    public static List<Reponse> read(Criterias criterias, int page, int size) {
        ReponseRepository reponseRepository = new ReponseRepository(PERSISTENCE_UNIT);
        return reponseRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Reponse> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ReponseRepository reponseRepository = new ReponseRepository(PERSISTENCE_UNIT);
        return reponseRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Reponse> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ReponseRepository reponseRepository = new ReponseRepository(PERSISTENCE_UNIT);
        return reponseRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Reponse> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        ReponseRepository reponseRepository = new ReponseRepository(PERSISTENCE_UNIT);
        return reponseRepository.getDataByCriteria(fields);
    }

    public static List<Reponse> read() throws SQLException {
        ReponseRepository reponseRepository = new ReponseRepository(PERSISTENCE_UNIT);
        return reponseRepository.findAll();
    }
}
