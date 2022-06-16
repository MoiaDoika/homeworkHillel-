package HomeWork6;

public class Subscriber {
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String city;
    private String numberPhone;
    private String numberContract;
    private int balance;
    private int timeCityMin;
    private int timeInterCityMin;
    private String traffic;

    public Subscriber(int id, String surname, String name, String patronymic, String city, String numberPhone, String numberContract,
                      int balance, int timeCityMin, int timeInterCityMin, String traffic){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.city = city;
        this.numberPhone = numberPhone;
        this.numberContract = numberContract;
        this.balance = balance;
        this.timeCityMin = timeCityMin;
        this.timeInterCityMin = timeInterCityMin;
        this.traffic = traffic;

        //get
    public int getId() { return id; }
        public void setId(int id){ this.id = id; }

    public String getSurname() { return surname; }

    public void setSurname(String surname) { this.surname = surname; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getPatronymic() { return patronymic; }

    public void setPatronymic(String patronymic) { this.patronymic = patronymic; }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }

    public String getNumberPhone() { return numberPhone; }

    public void setNumberPhone(String numberPhone) { this.numberPhone = numberPhone; }

    public String getNumberContract() { return numberContract; }

    public void setNumberContract(String numberContract) { this.numberContract = numberContract; }

    public int getBalance() { return balance; }

    public void setBalance(int balance) { this.balance = balance; }

    public int getTimeCityMin() { return timeCityMin; }

    public void setTimeCityMin(int timeCityMin) { this.timeCityMin = timeCityMin; }

    public int getTimeInterCityMin() { return timeInterCityMin; }

    public void setTimeInterCityMin(int timeInterCityMin) { this.timeInterCityMin = timeInterCityMin; }

    public String getTraffic() { return traffic; }

    public void setTraffic(String traffic) { this.traffic = traffic; }

    }
}
