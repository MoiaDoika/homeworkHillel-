package Subscriber;

 public class Subscriber implements SubscriberService{

    public String identifier;
    public String surname;
    public String name;
    public String patronymic;
    public String city;
    public String numbPhone;
    public String numbTreaty;
    public String balance;
    public String timeCityMin;
    public String timeInterCityMin;
    public String traffic;

    public Subscriber() {

    }

    public Subscriber(String identifier, String surname, String name, String patronymic, String city, String numbPhone, String numbTreaty, String balance, String timeCityMin, String timeInterCityMin, String traffic){
        this.identifier = identifier;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.city = city;
        this.numbPhone = numbPhone;
        this.numbTreaty = numbTreaty;
        this.balance = balance;
        this.timeCityMin = timeCityMin;
        this.timeInterCityMin = timeInterCityMin;
        this.traffic = traffic;
    }

    public String getIdentifier() {return identifier;}

    public void setIdentifier(String identifier) {this.identifier = identifier;}

    public String getSurname() {return surname;}

    public void setSurname(String surname) {this.surname = surname;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String getPatronymic() {return patronymic;}

    public void setPatronymic(String patronymic) {this.patronymic = patronymic;}

    public String getCity() {return city;}

    public void setCity(String city) {this.city = city;}

    public String getNumbPhone() {return numbPhone;}

    public void setNumbPhone(String numbPhone) {this.numbPhone = numbPhone;}

    public String getNumbTreaty() {return numbTreaty;}

    public void setNumbTreaty(String numbTreaty) {this.numbTreaty = numbTreaty;}

    public String getBalance() {return balance;}

    public void setBalance(String balance) {this.balance = balance;}

    public String getTimeCityMin() {return timeCityMin;}

    public void setTimeCityMin(String timeCityMin) {this.timeCityMin = timeCityMin;}

    public String getTimeInterCityMin() {return timeInterCityMin;}

    public void setTimeInterCityMin(String timeInterCityMin) {this.timeInterCityMin = timeInterCityMin;}

    public String getTraffic() {return traffic;}

    public void setTraffic(String traffic) {this.traffic = traffic;}
}
