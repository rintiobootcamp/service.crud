package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import static com.bootcamp.commons.constants.DatabaseConstants.PERSISTENCE_UNIT;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Question;
import com.bootcamp.repositories.QuestionRepository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author rintio
 */
@Transactional
public class QuestionCRUD implements DatabaseConstants {

    /* Crud for question */
    /**
     * Insert the question in the database
     *
     * @param question
     * @return
     * @throws SQLException
     */
    public static boolean create(Question question) throws SQLException {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.create(question);
    }

    /**
     * Update the question in the database
     *
     * @param question
     * @return
     * @throws SQLException
     */
    public static boolean update(Question question) throws SQLException {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.update(question);
    }

    public static boolean updateUne(Question question) throws SQLException {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        questionRepository.getEm().createQuery("UPDATE QUESTION q SET q.UNE:=fals");
        return true;

    }

    /**
     * Delete the question in the database
     *
     * @param question
     * @return
     * @throws SQLException
     */
    public static boolean delete(Question question) throws SQLException {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.delete(question);

    }

    /**
     * Get all the questions in the database matching the given criteria list
     *
     * @param criterias
     * @return questions
     */
    @Transactional(readOnly = true)
    public static List<Question> read(Criterias criterias) {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the questions in the database matching the given criteria list,
     * page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @return questions
     */
    @Transactional(readOnly = true)
    public static List<Question> read(Criterias criterias, int page, int size) {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the questions in the database matching the
     * given criteria list, page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @param fields
     * @return questions
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Question> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the questions in the database matching the
     * given criteria list
     *
     * @param criterias
     * @param fields
     * @return questions
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Question> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the questions in the database
     *
     * @param fields
     * @return questions
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     * @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Question> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the questions in the database
     *
     * @return questions
     * @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Question> read() throws SQLException {
        QuestionRepository questionRepository = new QuestionRepository(PERSISTENCE_UNIT);
        return questionRepository.findAll();
    }


}
