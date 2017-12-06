package com.bootcamp;

import com.bootcamp.crud.DebatCRUD;
import org.testng.annotations.Test;
import com.bootcamp.entities.Debat;
import java.sql.SQLException;


/**
 * Created by darextossa on 9/22/17.
 */


public class DebatTest {

    @Test
    public void createDebat() throws SQLException{
        Debat debat = new Debat();
        debat.setSujet("Lettre ouverte au gouvernement");
        debat.setEntityId(1);
        debat.setEntityType("AXE");
        debat.setDateCreation(System.currentTimeMillis());
        debat.setDateMiseAJour(System.currentTimeMillis());
        DebatCRUD.create(debat);
    }
}
