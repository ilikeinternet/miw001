/**
 * Contains applications/business info
 */
package co.miw.models;

import java.util.Date;

/**
 * @author JTLi; 16/06/02
 * Contains user's info, also used to authentication login.
 */      
public class User {
   private Integer uid;
   private String uname;
   private String password;
   private String realname;
   private int gender;
   private Integer points;
   private int active;
   private String email;
   private String mobile;
   private String tel;
   private String office;
   private String home;
   private String remark;
   private Date ctime;
   private Integer cuid;
   private String cip;
   private Date utime;
   private Integer uuid;
   private String uip;
   public Integer getUid() {
      return uid;
   }
   public void setUid(Integer uid) {
      this.uid = uid;
   }
   public String getUname() {
      return uname;
   }
   public void setUname(String uname) {
      this.uname = uname;
   }
   public String getPassword() {
      return password;
   }
   public void setPassword(String password) {
      this.password = password;
   }
   public String getRealname() {
      return realname;
   }
   public void setRealname(String realname) {
      this.realname = realname;
   }
   public int getGender() {
      return gender;
   }
   public void setGander(int gender) {
      this.gender = gender;
   }
   public Integer getPoints() {
      return points;
   }
   public void setPoints(Integer points) {
      this.points = points;
   }
   public int getActive() {
      return active;
   }
   public void setActive(int active) {
      this.active = active;
   }  
   public String getEmail() {
      return email;
   }
   public void setEmail(String email) {
      this.email = email;
   }
   public String getMobile() {
      return mobile;
   }
   public void setMobile(String mobile) {
      this.mobile = mobile;
   }
   public String getTel() {
      return tel;
   }
   public void setTel(String tel) {
      this.tel = tel;
   }
   public String getOffice() {
      return office;
   }
   public void setOffice(String office) {
      this.office = office;
   }
   public String getHome() {
      return home;
   }
   public void setHome(String home) {
      this.home = home;
   }
   public void setGender(int gender) {
      this.gender = gender;
   }
   public String getRemark() {
      return remark;
   }
   public void setRemark(String remark) {
      this.remark = remark;
   }
   public Date getCtime() {
      return ctime;
   }
   public void setCtime(Date ctime) {
      this.ctime = ctime;
   }
   public Integer getCuid() {
      return cuid;
   }
   public void setCuid(Integer cuid) {
      this.cuid = cuid;
   }
   public String getCip() {
      return cip;
   }
   public void setCip(String cip) {
      this.cip = cip;
   }
   public Date getUtime() {
      return utime;
   }
   public void setUtime(Date utime) {
      this.utime = utime;
   }
   public Integer getUuid() {
      return uuid;
   }
   public void setUuid(Integer uuid) {
      this.uuid = uuid;
   }
   public String getUip() {
      return uip;
   }
   public void setUip(String uip) {
      this.uip = uip;
   }
   
}
