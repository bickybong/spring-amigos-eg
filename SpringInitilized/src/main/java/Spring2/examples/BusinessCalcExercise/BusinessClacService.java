package Spring2.examples.BusinessCalcExercise;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Configuration
public class BusinessClacService {
    private DataServiceInt dataServiceInt;

    public BusinessClacService(DataServiceInt dataServiceInt) {
        this.dataServiceInt = dataServiceInt;
    }

    public int findMax() {
        return Arrays.stream(dataServiceInt.retrieveData())
                .max().orElse(0);
    }
}
