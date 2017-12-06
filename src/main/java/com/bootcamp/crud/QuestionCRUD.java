package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Question;
import com.bootcamp.repositories.QuestionRepository;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class QuestionCRUD implements DatabaseConstants {

    /* Crud for question */

    public static boolean create(Question question) throws SQLException {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.create(question);
    }

    public static boolean update(Question question) throws SQLException {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.update(question);
    }


    public static boolean delete(Question question) throws SQLException {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return  questionRepository.delete(question);

    }

    public static List<Question> read(Criterias criterias) {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.getDataByCriteria(criterias);
    }

    public static List<Question> read(Criterias criterias, int page, int size) {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Question> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Question> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Question> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.getDataByCriteria(fields);
    }

    public static List<Question> read() throws SQLException {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.findAll();
    }
}
