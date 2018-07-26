package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import static com.bootcamp.commons.constants.DatabaseConstants.PERSISTENCE_UNIT;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Phase;
import com.bootcamp.repositories.PhaseRepository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
@Transactional
public class PhaseCRUD implements DatabaseConstants {

    /* Crud for phase */
    /**
     * Insert the phase in the database
     *
     * @param phase
     * @return
     * @throws SQLException
     */
    public static boolean create(Phase phase) throws SQLException {
        PhaseRepository phaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return phaseRepository.create(phase);
    }

    /**
     * Update the phase in the database
     *
     * @param phase
     * @return
     * @throws SQLException
     */
    public static boolean update(Phase phase) throws SQLException {
        PhaseRepository phaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return phaseRepository.update(phase);
    }

    /**
     * Delete the phase in the database
     *
     * @param phase
     * @return
     * @throws SQLException
     */
    public static boolean delete(Phase phase) throws SQLException {
        PhaseRepository phaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return phaseRepository.delete(phase);

    }

    /**
     * Get all the phases in the database matching the given criteria list
     *
     * @param criterias
     * @return phases
     */
    @Transactional(readOnly = true)
    public static List<Phase> read(Criterias criterias) {
        PhaseRepository phaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return phaseRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the phases in the database matching the given criteria list,
     * page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @return phases
     */
    @Transactional(readOnly = true)
    public static List<Phase> read(Criterias criterias, int page, int size) {
        PhaseRepository phaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return phaseRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the phases in the database matching the given
     * criteria list, page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @param fields
     * @return phases
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Phase> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        PhaseRepository phaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return phaseRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the phases in the database matching the given
     * criteria list
     *
     * @param criterias
     * @param fields
     * @return phases
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Phase> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        PhaseRepository phaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return phaseRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the phases in the database
     *
     * @param fields
     * @return phases
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     * @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Phase> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        PhaseRepository phaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return phaseRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the phases in the database
     *
     * @return phases
     * @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Phase> read() throws SQLException {
        PhaseRepository phaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return phaseRepository.findAll();
    }
}
