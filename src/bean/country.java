package bean;

public class country {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.country_number
     *
     * @mbggenerated
     */
    private Integer countryNumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.country_chnumber
     *
     * @mbggenerated
     */
    private String countryChnumber;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.country_ennumber
     *
     * @mbggenerated
     */
    private String countryEnnumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.country_number
     *
     * @return the value of country.country_number
     *
     * @mbggenerated
     */
    public Integer getCountryNumber() {
        return countryNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.country_number
     *
     * @param countryNumber the value for country.country_number
     *
     * @mbggenerated
     */
    public void setCountryNumber(Integer countryNumber) {
        this.countryNumber = countryNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.country_chnumber
     *
     * @return the value of country.country_chnumber
     *
     * @mbggenerated
     */
    public String getCountryChnumber() {
        return countryChnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.country_chnumber
     *
     * @param countryChnumber the value for country.country_chnumber
     *
     * @mbggenerated
     */
    public void setCountryChnumber(String countryChnumber) {
        this.countryChnumber = countryChnumber == null ? null : countryChnumber.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.country_ennumber
     *
     * @return the value of country.country_ennumber
     *
     * @mbggenerated
     */
    public String getCountryEnnumber() {
        return countryEnnumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.country_ennumber
     *
     * @param countryEnnumber the value for country.country_ennumber
     *
     * @mbggenerated
     */
    public void setCountryEnnumber(String countryEnnumber) {
        this.countryEnnumber = countryEnnumber == null ? null : countryEnnumber.trim();
    }
}