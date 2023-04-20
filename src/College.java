import java.util.HashMap;
import java.util.Map;

public class College {

    private HashMap<String, Integer> college = new HashMap<>();

    public HashMap<String, Integer> getCollege() {
        college.put("LDCE", 01);
        college.put("VGCE", 02);
        college.put("SilverOak", 03);
        college.put("LJ", 04);
        return college;
    }

    public void forloop() {
        for (Map.Entry<String, Integer> entry : college.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }

    public void forloopKey() {
        for (String collegeName : college.keySet()) {
            System.out.println("Keys:" + collegeName);
        }
    }

    public void forloopValue() {
        for (Integer collegeCode : college.values()) {
            System.out.println("Value:" + collegeCode);
        }
    }
}
