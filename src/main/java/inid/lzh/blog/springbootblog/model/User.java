package inid.lzh.blog.springbootblog.model;

import javax.persistence.*;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String pass;

    private String sex;

    private String emil;

    private Integer integral;

    private String phone;

    private String iconurl;

    private String sigintype;

    private String sigintime;

    private String lastlogintime;

    private String qqopenid;

    private String wecharopenid;

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
     * @return pass
     */
    public String getPass() {
        return pass;
    }

    /**
     * @param pass
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
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

    /**
     * @return integral
     */
    public Integer getIntegral() {
        return integral;
    }

    /**
     * @param integral
     */
    public void setIntegral(Integer integral) {
        this.integral = integral;
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
     * @return iconurl
     */
    public String getIconurl() {
        return iconurl;
    }

    /**
     * @param iconurl
     */
    public void setIconurl(String iconurl) {
        this.iconurl = iconurl;
    }

    /**
     * @return sigintype
     */
    public String getSigintype() {
        return sigintype;
    }

    /**
     * @param sigintype
     */
    public void setSigintype(String sigintype) {
        this.sigintype = sigintype;
    }

    /**
     * @return sigintime
     */
    public String getSigintime() {
        return sigintime;
    }

    /**
     * @param sigintime
     */
    public void setSigintime(String sigintime) {
        this.sigintime = sigintime;
    }

    /**
     * @return lastlogintime
     */
    public String getLastlogintime() {
        return lastlogintime;
    }

    /**
     * @param lastlogintime
     */
    public void setLastlogintime(String lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    /**
     * @return qqopenid
     */
    public String getQqopenid() {
        return qqopenid;
    }

    /**
     * @param qqopenid
     */
    public void setQqopenid(String qqopenid) {
        this.qqopenid = qqopenid;
    }

    /**
     * @return wecharopenid
     */
    public String getWecharopenid() {
        return wecharopenid;
    }

    /**
     * @param wecharopenid
     */
    public void setWecharopenid(String wecharopenid) {
        this.wecharopenid = wecharopenid;
    }
}