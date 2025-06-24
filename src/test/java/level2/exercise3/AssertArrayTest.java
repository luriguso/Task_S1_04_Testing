package level2.exercise3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class AssertArrayTest {
    @Test
    void isEqualTo_returnsTrue_whenIntegerArraysHaveSameContent(){
        int[] list1 = {1,2,3};
        int[] list2 = {1,2,3};
        Assertions.assertThat(list1).withFailMessage("los arreglos son diferente").isEqualTo(list2);
    }

    @Test
    void isNotEqualTo_returnsTrue_whenIntegerArraysHaveDifferentContent(){
        int[] list1 = {1,2,3};
        int[] list2 = {1,2,3,4};
        Assertions.assertThat(list1).withFailMessage("los arreglos son iguales").isNotEqualTo(list2);
    }
}
