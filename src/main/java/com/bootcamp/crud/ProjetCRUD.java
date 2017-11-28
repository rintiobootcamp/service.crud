package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Projet;
import com.bootcamp.repositories.ProjetRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class ProjetCRUD implements DatabaseConstants {

    public static boolean create(Projet projet) throws SQLException {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.create(projet);
    }

    public static boolean update(Projet projet) throws SQLException {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.update(projet);
    }


    public static boolean delete(Projet projet) throws SQLException {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return  projetRepository.delete(projet);

    }

    public static List<Projet> read(Criterias criterias) {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.getDataByCriteria(criterias);
    }

    public static List<Projet> read(Criterias criterias, int page, int size) {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Projet> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Projet> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Projet> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.getDataByCriteria(fields);
    }

    public static List<Projet> read() throws SQLException {
        ProjetRepository projetRepository = new ProjetRepository(PERSISTENCE_UNIT);
        return projetRepository.findAll();
    }

}
