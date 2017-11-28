package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Secteur;
import com.bootcamp.repositories.SecteurRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class SecteurCRUD implements DatabaseConstants {

    /* Crud for secteur */

    public static boolean create(Secteur secteur) throws SQLException {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.create(secteur);
    }

    public static boolean update(Secteur secteur) throws SQLException {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.update(secteur);
    }


    public static boolean delete(Secteur secteur) throws SQLException {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return  secteurRepository.delete(secteur);

    }

    public static List<Secteur> read(Criterias criterias) {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.getDataByCriteria(criterias);
    }

    public static List<Secteur> read(Criterias criterias, int page, int size) {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Secteur> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Secteur> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Secteur> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.getDataByCriteria(fields);
    }

    public static List<Secteur> read() throws SQLException {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.findAll();
    }
}
