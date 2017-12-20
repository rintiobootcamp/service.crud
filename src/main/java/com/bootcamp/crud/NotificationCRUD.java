package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import static com.bootcamp.commons.constants.DatabaseConstants.PERSISTENCE_UNIT;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Notification;
import com.bootcamp.repositories.NotificationRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class NotificationCRUD implements DatabaseConstants {

    /* Crud for notification */
    /**
     * Insert the notification in the database
     *
     * @param notification
     * @return
     * @throws SQLException
     */
    public static boolean create(Notification notification) throws SQLException {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.create(notification);
    }

    /**
     * Update the notification in the database
     *
     * @param notification
     * @return
     * @throws SQLException
     */
    public static boolean update(Notification notification) throws SQLException {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.update(notification);
    }

    /**
     * Delete the notification in the database
     *
     * @param notification
     * @return
     * @throws SQLException
     */
    public static boolean delete(Notification notification) throws SQLException {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.delete(notification);

    }

    /**
     * Get all the notifications in the database matching the given criteria
     * list
     *
     * @param criterias
     * @return notifications
     */
    public static List<Notification> read(Criterias criterias) {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.getDataByCriteria(criterias);
    }

    /**
     * Get all the notifications in the database matching the given criteria
     * list, page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @return notifications
     */
    public static List<Notification> read(Criterias criterias, int page, int size) {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.getDataByCriteria(criterias, page, size);
    }

    /**
     * Get the given fields of all the notifications in the database matching
     * the given criteria list, page, size
     *
     * @param criterias
     * @param page
     * @param size
     * @param fields
     * @return notifications
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<Notification> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.getDataByCriteria(criterias, fields, page, size);
    }

    /**
     * Get the given fields of all the notifications in the database matching
     * the given criteria list
     *
     * @param criterias
     * @param fields
     * @return notifications
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     */
    public static List<Notification> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.getDataByCriteria(criterias, fields);
    }

    /**
     * Get the given fields of all the notifications in the database
     *
     * @param fields
     * @return notifications
     * @throws IllegalAccessException
     * @throws DatabaseException
     * @throws InvocationTargetException
     * @throws SQLException
     */
    public static List<Notification> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.getDataByCriteria(fields);
    }

    /**
     * Get all the notifications in the database
     *
     * @return notifications
     * @throws SQLException
     */
    public static List<Notification> read() throws SQLException {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.findAll();
    }
}
