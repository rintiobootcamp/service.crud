
package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Media;
import com.bootcamp.repositories.MediaRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class MediaCRUD implements DatabaseConstants{
    public static boolean create(Media media) throws SQLException {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.create(media);
    }

    public static boolean update(Media media) throws SQLException {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.update(media);
    }


    public static boolean delete(Media media) throws SQLException {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return  mediaRepository.delete(media);

    }

    public static List<Media> read(Criterias criterias) {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.getDataByCriteria(criterias);
    }

    public static List<Media> read(Criterias criterias, int page, int size) {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Media> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Media> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Media> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.getDataByCriteria(fields);
    }

    public static List<Media> read() throws SQLException {
        MediaRepository mediaRepository = new MediaRepository(PERSISTENCE_UNIT);
        return mediaRepository.findAll();
    }
}
