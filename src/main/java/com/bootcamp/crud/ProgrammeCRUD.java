package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Programme;
import com.bootcamp.repositories.ProgrammeRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class ProgrammeCRUD implements DatabaseConstants {

    public static boolean create(Programme programme) throws SQLException {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.create(programme);
    }

    public static boolean update(Programme programme) throws SQLException {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.update(programme);
    }


    public static boolean delete(Programme programme) throws SQLException {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return  programmeRepository.delete(programme);

    }

    public static List<Programme> read(Criterias criterias) {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.getDataByCriteria(criterias);
    }

    public static List<Programme> read(Criterias criterias, int page, int size) {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Programme> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Programme> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Programme> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.getDataByCriteria(fields);
    }

    public static List<Programme> read() throws SQLException {
        ProgrammeRepository programmeRepository = new ProgrammeRepository(PERSISTENCE_UNIT);
        return programmeRepository.findAll();
    }

}
