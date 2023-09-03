package pojo;

public class OldMan {
   private String  id;
   private String  name;
   private String  gender;
   private String  age;
   private String  idNumber;
   private String  socialNumber;
   private String  nation;
   private String  education;
   private String  address;
   private String  healthy;
   private String  other;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getSocialNumber() {
        return socialNumber;
    }

    public void setSocialNumber(String socialNumber) {
        this.socialNumber = socialNumber;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHealthy() {
        return healthy;
    }

    public void setHealthy(String healthy) {
        this.healthy = healthy;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public String toString() {
        return "OldMan{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", socialNumber='" + socialNumber + '\'' +
                ", nation='" + nation + '\'' +
                ", education='" + education + '\'' +
                ", address='" + address + '\'' +
                ", healthy='" + healthy + '\'' +
                ", other='" + other + '\'' +
                '}';
    }
}
