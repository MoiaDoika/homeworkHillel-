package student;
/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        students[] stu = new students[4];
        stu[0] = new students(1, "Senko", "Ivan", "Grigorievich", new String("1999, 10, 18"), "Slipova", 956585766, "international economy", 3, "ST22");
        stu[1] = new students(2, "Bojenko", "Mihail", "Viktorovich", new String("1991, 5, 6"), "HeroevPrikordonikov", 986588566, "logistics", 4, "SA13");
        stu[2] = new students(3, "Okun", "Alexei", "Pavlovich", new String("2000, 6, 19"), "Vatutina", 956346566, "international economy", 2, "ST22");
        stu[3] = new students(4, "Letniy", "Pavel", "Olegovich", new String("1999, 10, 18"), "Serova", 956768566, "Mexanika", 3, "SK12");

        String p=new String("1999, 10, 18");

//вывод на екран
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            stu[i].fakultet();
        }
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            stu[i].fakkurs();
        }
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            stu[i].date_roj(p);
        }
        System.out.println();
        for (int i = 0; i <= 3; i++) {
            stu[i].groupp();
        }
    }
}
