package eternal.fire;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    @Select("SELECT * FROM users WHERE email = #{email}")
    User getByEmail(@Param("email") String email);

    @Select("SELECT * FROM users WHERE email = #{email} AND password = #{password} AND sudo = #{sudo}")
    User getByEmailAndPasswordAndSudo(@Param("email") String email, @Param("password") String password, @Param("sudo") int sudo);

    @Select("SELECT * FROM users WHERE name = #{name} AND password = #{password} AND sudo = #{sudo}")
    User getByNameAndPasswordAndSudo(String name, String password, int sudo);

    @Insert("INSERT INTO users (email, password, name, sudo) VALUES (#{email}, #{password}, #{name}, #{sudo})")
    User insert(@Param("email") String email, @Param("password") String password, @Param("name") String name, @Param("sudo") int sudo);

    @Delete("DELETE FROM users WHERE id = #{id}")
    void deleteById(@Param("id") long id);
}
