package eternal.fire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User loginByEmail(String email, String password) {
        User user = userMapper.getByEmailAndPasswordAndSudo(email, password, 0);
        if (user == null) {
            throw new RuntimeException("User not found");
        }
        return user;
    }

    public User loginSudoByEmail(String email, String password) {
        User user = userMapper.getByEmailAndPasswordAndSudo(email, password, 1);
        if (user == null) {
            throw new RuntimeException("User not found");
        }
        return user;
    }

    public User loginByName(String name, String password) {
        User user = userMapper.getByNameAndPasswordAndSudo(name, password, 0);
        if (user == null) {
            throw new RuntimeException("user not found");
        }
        return user;
    }

    public User loginSudoByName(String name, String password) {
        User user = userMapper.getByNameAndPasswordAndSudo(name, password, 1);
        if (user == null) {
            throw new RuntimeException("user not found");
        }
        return user;
    }

    public User register(String email, String password, String name) {
        User user = userMapper.insert(email, password, name, 0);
        if (user == null) {
            throw new RuntimeException("user not found");
        }
        return user;
    }

    public void logout(long id) {
        userMapper.deleteById(id);
    }
}
