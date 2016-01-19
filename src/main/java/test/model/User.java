package test.model;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * (存放javabean)
 * @author tony
 *
 */
public class User {
    private Integer id;

    private String userName;

    private String password;

    private Integer age;

    public Integer getId() {
        return id;
    }
    
//    @Autowired
    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

//    @Autowired
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

//    @Autowired
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

//    @Autowired
    public void setAge(Integer age) {
        this.age = age;
    }
}