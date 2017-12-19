/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.bootcamp.commons.models.Criteria;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.crud.PagUserCRUD;
import com.bootcamp.entities.PagUser;
import org.testng.annotations.Test;

/**
 *
 * @author Bello
 */
public class UnTest {
    
    @Test
    public void unTesttr(){
        Criterias criterias = new Criterias();
        criterias.addCriteria(new Criteria("id", "=", 2));
        PagUser user = PagUserCRUD.read(criterias).get(0);
        
        System.out.println(user.getUserRoles().size());
    }
}
