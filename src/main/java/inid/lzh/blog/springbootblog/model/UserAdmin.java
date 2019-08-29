package inid.lzh.blog.springbootblog.model;

import javax.persistence.*;

@Table(name = "user_admin")
public class UserAdmin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String loginname;

    private String loginpass;

    private String phone;

    private String emil;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return loginname
     */
    public String getLoginname() {
        return loginname;
    }

    /**
     * @param loginname
     */
    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    /**
     * @return loginpass
     */
    public String getLoginpass() {
        return loginpass;
    }

    /**
     * @param loginpass
     */
    public void setLoginpass(String loginpass) {
        this.loginpass = loginpass;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return emil
     */
    public String getEmil() {
        return emil;
    }

    /**
     * @param emil
     */
    public void setEmil(String emil) {
        this.emil = emil;
    }
}