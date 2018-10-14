import com.yuro.entity.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestDemo {

    @Test
    public void testDemo1() throws IOException {

        //初始化mybatis配置环境

        String resource = "mybatis.xml";

        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory =
                new SqlSessionFactoryBuilder().build(is);

        //打开和数据库之间的会话Session

        SqlSession sqlSession = factory.openSession();

        List<Users> usersList = sqlSession.selectList("usersList");

        for(Users user : usersList){
            System.out.println(user);
        }

        sqlSession.close();
    }

}
