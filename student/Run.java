package student;

class Run{
public static void main(String[] args) {


        Student st = new Student();
        Student[] stud = new Student[10];
        Student stud1 = new Student(1,"Ермолаев", "Валерий", "Алексеевич","18,12,2000", "Измаил", "380956782456", "Международная Экономика", 3, "32");
        Student stud2 = new Student(2,"Лобанов", "Андрей", "Дмитриевич","29,04,1999", "Тарутино", "30687095678", "Логистика", 5, "53");
        Student stud3 = new Student(3,"Товстыга", "Елена", "Алексеевна","7,02,2000", "Одесса", "3055678902904", "Международная Экономика", 1, "18");
        Student stud4 = new Student(4,"Сенько", "Иван", "Васильевич","21,06,2001", "Одесса", "30987080522", "Программирование", 3, "31");
        Student stud5 = new Student(5,"Скалозуб", "Ольга", "Сергеевна","16,10,2000", "Котовск", "30874463288", "Международная Экономика", 1, "18");
        Student stud6 = new Student(6,"Безбородько", "Алиса", "Ахметовна","01,04,2000", "Белгород-Днестровский", "30874768305", "Международная Экономика", 1, "18");
        Student stud7 = new Student(7,"Стойков", "Максим", "Дмитриевич","16,10,2001", "Котовск", "308744632345", "Логистика", 5, "53");
        Student stud8 = new Student(8,"Боженко", "Николай", "Альбертович","21,03,1999", "Белгород-Днестровский", "309355423544", "Программирование", 4, "41");
        Student stud9 = new Student(9,"Качур", "Светалана", "Павловна","13,12,2001", "Котовск", "305082473242", "Международная Экономика", 3, "33");
        Student stud10 = new Student(10,"Тянитолкай", "Иванна", "Андреевна","07,10,2000", "Овидиополь", "30985463228", "Программирование", 2, "28");



        stud[0] = stud1;
        stud[1] = stud2;
        stud[2] = stud3;
        stud[3] = stud4;
        stud[4] = stud5;
        stud[5] = stud6;
        stud[6] = stud7;
        stud[7] = stud8;
        stud[8] = stud9;
        stud[9] = stud10;

        for(Student s : stud){
        s.show();
        }
        System.out.println("Международная Экономика:");
        for(Student s : stud){
        s.Faculty();
        }
        System.out.println("Список факультетов и курсов: ");
        System.out.println("Международная Экономика");
        System.out.println("1 курс:");
        for(Student s : stud){
        s.listFaculty("Экономика", 1);
        }

        System.out.println("Студенты с 2000г рождения:");
        for(Student s : stud){
        s.Age(2000);
        }
        System.out.println("Студенты c 18 группы:");
        for(Student s : stud){
                s.Group("18");
        }
    }
}