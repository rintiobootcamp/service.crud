package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Comment;
import com.bootcamp.repositories.CommentRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class CommentCRUD implements DatabaseConstants {

    /* Crud for comment */

    public static boolean create(Comment comment) throws SQLException {
        CommentRepository commentRepository = new CommentRepository(PERSISTENCE_UNIT);
        return commentRepository.create(comment);
    }

    public static boolean update(Comment comment) throws SQLException {
        CommentRepository commentRepository = new CommentRepository(PERSISTENCE_UNIT);
        return commentRepository.update(comment);
    }


    public static boolean delete(Comment comment) throws SQLException {
        CommentRepository commentRepository = new CommentRepository(PERSISTENCE_UNIT);
        return  commentRepository.delete(comment);

    }

    public static List<Comment> read(Criterias criterias) {
        CommentRepository commentRepository = new CommentRepository(PERSISTENCE_UNIT);
        return commentRepository.getDataByCriteria(criterias);
    }

    public static List<Comment> read(Criterias criterias, int page, int size) {
        CommentRepository commentRepository = new CommentRepository(PERSISTENCE_UNIT);
        return commentRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Comment> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        CommentRepository commentRepository = new CommentRepository(PERSISTENCE_UNIT);
        return commentRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Comment> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        CommentRepository commentRepository = new CommentRepository(PERSISTENCE_UNIT);
        return commentRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Comment> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        CommentRepository commentRepository = new CommentRepository(PERSISTENCE_UNIT);
        return commentRepository.getDataByCriteria(fields);
    }

    public static List<Comment> read() throws SQLException {
        CommentRepository commentRepository = new CommentRepository(PERSISTENCE_UNIT);
        return commentRepository.findAll();
    }
}
