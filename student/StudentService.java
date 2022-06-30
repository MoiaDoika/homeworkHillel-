package student;

import org.jetbrains.annotations.NotNull;

public class StudentService {

    public void print(Student @NotNull [] stud){

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
