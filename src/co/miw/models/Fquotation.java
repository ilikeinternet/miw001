/**
 * It is used to store the daily quotation information of futures.
 */
package co.miw.models;

import java.sql.Date;
import java.sql.Timestamp;
import org.springframework.format.annotation.NumberFormat;

/**
 * @author JTLi
 * It is used to store the daily quotation information of futures.
 */
public class Fquotation {
   private Integer id;
   private Date marketdate;
   private String fcode;
   private String fyymm;
   @NumberFormat(pattern="##,###.##")
   private double open;
   @NumberFormat(pattern="##,###.##")
   private double max;
   @NumberFormat(pattern="##,###.##")
   private double min;
   @NumberFormat(pattern="##,###.##")
   private double close;
   @NumberFormat(pattern="##,###.##")
   private double spread;
   private Integer volume;
   private Integer interest;
   private String remark;
   private Timestamp ctime;
   private Integer cuid;
   private String cip;
   /**
    * @return the quotation id, which is a serial number
    */
   public Integer getId() {
      return id;
   }
   /**
    * @param id the id to set
    */
   public void setId(Integer id) {
      this.id = id;
   }
   /**
    * @return the market date
    */
   public Date getMarketdate() {
      return marketdate;
   }
   /**
    * @param marketdate the market date to set
    */
   public void setMarketdate(Date marketdate) {
      this.marketdate = marketdate;
   }
   /**
    * @return the fcode
    */
   public String getFcode() {
      return fcode;
   }
   /**
    * @param fcode the fcode to set
    */
   public void setFcode(String fcode) {
      this.fcode = fcode;
   }
   /**
    * @return the fyymm
    */
   public String getFyymm() {
      return fyymm;
   }
   /**
    * @param fyymm the fyymm to set
    */
   public void setFyymm(String fyymm) {
      this.fyymm = fyymm;
   }
   /**
    * @return the open
    */
   public double getOpen() {
      return open;
   }
   /**
    * @param open the open to set
    */
   public void setOpen(double open) {
      this.open = open;
   }
   /**
    * @return the max
    */
   public double getMax() {
      return max;
   }
   /**
    * @param max the max to set
    */
   public void setMax(double max) {
      this.max = max;
   }
   /**
    * @return the min
    */
   public double getMin() {
      return min;
   }
   /**
    * @param min the min to set
    */
   public void setMin(double min) {
      this.min = min;
   }
   /**
    * @return the close
    */
   public double getClose() {
      return close;
   }
   /**
    * @param close the close to set
    */
   public void setClose(double close) {
      this.close = close;
   }
   /**
    * @return the spread
    */
   public double getSpread() {
      return spread;
   }
   /**
    * @param spread the spread to set
    */
   public void setSpread(double spread) {
      this.spread = spread;
   }
   /**
    * @return the volume
    */
   public Integer getVolume() {
      return volume;
   }
   /**
    * @param volume the volume to set
    */
   public void setVolume(Integer volume) {
      this.volume = volume;
   }
   /**
    * @return the interest
    */
   public Integer getInterest() {
      return interest;
   }
   /**
    * @param interest the interest to set
    */
   public void setInterest(Integer interest) {
      this.interest = interest;
   }
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
   public Timestamp getCtime() {
      return ctime;
   }
   /**
    * @param ctime the ctime to set
    */
   public void setCtime(Timestamp ctime) {
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
   
}
