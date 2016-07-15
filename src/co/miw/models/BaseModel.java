/**
 * 
 */
package co.miw.models;

import java.util.Date;

/**
 * @author JTLi 16/07/09
 * Define the base model fields to save the common data.
 */
public class BaseModel {
	private String remark;
   private Date ctime;
   private Integer cuid;
   private String cip;
   private Date utime;
   private Integer uuid;
   private String uip;
	/**
	 * @return the remark.
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set.
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @return the created time of this record.
	 */
	public Date getCtime() {
		return ctime;
	}
	/**
	 * @param the created time to set.
	 */
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	/**
	 * @return the created user id.
	 */
	public Integer getCuid() {
		return cuid;
	}
	/**
	 * @param the created user id to set.
	 */
	public void setCuid(Integer cuid) {
		this.cuid = cuid;
	}
	/**
	 * @return the created user's ip.
	 */
	public String getCip() {
		return cip;
	}
	/**
	 * @param the created user's ip to set.
	 */
	public void setCip(String cip) {
		this.cip = cip;
	}
	/**
	 * @return the updated time.
	 */
	public Date getUtime() {
		return utime;
	}
	/**
	 * @param the updated time to set.
	 */
	public void setUtime(Date utime) {
		this.utime = utime;
	}
	/**
	 * @return the updated user's id.
	 */
	public Integer getUuid() {
		return uuid;
	}
	/**
	 * @param the updated user's id to set
	 */
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}
	/**
	 * @return the updated ip.
	 */
	public String getUip() {
		return uip;
	}
	/**
	 * @param the updated ip to set.
	 */
	public void setUip(String uip) {
		this.uip = uip;
	}
   
}
