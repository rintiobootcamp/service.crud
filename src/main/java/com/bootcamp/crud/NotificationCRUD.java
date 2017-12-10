package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Notification;
import com.bootcamp.repositories.NotificationRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Moh
 */
public class NotificationCRUD implements DatabaseConstants {

    public static boolean create(Notification notification) throws SQLException {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.create(notification);
    }

    public static boolean update(Notification notification) throws SQLException {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.update(notification);
    }


    public static boolean delete(Notification notification) throws SQLException {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return  notificationRepository.delete(notification);

    }

    public static List<Notification> read(Criterias criterias) {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.getDataByCriteria(criterias);
    }

    public static List<Notification> read(Criterias criterias, int page, int size) {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Notification> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Notification> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Notification> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.getDataByCriteria(fields);
    }

    public static List<Notification> read() throws SQLException {
        NotificationRepository notificationRepository = new NotificationRepository(PERSISTENCE_UNIT);
        return notificationRepository.findAll();
    }

}
