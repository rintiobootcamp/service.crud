package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import static com.bootcamp.commons.constants.DatabaseConstants.PERSISTENCE_UNIT;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Programme;
import com.bootcamp.repositories.ProgrammeRepository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
@Transactional
public class ProgrammeCRUD implements DatabaseConstants {

    /* Crud for programme */
    /**
     * Insert the programme in the database
     *
     * @param programme
     * @return
     * @throws SQLException
     */
    public static boolean create(Programme programme) throws SQLException {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.create(programme);
    }

    /**
     * Update the programme in the database
     *
     * @param programme
     * @return
     * @throws SQLException
     */
    public static boolean update(Programme programme) throws SQLException {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.update(programme);
    }

    /**
     * Delete the programme in the database
     *
     * @param programme
     * @return
     * @throws SQLException
     */
    public static boolean delete(Programme programme) throws SQLException {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.delete(programme);

    }

    /**
     * Get all the programmes in the database matching the given criteria list
     *
     * @param criterias
     * @return programmes
     */
    @Transactional(readOnly = true)
    public static List<Programme> read(Criterias criterias) {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the programmes in the database matching the given criteria list,
     * page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @return programmes
     */
    @Transactional(readOnly = true)
    public static List<Programme> read(Criterias criterias, int page, int size) {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the programmes in the database matching the
     * given criteria list, page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @param fields
     * @return programmes
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Programme> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the programmes in the database matching the
     * given criteria list
     *
     * @param criterias
     * @param fields
     * @return programmes
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Programme> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the programmes in the database
     *
     * @param fields
     * @return programmes
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     * @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Programme> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the programmes in the database
     *
     * @return programmes
     * @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Programme> read() throws SQLException {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.findAll();
    }
}
