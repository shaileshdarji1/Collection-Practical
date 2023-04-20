import java.util.ArrayList;
import java.util.Iterator;

public class Student {
    private ArrayList<String> name = new ArrayList<>();

    public ArrayList<String> display() {
        name.add("Shailesh");
        name.add("Mihir");
        name.add("Parth");
        name.add("Arpit");
        name.add("Nimit");
        return name;
    }

    public void iterator(){
        Iterator<String> studentitr = name.iterator();
        while(studentitr.hasNext()){
            System.out.println(studentitr.next());
        }
    }

    public void forloop(){
        for(int i=0;i<name.size();i++){
            System.out.print(name.get(i)+" ");
        }
    }

    public void eachloop(){
        for(String name:name){
            System.out.println(name);
        }
    }
}
