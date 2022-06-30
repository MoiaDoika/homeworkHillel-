package HomeworkSubscriber;

class Subscriber {
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
    private int traffic;

    public Subscriber(int id, String surname, String name, String patronymic, String city, String numberPhone, String numberContract,
                      int balance, int timeCityMin, int timeInterCityMin, int traffic) {

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

    }


    public int getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getCity() {
        return city;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public String getNumberContract() {
        return numberContract;
    }

    public int getBalance() {
        return balance;
    }

    public int getTimeCityMin() {
        return timeCityMin;
    }

    public int getTimeInterCityMin() {
        return timeInterCityMin;
    }

    public int getTraffic() {
        return traffic;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setNumberContract(String numberContract) {
        this.numberContract = numberContract;
    }

    public void setTimeCityMin(int timeCityMin) {
        this.timeCityMin = timeCityMin;
    }

    public void setTimeInterCityMin(int timeInterCityMin) {
        this.timeInterCityMin = timeInterCityMin;
    }

    public void setTraffic(int traffic) {
        this.traffic = traffic;
    }

    public void show() {

    }
    @Override
    public String toString() {
        return  "ID абонента " + getId() + ". Фамилия абонента " + getSurname() + ". Имя абонента " + getName() + ". Отчество абонента " + getPatronymic() + ". Город абонета " + getCity() + ". Номер телефона " + getNumberPhone() + ". Договор " + getNumberContract() + ". Баланс " + getBalance()
                + ". Количество городских минут " + getTimeCityMin() + ". Количество межгородских минут " + getTimeInterCityMin() + ". Количество интернет трафика " + getTraffic();
    }
}
