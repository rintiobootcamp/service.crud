package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.TypeReponse;
import com.bootcamp.repositories.TypeReponseRepository;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class TypeReponseCRUD implements DatabaseConstants {

    /* Crud for typeReponse */

    public static boolean create(TypeReponse typeReponse) throws SQLException {
        TypeReponseRepository typeReponseRepository = new TypeReponseRepository(PERSISTENCE_UNIT);
        return typeReponseRepository.create(typeReponse);
    }

    public static boolean update(TypeReponse typeReponse) throws SQLException {
        TypeReponseRepository typeReponseRepository = new TypeReponseRepository(PERSISTENCE_UNIT);
        return typeReponseRepository.update(typeReponse);
    }


    public static boolean delete(TypeReponse typeReponse) throws SQLException {
        TypeReponseRepository typeReponseRepository = new TypeReponseRepository(PERSISTENCE_UNIT);
        return  typeReponseRepository.delete(typeReponse);

    }

    public static List<TypeReponse> read(Criterias criterias) {
        TypeReponseRepository typeReponseRepository = new TypeReponseRepository(PERSISTENCE_UNIT);
        return typeReponseRepository.getDataByCriteria(criterias);
    }

    public static List<TypeReponse> read(Criterias criterias, int page, int size) {
        TypeReponseRepository typeReponseRepository = new TypeReponseRepository(PERSISTENCE_UNIT);
        return typeReponseRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<TypeReponse> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        TypeReponseRepository typeReponseRepository = new TypeReponseRepository(PERSISTENCE_UNIT);
        return typeReponseRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<TypeReponse> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        TypeReponseRepository typeReponseRepository = new TypeReponseRepository(PERSISTENCE_UNIT);
        return typeReponseRepository.getDataByCriteria(criterias, fields);
    }

    public static List<TypeReponse> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        TypeReponseRepository typeReponseRepository = new TypeReponseRepository(PERSISTENCE_UNIT);
        return typeReponseRepository.getDataByCriteria(fields);
    }

    public static List<TypeReponse> read() throws SQLException {
        TypeReponseRepository typeReponseRepository = new TypeReponseRepository(PERSISTENCE_UNIT);
        return typeReponseRepository.findAll();
    }
}
