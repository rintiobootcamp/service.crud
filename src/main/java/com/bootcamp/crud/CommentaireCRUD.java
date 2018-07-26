package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Commentaire;
import com.bootcamp.repositories.CommentaireRepository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
@Transactional
public class CommentaireCRUD implements DatabaseConstants {

    /* Crud for Commentaire */
    /**
     * Insert the comment in the database
     *
     * @param Commentaire
     * @return
     * @throws SQLException
     */
    public static boolean create(Commentaire Commentaire) throws SQLException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.create(Commentaire);
    }

    /**
     * Update the comment in the database
     *
     * @param Commentaire
     * @return
     * @throws SQLException
     */
    public static boolean update(Commentaire Commentaire) throws SQLException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.update(Commentaire);
    }

    /**
     * Delete the comment in the database
     *
     * @param Commentaire
     * @return
     * @throws SQLException
     */
    public static boolean delete(Commentaire Commentaire) throws SQLException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.delete(Commentaire);

    }

    /**
     * Get all the comments in the database matching the given criteria list
     *
     * @param criterias
     * @return comments
     */
    @Transactional(readOnly = true)
    public static List<Commentaire> read(Criterias criterias) {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the comments in the database matching the given criteria list,
     * page and size
     *
     * @param criterias
     * @param page
     * @param size
     * @return comments
     */
    @Transactional(readOnly = true)
    public static List<Commentaire> read(Criterias criterias, int page, int size) {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the comments in the database matching the
     * given criteria list, page and size
     *
     * @param criterias
     * @param page
     * @param fields
     * @param size
     * @return comments
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Commentaire> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the comments in the database matching the
     * given criteria list
     *
     * @param criterias
     * @param fields
     * @return comments
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Commentaire> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the comments in the database
     *
     * @param fields
     * @return comments
     * @throws SQLException
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Commentaire> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.getDataByCriteria(fields);
    }

    /**
     * Get the given fields of all the comments in the database
     *
     * @return @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Commentaire> read() throws SQLException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.findAll();
    }
}
