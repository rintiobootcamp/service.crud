import com.bootcamp.constants.AppConstants;
import java.util.Properties;
import javax.persistence.Persistence;
import org.testng.annotations.Test;


/**
 * Created by darextossa on 9/22/17.
 */


public class GenerateTableTest {

    @Test
    public void generateTables(){
        Persistence.generateSchema(AppConstants.PERSISTENCE_UNIT, new Properties());
//        
//        List<Criteria> criterias = new ArrayList<Criteria>();
//        criterias.add(new Criteria(new Rule("entityId", "=", 3), "AND"));
//        criterias.add(new Criteria(new Rule("entityType", "=", EntityType.PROJET), null));
//        List<Commentaire> commentaires = CommentaireCRUD.getByCriteria(criterias);
//        
//        System.out.println(commentaires.get(0));
    }
}
