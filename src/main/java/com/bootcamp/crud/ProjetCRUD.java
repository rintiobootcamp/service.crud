package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import static com.bootcamp.commons.constants.DatabaseConstants.PERSISTENCE_UNIT;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Projet;
import com.bootcamp.repositories.ProjetRepository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author rintio
 */
@Transactional
public class ProjetCRUD implements DatabaseConstants {

    /* Crud for projet */
    /**
     * Insert the projet in the database
     *
     * @param projet
     * @return
     * @throws SQLException
     */
    public static boolean create(Projet projet) throws SQLException {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.create(projet);
    }

    /**
     * Update the projet in the database
     *
     * @param projet
     * @return
     * @throws SQLException
     */
    public static boolean update(Projet projet) throws SQLException {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.update(projet);
    }

    /**
     * Delete the projet in the database
     *
     * @param projet
     * @return
     * @throws SQLException
     */
    public static boolean delete(Projet projet) throws SQLException {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.delete(projet);

    }

    /**
     * Get all the projets in the database matching the given criteria list
     *
     * @param criterias
     * @return projets
     */
    @Transactional(readOnly = true)
    public static List<Projet> read(Criterias criterias) {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the projets in the database matching the given criteria list,
     * page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @return projets
     */
    @Transactional(readOnly = true)
    public static List<Projet> read(Criterias criterias, int page, int size) {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the projets in the database matching the
     * given criteria list, page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @param fields
     * @return projets
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Projet> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the projets in the database matching the
     * given criteria list
     *
     * @param criterias
     * @param fields
     * @return projets
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Projet> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the projets in the database
     *
     * @param fields
     * @return projets
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     * @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Projet> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the projets in the database
     *
     * @return projets
     * @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Projet> read() throws SQLException {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.findAll();
    }
}
