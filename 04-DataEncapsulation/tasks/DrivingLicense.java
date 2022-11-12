public class DrivingLicense {
    private String name;
    private String surname;
    private String adress;
    private String postalCode;
    private String city;
    private String drivingLicenceNum;
    private int year;
    private String category;

    // public void displayData(){
    //     System.out.println("Name: " + getName() + "\nSurname: " + getSurname() +
    //     "\nAdress: " + getAdress() + "\nPostal code: " + getPostalCode() + "\nCity: " + getCity()
    //     + "\nDriving license number: " + getNum() + "\nYear: " + getYear() + "\nCategory: " + getCategory());
    // }

    public String toString(){
        return "Name: " + getName() + "\nSurname: " + getSurname() +
        "\nAdress: " + getAdress() + "\nPostal code: " + getPostalCode() + "\nCity: " + getCity()
        + "\nDriving license number: " + getNum() + "\nYear: " + getYear() + "\nCategory: " + getCategory();  
    }

    public void setName(String name){
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname.substring(0,1).toUpperCase() + surname.substring(1);;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }

    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    public void setCity(String city){
        this.city = city;
    }

    public void setNum(String drivingLicenceNum){
        this.drivingLicenceNum = drivingLicenceNum;
    }

    public void setYear(int year){
        if(year >= 1980){
            this.year = year;
        }
        
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public String getAdress(){
        return adress;
    }

    public String getPostalCode(){
        return postalCode;
    }

    public String getCity(){
        return city;
    }

    public String getNum(){
        return drivingLicenceNum;
    }

    public int getYear(){
        return year;
    }

    public String getCategory(){
        return category;
    }

}
