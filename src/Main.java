import java.util.*;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        ArrayList<String> studentName = student.display();
        student.forloop();
        student.eachloop();
        student.iterator();
        studentName.forEach(((n) -> System.out.println(n)));

        Course course = new Course();
        HashSet<Integer> hashSet = course.getCourseId();
        course.eachloop();
        course.iterator();
        hashSet.forEach(((n) -> System.out.println(n)));
        course.toArrayList();

        College college = new College();
        HashMap<String, Integer> hashMap = college.getCollege();
        college.forloop();
        college.forloopKey();
        college.forloopValue();
        hashMap.forEach((k, v) -> System.out.println("Key = " + k +
                ", Value = " + v));

        Teacher teacher = new Teacher();
        TreeSet<String> treeSet = teacher.getTeacherName();
        teacher.forloop();
        teacher.iterator();
        treeSet.forEach(((n) -> System.out.println(n)));

        Subject subject = new Subject();
        TreeMap<String, String> treeMap = subject.getSubject();
        subject.forloop();
        subject.forloopKey();
        subject.forloopValue();
        treeMap.forEach((k, v) -> System.out.println("Key = " + k +
                ", Value = " + v));

    }
}
