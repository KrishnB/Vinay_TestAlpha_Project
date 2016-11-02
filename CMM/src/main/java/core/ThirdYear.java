package core;

import Types.Third;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vinaykumar on 31/10/16.
 */
class ThirdYear extends Student {

    Third third;
    Integer marks , marksindi;
    Map tmap;
    public ThirdYear(Third third){
        this.third = third;
        //this.marks = marks;
        init();
    }

    public void init(){
        tmap = new HashMap();
        tmap.put(Third.Subject11,50);
        tmap.put(Third.Subject12,50);
        tmap.put(Third.Subject13,50);
        tmap.put(Third.Subject14,50);
        tmap.put(Third.Subject15,50);

    }
    public int calculateMarks(){
        if(tmap.containsKey(third))
        {
            marksindi = (Integer) tmap.get(third);
        }
        return marksindi;
    }
}
