package bean;

public class accessiontype {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accessiontype.accessiontype_number
     *
     * @mbggenerated
     */
    private Integer accessiontypeNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accessiontype.accessiontype_chname
     *
     * @mbggenerated
     */
    private String accessiontypeChname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column accessiontype.accessiontype_enname
     *
     * @mbggenerated
     */
    private String accessiontypeEnname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accessiontype.accessiontype_number
     *
     * @return the value of accessiontype.accessiontype_number
     *
     * @mbggenerated
     */
    public Integer getAccessiontypeNumber() {
        return accessiontypeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accessiontype.accessiontype_number
     *
     * @param accessiontypeNumber the value for accessiontype.accessiontype_number
     *
     * @mbggenerated
     */
    public void setAccessiontypeNumber(Integer accessiontypeNumber) {
        this.accessiontypeNumber = accessiontypeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accessiontype.accessiontype_chname
     *
     * @return the value of accessiontype.accessiontype_chname
     *
     * @mbggenerated
     */
    public String getAccessiontypeChname() {
        return accessiontypeChname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accessiontype.accessiontype_chname
     *
     * @param accessiontypeChname the value for accessiontype.accessiontype_chname
     *
     * @mbggenerated
     */
    public void setAccessiontypeChname(String accessiontypeChname) {
        this.accessiontypeChname = accessiontypeChname == null ? null : accessiontypeChname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column accessiontype.accessiontype_enname
     *
     * @return the value of accessiontype.accessiontype_enname
     *
     * @mbggenerated
     */
    public String getAccessiontypeEnname() {
        return accessiontypeEnname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column accessiontype.accessiontype_enname
     *
     * @param accessiontypeEnname the value for accessiontype.accessiontype_enname
     *
     * @mbggenerated
     */
    public void setAccessiontypeEnname(String accessiontypeEnname) {
        this.accessiontypeEnname = accessiontypeEnname == null ? null : accessiontypeEnname.trim();
    }
}