package bean;

public class ecoregion {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecoregion.ecoregion_number
     *
     * @mbggenerated
     */
    private Integer ecoregionNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecoregion.ecoregion_chname
     *
     * @mbggenerated
     */
    private String ecoregionChname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ecoregion.ecoregion_enname
     *
     * @mbggenerated
     */
    private String ecoregionEnname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecoregion.ecoregion_number
     *
     * @return the value of ecoregion.ecoregion_number
     *
     * @mbggenerated
     */
    public Integer getEcoregionNumber() {
        return ecoregionNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecoregion.ecoregion_number
     *
     * @param ecoregionNumber the value for ecoregion.ecoregion_number
     *
     * @mbggenerated
     */
    public void setEcoregionNumber(Integer ecoregionNumber) {
        this.ecoregionNumber = ecoregionNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecoregion.ecoregion_chname
     *
     * @return the value of ecoregion.ecoregion_chname
     *
     * @mbggenerated
     */
    public String getEcoregionChname() {
        return ecoregionChname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecoregion.ecoregion_chname
     *
     * @param ecoregionChname the value for ecoregion.ecoregion_chname
     *
     * @mbggenerated
     */
    public void setEcoregionChname(String ecoregionChname) {
        this.ecoregionChname = ecoregionChname == null ? null : ecoregionChname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ecoregion.ecoregion_enname
     *
     * @return the value of ecoregion.ecoregion_enname
     *
     * @mbggenerated
     */
    public String getEcoregionEnname() {
        return ecoregionEnname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ecoregion.ecoregion_enname
     *
     * @param ecoregionEnname the value for ecoregion.ecoregion_enname
     *
     * @mbggenerated
     */
    public void setEcoregionEnname(String ecoregionEnname) {
        this.ecoregionEnname = ecoregionEnname == null ? null : ecoregionEnname.trim();
    }
}