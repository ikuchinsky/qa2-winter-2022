import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    @Test
    public void createAndWorkWithLists() {
        Student valera = new Student();
        valera.setFirstName("Valera");
        valera.setLastName("Tester");
        valera.setEmail("valerunchiks7@test.lv");
        valera.setPhone("+37121212223");

        Student liga = new Student("Liga", "Ivanova", "liga@test.lv", "+37121212121");
        Student ilja = new Student("Ilja", "Kucinskis", "ilja@test.lv","+37126700818");
        Student ranel = new Student("Ranels", "Kucisnkis", "null", "null");

        List<Student> students = new ArrayList<>();
        students.add(valera);
        students.add(liga);
        students.add(ilja);
        students.add(ranel);

        //-------------------FOR-------------------
        for (int i = 0; i < students.size(); i++) { // i = i + 1 ->> i++
            System.out.println(students.get(i).getFirstName());
        }
    //------------FOREACH-----------

        for (Student s : students) {
        //    System.out.println(s.getFirstName() + " " + s.getLastName());
            System.out.println(s.getFirstName());
        }

        //-----FOREACH with IF------
        System.out.println("Printing students with phone nr starting with +371");
        for (Student s : students) {
            if (s.getPhone().startsWith("+371")) {
                System.out.println(s.getFullName());

            }
        }
    }

}
