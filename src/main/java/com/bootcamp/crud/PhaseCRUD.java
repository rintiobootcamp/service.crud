
package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Phase;
import com.bootcamp.repositories.PhaseRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class PhaseCRUD implements DatabaseConstants{
    public static boolean create(Phase Phase) throws SQLException {
        PhaseRepository PhaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return PhaseRepository.create(Phase);
    }

    public static boolean update(Phase Phase) throws SQLException {
        PhaseRepository PhaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return PhaseRepository.update(Phase);
    }


    public static boolean delete(Phase Phase) throws SQLException {
        PhaseRepository PhaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return  PhaseRepository.delete(Phase);

    }

    public static List<Phase> read(Criterias criterias) {
        PhaseRepository PhaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return PhaseRepository.getDataByCriteria(criterias);
    }

    public static List<Phase> read(Criterias criterias, int page, int size) {
        PhaseRepository PhaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return PhaseRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Phase> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        PhaseRepository PhaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return PhaseRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Phase> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        PhaseRepository PhaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return PhaseRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Phase> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        PhaseRepository PhaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return PhaseRepository.getDataByCriteria(fields);
    }

    public static List<Phase> read() throws SQLException {
        PhaseRepository PhaseRepository = new PhaseRepository(PERSISTENCE_UNIT);
        return PhaseRepository.findAll();
    }
}
