package bean;

public class tolerance {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tolerance.tolerance_number
     *
     * @mbggenerated
     */
    private Integer toleranceNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tolerance.tolerance_chname
     *
     * @mbggenerated
     */
    private String toleranceChname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tolerance.tolerance_enname
     *
     * @mbggenerated
     */
    private String toleranceEnname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tolerance.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tolerance.tolerance_number
     *
     * @return the value of tolerance.tolerance_number
     *
     * @mbggenerated
     */
    public Integer getToleranceNumber() {
        return toleranceNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tolerance.tolerance_number
     *
     * @param toleranceNumber the value for tolerance.tolerance_number
     *
     * @mbggenerated
     */
    public void setToleranceNumber(Integer toleranceNumber) {
        this.toleranceNumber = toleranceNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tolerance.tolerance_chname
     *
     * @return the value of tolerance.tolerance_chname
     *
     * @mbggenerated
     */
    public String getToleranceChname() {
        return toleranceChname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tolerance.tolerance_chname
     *
     * @param toleranceChname the value for tolerance.tolerance_chname
     *
     * @mbggenerated
     */
    public void setToleranceChname(String toleranceChname) {
        this.toleranceChname = toleranceChname == null ? null : toleranceChname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tolerance.tolerance_enname
     *
     * @return the value of tolerance.tolerance_enname
     *
     * @mbggenerated
     */
    public String getToleranceEnname() {
        return toleranceEnname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tolerance.tolerance_enname
     *
     * @param toleranceEnname the value for tolerance.tolerance_enname
     *
     * @mbggenerated
     */
    public void setToleranceEnname(String toleranceEnname) {
        this.toleranceEnname = toleranceEnname == null ? null : toleranceEnname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tolerance.remark
     *
     * @return the value of tolerance.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tolerance.remark
     *
     * @param remark the value for tolerance.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}