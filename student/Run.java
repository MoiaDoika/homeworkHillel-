package student;

class Run{
public static void main(String[] args) {


        Student st = new Student();
        Student[] stud = new Student[5];
        Student stud1 = new Student(1,"Ермолаев", "Валерий", "Алексеевич","18,12,2000", "Измаил", "380956782456", "Международная Экономика", 3, "32");
        Student stud2 = new Student(2,"Лобанов", "Андрей", "Дмитриевич","29,04,1999", "Тарутино", "30687095678", "Логистика", 5, "53");
        Student stud3 = new Student(3,"Товстыга", "Елена", "Алексеевна","7,02,2000", "Одесса", "3055678902904", "Международная Экономика", 1, "11");
        Student stud4 = new Student(4,"Сенько", "Иван", "Васильевич","21,06,2001", "Одесса", "30987080522", "Программирование", 3, "31");
        Student stud5 = new Student(5,"Скалозуб", "Ольга", "Сергеевна","16,10,2000", "Котовск", "30874463288", "Международная Экономика", 1, "1B");

        stud[0] = stud1;
        stud[1] = stud2;
        stud[2] = stud3;
        stud[3] = stud4;
        stud[4] = stud5;

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
        s.age(2000);
        }
    }
}