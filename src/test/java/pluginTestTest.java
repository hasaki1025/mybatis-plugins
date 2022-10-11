import com.mybatis.plugins.mapper.BookMapper;
import com.mybatis.plugins.mapper.UserMapper;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class pluginTestTest {


    @Test
    void TestPlugins() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("src/main/resources/mybatis-config.xml");
        UserMapper userMapper = new SqlSessionFactoryBuilder().build(fileInputStream).openSession().getMapper(UserMapper.class);

    }
}