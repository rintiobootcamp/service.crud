package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import static com.bootcamp.commons.constants.DatabaseConstants.PERSISTENCE_UNIT;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Media;
import com.bootcamp.repositories.MediaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
@Transactional
public class MediaCRUD implements DatabaseConstants {

    /* Crud for media */
    /**
     * Insert the media in the database
     *
     * @param media
     * @return
     * @throws SQLException
     */
    public static boolean create(Media media) throws SQLException {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.create(media);
    }

    /**
     * Update the media in the database
     *
     * @param media
     * @return
     * @throws SQLException
     */
    public static boolean update(Media media) throws SQLException {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.update(media);
    }

    /**
     * Delete the media in the database
     *
     * @param media
     * @return
     * @throws SQLException
     */
    public static boolean delete(Media media) throws SQLException {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.delete(media);

    }

    /**
     * Get all the medias in the database matching the given criteria list
     *
     * @param criterias
     * @return medias
     */
    @Transactional(readOnly = true)
    public static List<Media> read(Criterias criterias) {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the medias in the database matching the given criteria list,
     * page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @return medias
     */
    @Transactional(readOnly = true)
    public static List<Media> read(Criterias criterias, int page, int size) {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the medias in the database matching the given
     * criteria list, page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @param fields
     * @return medias
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Media> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the medias in the database matching the given
     * criteria list
     *
     * @param criterias
     * @param fields
     * @return medias
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    @Transactional(readOnly = true)
    public static List<Media> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the medias in the database
     *
     * @param fields
     * @return medias
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     * @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Media> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the medias in the database
     *
     * @return medias
     * @throws SQLException
     */
    @Transactional(readOnly = true)
    public static List<Media> read() throws SQLException {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.findAll();
    }
}
