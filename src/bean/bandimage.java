package bean;

import java.util.Date;

public class bandimage extends bandimageKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bandimage.accessionbase_number
     *
     * @mbggenerated
     */
    private String accessionbaseNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bandimage.bandimage_path
     *
     * @mbggenerated
     */
    private String bandimagePath;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bandimage.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bandimage.last_update
     *
     * @mbggenerated
     */
    private Date lastUpdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bandimage.accessionbase_number
     *
     * @return the value of bandimage.accessionbase_number
     *
     * @mbggenerated
     */
    public String getAccessionbaseNumber() {
        return accessionbaseNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bandimage.accessionbase_number
     *
     * @param accessionbaseNumber the value for bandimage.accessionbase_number
     *
     * @mbggenerated
     */
    public void setAccessionbaseNumber(String accessionbaseNumber) {
        this.accessionbaseNumber = accessionbaseNumber == null ? null : accessionbaseNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bandimage.bandimage_path
     *
     * @return the value of bandimage.bandimage_path
     *
     * @mbggenerated
     */
    public String getBandimagePath() {
        return bandimagePath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bandimage.bandimage_path
     *
     * @param bandimagePath the value for bandimage.bandimage_path
     *
     * @mbggenerated
     */
    public void setBandimagePath(String bandimagePath) {
        this.bandimagePath = bandimagePath == null ? null : bandimagePath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bandimage.remark
     *
     * @return the value of bandimage.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bandimage.remark
     *
     * @param remark the value for bandimage.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bandimage.last_update
     *
     * @return the value of bandimage.last_update
     *
     * @mbggenerated
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bandimage.last_update
     *
     * @param lastUpdate the value for bandimage.last_update
     *
     * @mbggenerated
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}