package ponal.tasks;

import java.nio.file.AccessDeniedException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.HashMap;
import javax.sql.DataSource;
import oracle.iam.identity.exception.UserSearchException;
import oracle.iam.identity.usermgmt.api.UserManager;
import oracle.iam.platform.Platform;
import oracle.iam.scheduler.vo.TaskSupport;



/**
 *
 * @author daniel caicedo
 */
public class TestsTask extends TaskSupport {

    /**
     * @param args the command line arguments
     */
    
    @Override
    public void execute(HashMap hm) throws UserSearchException, AccessDeniedException, ParseException, SQLException {
        // UserManager userManager = (UserManager) Platform.getService(UserManager.class);
        DataSource ds = Platform.getOperationalDS();
        Connection connection = ds.getConnection();
        Statement st = connection.createStatement();
        
        ResultSet result = st.executeQuery("SELECT usr_login FROM usr WHERE usr_login = 'DCAICEDO'");
           
        int uloginIndex = result.findColumn("usr_login");
            
        while (result.next()) {
            String user = result.getString(uloginIndex);
            System.out.println(user);
        }
        
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
