package bean;

public class resistant {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resistant.resistant_number
     *
     * @mbggenerated
     */
    private Integer resistantNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resistant.resistant_chname
     *
     * @mbggenerated
     */
    private String resistantChname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resistant.resistant_enname
     *
     * @mbggenerated
     */
    private String resistantEnname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column resistant.remark
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resistant.resistant_number
     *
     * @return the value of resistant.resistant_number
     *
     * @mbggenerated
     */
    public Integer getResistantNumber() {
        return resistantNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resistant.resistant_number
     *
     * @param resistantNumber the value for resistant.resistant_number
     *
     * @mbggenerated
     */
    public void setResistantNumber(Integer resistantNumber) {
        this.resistantNumber = resistantNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resistant.resistant_chname
     *
     * @return the value of resistant.resistant_chname
     *
     * @mbggenerated
     */
    public String getResistantChname() {
        return resistantChname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resistant.resistant_chname
     *
     * @param resistantChname the value for resistant.resistant_chname
     *
     * @mbggenerated
     */
    public void setResistantChname(String resistantChname) {
        this.resistantChname = resistantChname == null ? null : resistantChname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resistant.resistant_enname
     *
     * @return the value of resistant.resistant_enname
     *
     * @mbggenerated
     */
    public String getResistantEnname() {
        return resistantEnname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resistant.resistant_enname
     *
     * @param resistantEnname the value for resistant.resistant_enname
     *
     * @mbggenerated
     */
    public void setResistantEnname(String resistantEnname) {
        this.resistantEnname = resistantEnname == null ? null : resistantEnname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column resistant.remark
     *
     * @return the value of resistant.remark
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column resistant.remark
     *
     * @param remark the value for resistant.remark
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}