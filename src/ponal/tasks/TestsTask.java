package ponal.tasks;

import java.sql.Connection;
import java.sql.Statement;
import java.util.HashMap;
import javax.sql.DataSource;
import oracle.iam.platform.Platform;
import oracle.iam.scheduler.vo.TaskSupport;
/**
 *
 * @author daniel caicedo
 */
public class TestsTask extends TaskSupport {

    @Override
    public void execute(HashMap hm) throws Exception {
       
        DataSource ds = Platform.getOperationalDS();
        Connection connection = ds.getConnection();
        Statement st = connection.createStatement();
        
        //Logica para consultar la bd de OIM Entel    
        // select  * from usr where usr_update = sysdate(); 
        
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public HashMap getAttributes() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void setAttributes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
