import student.*;

import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        Student student1 = new Student("Igor", "0050831811000", "Santos");
        Student student2 = new Student("Paula", "0050831811001", "Santos");
        Student student3 = new Student("Henrique", "0050831811002", "Santos");

        StudentDAO studentDao = new StudentDAO();
        studentDao.createTable();

        studentDao.create(student1);
        studentDao.create(student2);
        studentDao.create(student3);

        studentDao.getAll();
    }
}
