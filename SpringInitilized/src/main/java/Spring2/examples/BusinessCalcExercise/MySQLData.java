package Spring2.examples.BusinessCalcExercise;

import org.springframework.stereotype.Component;

@Component
public class MySQLData implements DataServiceInt{
    @Override
    public int[] retrieveData(){
        return new int[]{1, 2, 3, 4, 5};
    }
}
