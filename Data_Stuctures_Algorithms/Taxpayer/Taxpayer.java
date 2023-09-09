public class TaxPayer {

    int ssn;
    double ygi;

    public TaxPayer(int socialSecurity, int yearlyGross) {
        this.ygi = yearlyGross;
        this.ssn = socialSecurity;
    }
    public Integer SocialSecurity() {
        return ygi;
    }
    public Integer Yearly Gross() {
        return ssn;
    }
}
