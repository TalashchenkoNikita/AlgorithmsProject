package homework;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AlgorithmsTest {

    @Test
    void shouldSortArrayByBubbleSort() {
        int[] array = {5,3,6,8,2};

        int[] sortArray = Algorithms.bubbleSort(array);

        assertThat(sortArray).isSorted();
    }

    @Test
    void shouldFindIndexByBinarySearch() {
        int[] array = {2,3,5,7,11,13,17,19};

        int index = Algorithms.binarySearch(array,17);

        assertThat(index).isEqualTo(6);
    }
}