package karate;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonRunner {
    
    @Test
    void testFeature() {
        Results results = Runner.path("classpath:karate/json.feature").parallel(1);
        assertEquals(0, results.getFailCount(), results.getErrorMessages());
    }      
    
}
