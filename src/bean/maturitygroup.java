package bean;

public class maturitygroup {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maturitygroup.maturitygroup_number
     *
     * @mbggenerated
     */
    private Integer maturitygroupNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maturitygroup.maturitygroup_chname
     *
     * @mbggenerated
     */
    private String maturitygroupChname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column maturitygroup.maturitygroup_enname
     *
     * @mbggenerated
     */
    private String maturitygroupEnname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maturitygroup.maturitygroup_number
     *
     * @return the value of maturitygroup.maturitygroup_number
     *
     * @mbggenerated
     */
    public Integer getMaturitygroupNumber() {
        return maturitygroupNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maturitygroup.maturitygroup_number
     *
     * @param maturitygroupNumber the value for maturitygroup.maturitygroup_number
     *
     * @mbggenerated
     */
    public void setMaturitygroupNumber(Integer maturitygroupNumber) {
        this.maturitygroupNumber = maturitygroupNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maturitygroup.maturitygroup_chname
     *
     * @return the value of maturitygroup.maturitygroup_chname
     *
     * @mbggenerated
     */
    public String getMaturitygroupChname() {
        return maturitygroupChname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maturitygroup.maturitygroup_chname
     *
     * @param maturitygroupChname the value for maturitygroup.maturitygroup_chname
     *
     * @mbggenerated
     */
    public void setMaturitygroupChname(String maturitygroupChname) {
        this.maturitygroupChname = maturitygroupChname == null ? null : maturitygroupChname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column maturitygroup.maturitygroup_enname
     *
     * @return the value of maturitygroup.maturitygroup_enname
     *
     * @mbggenerated
     */
    public String getMaturitygroupEnname() {
        return maturitygroupEnname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column maturitygroup.maturitygroup_enname
     *
     * @param maturitygroupEnname the value for maturitygroup.maturitygroup_enname
     *
     * @mbggenerated
     */
    public void setMaturitygroupEnname(String maturitygroupEnname) {
        this.maturitygroupEnname = maturitygroupEnname == null ? null : maturitygroupEnname.trim();
    }
}