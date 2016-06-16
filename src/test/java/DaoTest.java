import com.allen.dao.UserDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Allen on 2016/6/15.
 */
public class DaoTest {

    @Autowired
    private UserDao userdao;
    @Test
    public void DaoTest() {
        Assert.assertNotNull(userdao);
    }
}
