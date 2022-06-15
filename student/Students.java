package student;

class Student{
    private int id;
    private String surname;
    private String name;
    private String patronymic;
    private String birthday;
    private String address;
    private String phoneNumber;
    private String faculty;
    private int well;
    private String group;

    public Student(){

    }

    public Student(int id, String surname, String name, String patronymic, String birthday, String address, String phoneNumber,
                   String faculty, int well, String group){
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.faculty = faculty;
        this.well = well;
        this.group = group;
    }

    // get
    public int getId(){
        return id;
    }
    public String getSurname(){
        return surname;
    }
    public String getName(){
        return name;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public String getBirthday(){
        return birthday;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public String getFaculty(){
        return faculty;
    }
    public int getWell(){
        return well;
    }
    public String getGroup(){
        return group;
    }

    //set
    public void setId(int id){
        this.id = id;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPatronymic(String patronymic){
        this.patronymic = patronymic;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setFaculty(String faculty){
        this.faculty = faculty;
    }
    public void setWell(int well){
        this.well = well;
    }
    public void setGroup(String group){
        this.group = group;
    }

    public void show(){
        System.out.println(getId() + " " + getSurname() + " " + getName() + " " + getPatronymic() + " " + getBirthday() + " " + getAddress() + " " + getPhoneNumber() + " " + getFaculty()
                + " " + getWell() + " " + getGroup());
    }

    public void Faculty(){
        if(this.getFaculty().equals("Экономика")){
            System.out.println(getId() + " " + getSurname() + " " + getName() + " " + getPatronymic() + " " + getBirthday() + " " + getAddress() + " " + getPhoneNumber() + " " + getFaculty()
                    + " " + getWell() + " " + getGroup());
        }
    }
    public void listFaculty(String Faculty, int well){

        if(getFaculty().equals(faculty) && getWell() == well){

            System.out.println(getId() + " " + getSurname() + " " + getName() + " " + getPatronymic() + " " + getBirthday() + " " + getAddress() + " " + getPhoneNumber() + " " + getFaculty()
                    + " " + getWell() + " " + getGroup());
        }
    }

    public void age(int years){
        String[] strBirthday = getBirthday().split(",");
        System.out.print(strBirthday[0] + " " + strBirthday[1] + " " + strBirthday[2]);
        int year = (int)Integer.valueOf(strBirthday[2]);
        if(year >= years){
            System.out.println(getId() + " " + getSurname() + " " + getName() + " " + getPatronymic() + " " + getBirthday() + " " + getAddress() + " " + getPhoneNumber() + " " + getFaculty()
                    + " " + getWell() + " " + getGroup());
        }
    }
    public void Group(){
        if(this.getGroup().equals("18")){
            System.out.println(getId() + " " + getSurname() + " " + getName() + " " + getPatronymic() + " " + getBirthday() + " " + getAddress() + " " + getPhoneNumber() + " " + getFaculty()
                    + " " + getWell() + " " + getGroup());
        }
    }

}
