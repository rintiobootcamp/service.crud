package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Commentaire;
import com.bootcamp.repositories.CommentaireRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class CommentaireCRUD implements DatabaseConstants {

    /* Crud for Commentaire */

    public static boolean create(Commentaire Commentaire) throws SQLException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.create(Commentaire);
    }

    public static boolean update(Commentaire Commentaire) throws SQLException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.update(Commentaire);
    }


    public static boolean delete(Commentaire Commentaire) throws SQLException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return  CommentaireRepository.delete(Commentaire);

    }

    public static List<Commentaire> read(Criterias criterias) {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.getDataByCriteria(criterias);
    }

    public static List<Commentaire> read(Criterias criterias, int page, int size) {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Commentaire> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Commentaire> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Commentaire> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.getDataByCriteria(fields);
    }

    public static List<Commentaire> read() throws SQLException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.findAll();
    }
}
