package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import static com.bootcamp.commons.constants.DatabaseConstants.PERSISTENCE_UNIT;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Region;
import com.bootcamp.repositories.RegionRepository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author rintio
 */
@Transactional
public class RegionCRUD implements DatabaseConstants {

    /* Crud for region */
    /**
     * Insert the region in the database
     *
     * @param region
     * @return
     * @throws SQLException
     */
    public static boolean create(Region region) throws SQLException {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.create(region);
    }

    /**
     * Update the region in the database
     *
     * @param region
     * @return
     * @throws SQLException
     */
    public static boolean update(Region region) throws SQLException {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.update(region);
    }

    /**
     * Delete the region in the database
     *
     * @param region
     * @return
     * @throws SQLException
     */
    public static boolean delete(Region region) throws SQLException {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.delete(region);

    }

    /**
     * Get all the regions in the database matching the given criteria list
     *
     * @param criterias
     * @return regions
     */
    @Transactional(readOnly = true)
    public static List<Region> read(Criterias criterias) {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the regions in the database matching the given criteria list,
     * page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @return regions
     */
    @Transactional(readOnly = true)
    public static List<Region> read(Criterias criterias, int page, int size) {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the regions in the database matching the
     * given criteria list, page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @param fields
     * @return regions
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Region> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the regions in the database matching the
     * given criteria list
     *
     * @param criterias
     * @param fields
     * @return regions
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Region> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.getDataByCriteria(criterias, fields);
    }

    /**
     *
     * @param fields
     * @return
     * @throws SQLException
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Region> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the regions in the database
     *
     * @return regions
     * @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Region> read() throws SQLException {
        RegionRepository regionRepository = new RegionRepository(PERSISTENCE_UNIT);
        return regionRepository.findAll();
    }
}
