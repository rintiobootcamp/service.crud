package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import static com.bootcamp.commons.constants.DatabaseConstants.PERSISTENCE_UNIT;
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
    /**
     * Insert the secteur in the database
     *
     * @param secteur
     * @return
     * @throws SQLException
     */
    public static boolean create(Secteur secteur) throws SQLException {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.create(secteur);
    }

    /**
     * Update the secteur in the database
     *
     * @param secteur
     * @return
     * @throws SQLException
     */
    public static boolean update(Secteur secteur) throws SQLException {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.update(secteur);
    }

    /**
     * Delete the secteur in the database
     *
     * @param secteur
     * @return
     * @throws SQLException
     */
    public static boolean delete(Secteur secteur) throws SQLException {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.delete(secteur);

    }

    /**
     * Get all the secteurs in the database matching the given criteria list
     *
     * @param criterias
     * @return secteurs
     */
    public static List<Secteur> read(Criterias criterias) {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the secteurs in the database matching the given criteria list,
     * page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @return secteurs
     */
    public static List<Secteur> read(Criterias criterias, int page, int size) {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the secteurs in the database matching the
     * given criteria list, page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @param fields
     * @return secteurs
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<Secteur> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the secteurs in the database matching the
     * given criteria list
     *
     * @param criterias
     * @param fields
     * @return secteurs
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<Secteur> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the secteurs in the database
     *
     * @param fields
     * @return secteurs
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     * @throws SQLException
     */
    public static List<Secteur> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the secteurs in the database
     *
     * @return secteurs
     * @throws SQLException
     */
    public static List<Secteur> read() throws SQLException {
        SecteurRepository secteurRepository = new SecteurRepository(PERSISTENCE_UNIT);
        return secteurRepository.findAll();
    }
}
