import java.util.Map;
import java.util.TreeMap;

public class Subject {
    private TreeMap<String, String> subject = new TreeMap<>();

    public TreeMap<String, String> getSubject() {
        subject.put("Physics", "Shailesh");
        subject.put("Chemistry", "Mihir");
        subject.put("Maths", "Parth");
        subject.put("Account", "Nimit");
        subject.put("Economics", "Hinal");
        return subject;
    }

    public void forloop() {
        for (Map.Entry<String, String> entry : subject.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }

    public void forloopKey() {
        for (String subjectData : subject.keySet()) {
            System.out.println("Keys:" + subjectData);
        }
    }

    public void forloopValue() {
        for (String name : subject.values()) {
            System.out.println("Value:" + name);
        }
    }
}
