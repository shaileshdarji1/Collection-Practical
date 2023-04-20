import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Course {
    private HashSet<Integer> courseId = new HashSet<>();

    public HashSet<Integer> getCourseId() {
        courseId.add(101);
        courseId.add(102);
        courseId.add(103);
        courseId.add(101);

        return courseId;
    }

    public void eachloop(){
        for (Integer courseId :courseId) {
            System.out.println(courseId);
        }
    }
    public void iterator(){
        Iterator<Integer> courseitr = courseId.iterator();
        while (courseitr.hasNext()) {
            System.out.println(courseitr.next());
        }
    }

    public void toArrayList(){
//        ArrayList<Integer> courseInt = new ArrayList<>(courseId);
        ArrayList<Integer> courseInt = new ArrayList<>();
        courseId.forEach((n)->courseInt.add(n));
        System.out.println(courseInt);
    }
}
