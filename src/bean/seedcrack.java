package bean;

public class seedcrack {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seedcrack.seedcrack_number
     *
     * @mbggenerated
     */
    private Integer seedcrackNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seedcrack.seedcrack_chname
     *
     * @mbggenerated
     */
    private String seedcrackChname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column seedcrack.seedcrack_enname
     *
     * @mbggenerated
     */
    private String seedcrackEnname;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seedcrack.seedcrack_number
     *
     * @return the value of seedcrack.seedcrack_number
     *
     * @mbggenerated
     */
    public Integer getSeedcrackNumber() {
        return seedcrackNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seedcrack.seedcrack_number
     *
     * @param seedcrackNumber the value for seedcrack.seedcrack_number
     *
     * @mbggenerated
     */
    public void setSeedcrackNumber(Integer seedcrackNumber) {
        this.seedcrackNumber = seedcrackNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seedcrack.seedcrack_chname
     *
     * @return the value of seedcrack.seedcrack_chname
     *
     * @mbggenerated
     */
    public String getSeedcrackChname() {
        return seedcrackChname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seedcrack.seedcrack_chname
     *
     * @param seedcrackChname the value for seedcrack.seedcrack_chname
     *
     * @mbggenerated
     */
    public void setSeedcrackChname(String seedcrackChname) {
        this.seedcrackChname = seedcrackChname == null ? null : seedcrackChname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column seedcrack.seedcrack_enname
     *
     * @return the value of seedcrack.seedcrack_enname
     *
     * @mbggenerated
     */
    public String getSeedcrackEnname() {
        return seedcrackEnname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column seedcrack.seedcrack_enname
     *
     * @param seedcrackEnname the value for seedcrack.seedcrack_enname
     *
     * @mbggenerated
     */
    public void setSeedcrackEnname(String seedcrackEnname) {
        this.seedcrackEnname = seedcrackEnname == null ? null : seedcrackEnname.trim();
    }
}