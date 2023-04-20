import java.util.Iterator;
import java.util.TreeSet;

public class Teacher {
    private TreeSet<String> teacherName = new TreeSet<>();

    public TreeSet<String> getTeacherName() {
        teacherName.add("Dipali Ambaliya");
        teacherName.add("Dharmesh Rathod");
        teacherName.add("Mehul Pandya");
        teacherName.add("Abhishek Sharma");
        return teacherName;
    }

    public void forloop() {
        for (String teacherName : teacherName) {
            System.out.println(teacherName);
        }
    }

    public void iterator() {
        Iterator<String> teacheritr = teacherName.iterator();
        while (teacheritr.hasNext()) {
            System.out.println(teacheritr.next());
        }
    }

}
