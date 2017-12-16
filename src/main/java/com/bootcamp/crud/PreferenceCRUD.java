package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import static com.bootcamp.commons.constants.DatabaseConstants.PERSISTENCE_UNIT;
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

    /* Crud for preference */
    /**
     * Insert the preference in the database
     *
     * @param preference
     * @return
     * @throws SQLException
     */
    public static boolean create(Preference preference) throws SQLException {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.create(preference);
    }

    /**
     * Update the preference in the database
     *
     * @param preference
     * @return
     * @throws SQLException
     */
    public static boolean update(Preference preference) throws SQLException {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.update(preference);
    }

    /**
     * Delete the preference in the database
     *
     * @param preference
     * @return
     * @throws SQLException
     */
    public static boolean delete(Preference preference) throws SQLException {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.delete(preference);

    }

    /**
     * Get all the preferences in the database matching the given criteria list
     *
     * @param criterias
     * @return preferences
     */
    public static List<Preference> read(Criterias criterias) {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the preferences in the database matching the given criteria list,
     * page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @return preferences
     */
    public static List<Preference> read(Criterias criterias, int page, int size) {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the preferences in the database matching the
     * given criteria list, page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @param fields
     * @return preferences
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<Preference> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the preferences in the database matching the
     * given criteria list
     *
     * @param criterias
     * @param fields
     * @return preferences
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<Preference> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the preferences in the database
     *
     * @param fields
     * @return preferences
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     * @throws SQLException
     */
    public static List<Preference> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the preferences in the database
     *
     * @return preferences
     * @throws SQLException
     */
    public static List<Preference> read() throws SQLException {
        PreferenceRepository preferenceRepository = new PreferenceRepository(PERSISTENCE_UNIT);
        return preferenceRepository.findAll();
    }
}
