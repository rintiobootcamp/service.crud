package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Preference;
import com.bootcamp.repositories.PreferenceRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class PreferenceCRUD implements DatabaseConstants {

    public static boolean create(Preference preference) throws SQLException {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.create(preference);
    }

    public static boolean update(Preference preference) throws SQLException {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.update(preference);
    }


    public static boolean delete(Preference preference) throws SQLException {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return  preferenceRepository.delete(preference);

    }

    public static List<Preference> read(Criterias criterias) {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.getDataByCriteria(criterias);
    }

    public static List<Preference> read(Criterias criterias, int page, int size) {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Preference> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Preference> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Preference> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.getDataByCriteria(fields);
    }

    public static List<Preference> read() throws SQLException {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.findAll();
    }

}
