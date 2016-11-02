package core;

import Types.First;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vinaykumar on 31/10/16.
 */
public class FirstYear extends Student {

    public First first;
    public int marksindi , marks;
    public Map fmap;
    public FirstYear(First first,int marks){
        this.first = first;
        this.marks = marks;
        init();
    }

    public void init(){
        fmap = new HashMap();
        fmap.put(First.Subject1,60);
        fmap.put(First.Subject2,60);
        fmap.put(First.Subject3,60);
        fmap.put(First.Subject4,60);
        fmap.put(First.Subject5,60);
    }
    public int calculateMarks(){
        if(fmap.containsKey(first))
        {
            marksindi = (Integer) fmap.get(first);
            marksindi = marksindi-30;
            if(marks < marksindi){
                marks = 0 ;

            }
        }
        return marks;
    }


}
