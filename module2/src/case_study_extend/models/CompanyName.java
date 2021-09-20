package case_study_extend.models;

public class CompanyName {
    private String companyCode;
    private String companyName;
    private String companyCountry;

    public CompanyName(String companyCode, String companyName, String companyCountry) {
        this.companyCode = companyCode;
        this.companyName = companyName;
        this.companyCountry = companyCountry;
    }

    public CompanyName() {
    }

    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyCountry() {
        return companyCountry;
    }

    public void setCompanyCountry(String companyCountry) {
        this.companyCountry = companyCountry;
    }

    @Override
    public String toString() {
        return "CompanyName{" +
                "companyCode='" + companyCode + '\'' +
                ", companyName='" + companyName + '\'' +
                ", companyCountry='" + companyCountry + '\'' +
                '}';
    }
    public String getCompanyNameString() {
        return getCompanyCode() + "," + getCompanyName() + "," + getCompanyCountry();
    }
}
