package eternal.fire;

public class User {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Integer sudo;

    public User() {

    }

    public User(String name, String email, String password, int sudo) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.sudo = sudo;
    }

    public Integer getSudo() {
        return sudo;
    }

    public void setSudo(Integer sudo) {
        this.sudo = sudo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
