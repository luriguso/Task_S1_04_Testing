package level2.exercise5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class MapContainTest {
    @Test
    void shouldContainObject(){
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

        Assertions.assertThat(map).withFailMessage("The KEY not exist").containsKey("key2");
    }
}
