package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import static com.bootcamp.commons.constants.DatabaseConstants.PERSISTENCE_UNIT;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Note;
import com.bootcamp.repositories.NoteRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class NoteCRUD implements DatabaseConstants {

    /* Crud for note */
    /**
     * Insert the note in the database
     *
     * @param note
     * @return
     * @throws SQLException
     */
    public static boolean create(Note note) throws SQLException {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.create(note);
    }

    /**
     * Update the note in the database
     *
     * @param note
     * @return
     * @throws SQLException
     */
    public static boolean update(Note note) throws SQLException {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.update(note);
    }

    /**
     * Delete the note in the database
     *
     * @param note
     * @return
     * @throws SQLException
     */
    public static boolean delete(Note note) throws SQLException {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.delete(note);

    }

    /**
     * Get all the notes in the database matching the given criteria list
     *
     * @param criterias
     * @return notes
     */
    public static List<Note> read(Criterias criterias) {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the notes in the database matching the given criteria list, page,
     * size
     *
     * @param criterias
     * @param page
     * @param size
     * @return notes
     */
    public static List<Note> read(Criterias criterias, int page, int size) {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the notes in the database matching the given
     * criteria list, page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @param fields
     * @return notes
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<Note> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the notes in the database matching the given
     * criteria list
     *
     * @param criterias
     * @param fields
     * @return notes
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<Note> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the notes in the database
     *
     * @param fields
     * @return notes
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     * @throws SQLException
     */
    public static List<Note> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the notes in the database
     *
     * @return notes
     * @throws SQLException
     */
    public static List<Note> read() throws SQLException {
        NoteRepository noteRepository = new NoteRepository(PERSISTENCE_UNIT);
        return noteRepository.findAll();
    }
}
