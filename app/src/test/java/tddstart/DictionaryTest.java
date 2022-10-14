package tddstart;

import org.junit.Test;

 import static org.hamcrest.MatcherAssert.assertThat;
 import static org.hamcrest.Matchers.*;

public class DictionaryTest {
    @Test
    public void testDictionaryName() {
        Dictionary dict = new Dictionary("Example");
        Dictionary dict1 = new Dictionary("");
       // Dictionary dict2 = new Dictionary();

        assertThat(dict.getName(), equalTo("Example"));
        assertThat(dict.isEmpty(), equalTo(false));
        assertThat(dict1.isEmpty(),equalTo(true));
       // assertThat(dict2.isEmpty(), equalTo(true));
    }
}
