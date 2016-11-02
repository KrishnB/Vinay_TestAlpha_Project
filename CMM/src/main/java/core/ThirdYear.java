package core;

import Types.Third;

import java.util.HashMap;
import java.util.Map;


public class ThirdYear extends Student {

    Third third;
    int marksindi;
    Map tmap;

    public ThirdYear(Third third){
        this.third = third;
        init();
    }

    public void init(){
        tmap = new HashMap();
        tmap.put(Third.Subject11,50);
        tmap.put(Third.Subject12,60);
        tmap.put(Third.Subject13,50);
    }
    public int calculateMarks(){
        if(tmap.containsKey(third))
        {
            marksindi = (Integer) tmap.get(third);
        }
        return marksindi;
    }
}
