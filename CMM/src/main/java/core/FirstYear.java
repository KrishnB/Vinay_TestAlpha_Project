package core;

import Types.First;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vinaykumar on 31/10/16.
 */
public class FirstYear extends Student {

    public First first;
    public int marksindi;
    public Map fmap;
    public FirstYear(First first){
        this.first = first;
        init();
    }

    public void init(){
        fmap = new HashMap();
        fmap.put(First.Subject1,60);
        fmap.put(First.Subject2,40);
        fmap.put(First.Subject3,60);
    }
    public int calculateMarks(){
        if(fmap.containsKey(first))
        {
            marksindi = (Integer) fmap.get(first);
        }
        return marksindi;
    }


}
