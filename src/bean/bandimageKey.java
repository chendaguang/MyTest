package bean;

public class bandimageKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bandimage.bandimage_number
     *
     * @mbggenerated
     */
    private String bandimageNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bandimage.bandimage_name
     *
     * @mbggenerated
     */
    private String bandimageName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bandimage.bandimage_number
     *
     * @return the value of bandimage.bandimage_number
     *
     * @mbggenerated
     */
    public String getBandimageNumber() {
        return bandimageNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bandimage.bandimage_number
     *
     * @param bandimageNumber the value for bandimage.bandimage_number
     *
     * @mbggenerated
     */
    public void setBandimageNumber(String bandimageNumber) {
        this.bandimageNumber = bandimageNumber == null ? null : bandimageNumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bandimage.bandimage_name
     *
     * @return the value of bandimage.bandimage_name
     *
     * @mbggenerated
     */
    public String getBandimageName() {
        return bandimageName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bandimage.bandimage_name
     *
     * @param bandimageName the value for bandimage.bandimage_name
     *
     * @mbggenerated
     */
    public void setBandimageName(String bandimageName) {
        this.bandimageName = bandimageName == null ? null : bandimageName.trim();
    }
}