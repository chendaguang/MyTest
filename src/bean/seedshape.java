package bean;

public class seedshape {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seedshape.seedshape_number
     *
     * @mbggenerated
     */
    private Integer seedshapeNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seedshape.seedshape_chname
     *
     * @mbggenerated
     */
    private String seedshapeChname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seedshape.seedshape_enname
     *
     * @mbggenerated
     */
    private String seedshapeEnname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seedshape.seedshape_number
     *
     * @return the value of seedshape.seedshape_number
     *
     * @mbggenerated
     */
    public Integer getSeedshapeNumber() {
        return seedshapeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seedshape.seedshape_number
     *
     * @param seedshapeNumber the value for seedshape.seedshape_number
     *
     * @mbggenerated
     */
    public void setSeedshapeNumber(Integer seedshapeNumber) {
        this.seedshapeNumber = seedshapeNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seedshape.seedshape_chname
     *
     * @return the value of seedshape.seedshape_chname
     *
     * @mbggenerated
     */
    public String getSeedshapeChname() {
        return seedshapeChname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seedshape.seedshape_chname
     *
     * @param seedshapeChname the value for seedshape.seedshape_chname
     *
     * @mbggenerated
     */
    public void setSeedshapeChname(String seedshapeChname) {
        this.seedshapeChname = seedshapeChname == null ? null : seedshapeChname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seedshape.seedshape_enname
     *
     * @return the value of seedshape.seedshape_enname
     *
     * @mbggenerated
     */
    public String getSeedshapeEnname() {
        return seedshapeEnname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seedshape.seedshape_enname
     *
     * @param seedshapeEnname the value for seedshape.seedshape_enname
     *
     * @mbggenerated
     */
    public void setSeedshapeEnname(String seedshapeEnname) {
        this.seedshapeEnname = seedshapeEnname == null ? null : seedshapeEnname.trim();
    }
}