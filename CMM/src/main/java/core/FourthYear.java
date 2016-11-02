package core;

import Types.Fourth;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vinaykumar on 31/10/16.
 */
public class FourthYear extends Student {


    Fourth fourth;
    int  marksindi;
    Map fomap;
    public FourthYear(Fourth fourth){
        this.fourth = fourth;
        init();
    }

    public void init(){
        fomap = new HashMap();
        fomap.put(Fourth.Subject16,50);
        fomap.put(Fourth.Subject17,50);
        fomap.put(Fourth.Subject18,50);
    }

    public int calculateMarks(){
        if(fomap.containsKey(fomap))
        {
            marksindi = (Integer) fomap.get(fourth);
        }
        return marksindi;
    }
}
