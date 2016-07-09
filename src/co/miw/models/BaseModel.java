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
	 * @return the remark
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * @param remark the remark to set
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * @return the ctime
	 */
	public Date getCtime() {
		return ctime;
	}
	/**
	 * @param ctime the ctime to set
	 */
	public void setCtime(Date ctime) {
		this.ctime = ctime;
	}
	/**
	 * @return the cuid
	 */
	public Integer getCuid() {
		return cuid;
	}
	/**
	 * @param cuid the cuid to set
	 */
	public void setCuid(Integer cuid) {
		this.cuid = cuid;
	}
	/**
	 * @return the cip
	 */
	public String getCip() {
		return cip;
	}
	/**
	 * @param cip the cip to set
	 */
	public void setCip(String cip) {
		this.cip = cip;
	}
	/**
	 * @return the utime
	 */
	public Date getUtime() {
		return utime;
	}
	/**
	 * @param utime the utime to set
	 */
	public void setUtime(Date utime) {
		this.utime = utime;
	}
	/**
	 * @return the uuid
	 */
	public Integer getUuid() {
		return uuid;
	}
	/**
	 * @param uuid the uuid to set
	 */
	public void setUuid(Integer uuid) {
		this.uuid = uuid;
	}
	/**
	 * @return the uip
	 */
	public String getUip() {
		return uip;
	}
	/**
	 * @param uip the uip to set
	 */
	public void setUip(String uip) {
		this.uip = uip;
	}
   
}
