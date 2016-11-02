package core;

import Types.Second;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vinaykumar on 31/10/16.
 */
public class SecondYear extends Student {

    Second second;
    int marks , marksindi;
    Map smap;
    public SecondYear(Second second){
        this.second = second;
        init();
    }

    public void init(){
        smap = new HashMap();
        smap.put(Second.Subject6,50);
        smap.put(Second.Subject7,50);
        smap.put(Second.Subject8,60);
    }
    public int calculateMarks(){
        if(smap.containsKey(second))
        {
            marksindi = (Integer) smap.get(second);
        }
        return marksindi;
    }
}
