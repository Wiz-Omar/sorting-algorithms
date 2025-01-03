package murraco;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class SortingAlgorithmsTest {

  @Test //Mutation test 1
  public void testHeapSortAlreadySortedArray() {
    final Integer[] data ={1, 2, 3, 4, 5};
    Heapsort.heapSort(data);
    assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(data));
  }

  @Test //Mutation test 2
  public void testBubbleSortEqualValuesAreNotSwitched(){
    class Pair<K extends Comparable<K>, V> implements Comparable<Pair<K, V>> {
      final K key;
      final V value; //The value is only used to differentiate the order of similar “keys”
      public Pair(K key, V value) {this.key = key; this.value = value;}
      @Override
      public int compareTo(Pair<K, V> second) {return this.key.compareTo(second.key);}
      @Override
      public String toString() {return "(" + key + ", " + value + ")";}
    }
    //we are comparing the “key” element of the pair
    Pair<Integer, String>[] data = new Pair[] {
            new Pair<>(2, "a"),
            new Pair<>(2, "b")
    };
    BubbleSort.bubbleSort(data);
    assertEquals("[(2, a), (2, b)]", Arrays.toString(data));
  }

  @Test //Mutation test 3
  public void testQuickSortPivotIndexIncludesIntervalEnd() {
    int result = 1;
    for (int i = 0; i <= 50; i++) {
      int index = Quicksort.pickPivotIndex(0, 1);
      result -= index;
    }
    if (result == 1){ //mathematically impossible to get a false positive (meaning 50 zeros in a row in a 50% chance)
      fail("The pivot index choice should be inclusive of the end of the interval given");
    }
  }

  @Test //Partition 4
  public void repeatedElementsArrayShouldBeIdenticalAfterSorting() {
    final Integer[] data1 = {1, 1, 1, 1, 1};
    final Integer[] data2 = {1, 1, 1, 1, 1};
    final Integer[] data3 = {1, 1, 1, 1, 1};
    final Integer[] data4 = {1, 1, 1, 1, 1};
    final Integer[] data5 = {1, 1, 1, 1, 1};
    final Integer[] data6 = {1, 1, 1, 1, 1};

    BubbleSort.bubbleSort(data1);
    Heapsort.heapSort(data2);
    InsertionSort.insertionSort(data3);
    MergeSort.mergeSort(data4);
    Quicksort.quickSort(data5);
    SelectionSort.selectionSort(data6);

    assertEquals("[1, 1, 1, 1, 1]", Arrays.toString(data1));
    assertEquals("[1, 1, 1, 1, 1]", Arrays.toString(data2));
    assertEquals("[1, 1, 1, 1, 1]", Arrays.toString(data3));
    assertEquals("[1, 1, 1, 1, 1]", Arrays.toString(data4));
    assertEquals("[1, 1, 1, 1, 1]", Arrays.toString(data5));
    assertEquals("[1, 1, 1, 1, 1]", Arrays.toString(data6));
  }
  @Test //Partition 5
  public void testEmptyArray() {
    final Integer[] data1 = {};
    final Integer[] data2 = {};
    final Integer[] data3 = {};
    final Integer[] data4 = {};
    final Integer[] data5 = {};
    final Integer[] data6 = {};

    BubbleSort.bubbleSort(data1);
    Heapsort.heapSort(data2);
    InsertionSort.insertionSort(data3);
    MergeSort.mergeSort(data4);
    Quicksort.quickSort(data5);
    SelectionSort.selectionSort(data6);

    assertEquals("[]", Arrays.toString(data1));
    assertEquals("[]", Arrays.toString(data2));
    assertEquals("[]", Arrays.toString(data3));
    assertEquals("[]", Arrays.toString(data4));
    assertEquals("[]", Arrays.toString(data5));
    assertEquals("[]", Arrays.toString(data6));

  }
  @Test //Partition 6
  public void testSingleElementArray() {
    final Integer[] data1 = {5};
    final Integer[] data2 = {5};
    final Integer[] data3 = {5};
    final Integer[] data4 = {5};
    final Integer[] data5 = {5};
    final Integer[] data6 = {5};

    BubbleSort.bubbleSort(data1);
    Heapsort.heapSort(data2);
    InsertionSort.insertionSort(data3);
    MergeSort.mergeSort(data4);
    Quicksort.quickSort(data5);
    SelectionSort.selectionSort(data6);

    assertEquals("[5]", Arrays.toString(data1));
    assertEquals("[5]", Arrays.toString(data2));
    assertEquals("[5]", Arrays.toString(data3));
    assertEquals("[5]", Arrays.toString(data4));
    assertEquals("[5]", Arrays.toString(data5));
    assertEquals("[5]", Arrays.toString(data6));

  }
  @Test //Partition 7
  public void testAlreadySortedArray() {
    final Integer[] data1 = {1, 2, 3, 4, 5};
    final Integer[] data2 = {1, 2, 3, 4, 5};
    final Integer[] data3 = {1, 2, 3, 4, 5};
    final Integer[] data4 = {1, 2, 3, 4, 5};
    final Integer[] data5 = {1, 2, 3, 4, 5};
    final Integer[] data6 = {1, 2, 3, 4, 5};

    BubbleSort.bubbleSort(data1);
    Heapsort.heapSort(data2);
    InsertionSort.insertionSort(data3);
    MergeSort.mergeSort(data4);
    Quicksort.quickSort(data5);
    SelectionSort.selectionSort(data6);

    assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(data1));
    assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(data2));
    assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(data3));
    assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(data4));
    assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(data5));
    assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(data6));
  }
  @Test //Partition 8
  public void testUnsortedMultipleElementArray() {
    final Integer[] data1 = {5, 3, 8, 6, 2, 7, 4, 1};
    final Integer[] data2 = {5, 3, 8, 6, 2, 7, 4, 1};
    final Integer[] data3 = {5, 3, 8, 6, 2, 7, 4, 1};
    final Integer[] data4 = {5, 3, 8, 6, 2, 7, 4, 1};
    final Integer[] data5 = {5, 3, 8, 6, 2, 7, 4, 1};
    final Integer[] data6 = {5, 3, 8, 6, 2, 7, 4, 1};

    BubbleSort.bubbleSort(data1);
    Heapsort.heapSort(data2);
    InsertionSort.insertionSort(data3);
    MergeSort.mergeSort(data4);
    Quicksort.quickSort(data5);
    SelectionSort.selectionSort(data6);

    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data1));
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data2));
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data3));
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data4));
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data5));
    assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", Arrays.toString(data6));
  }
  @Test //Partition 9
  public void test_array_with_duplicate_elements() {
    final Integer[] data1 = {2, 3, 0, 2, 4, 5, 15, 12, 99, 2};
    final Integer[] data2 = {2, 3, 0, 2, 4, 5, 15, 12, 99, 2};
    final Integer[] data3 = {2, 3, 0, 2, 4, 5, 15, 12, 99, 2};
    final Integer[] data4 = {2, 3, 0, 2, 4, 5, 15, 12, 99, 2};
    final Integer[] data5 = {2, 3, 0, 2, 4, 5, 15, 12, 99, 2};
    final Integer[] data6 = {2, 3, 0, 2, 4, 5, 15, 12, 99, 2};

    BubbleSort.bubbleSort(data1);
    InsertionSort.insertionSort(data2);
    SelectionSort.selectionSort(data3);
    MergeSort.mergeSort(data4);
    Heapsort.heapSort(data5);
    Quicksort.quickSort(data6);

    assertEquals("[0, 2, 2, 2, 3, 4, 5, 12, 15, 99]", Arrays.toString(data1));
    assertEquals("[0, 2, 2, 2, 3, 4, 5, 12, 15, 99]", Arrays.toString(data2));
    assertEquals("[0, 2, 2, 2, 3, 4, 5, 12, 15, 99]", Arrays.toString(data3));
    assertEquals("[0, 2, 2, 2, 3, 4, 5, 12, 15, 99]", Arrays.toString(data4));
    assertEquals("[0, 2, 2, 2, 3, 4, 5, 12, 15, 99]", Arrays.toString(data5));
    assertEquals("[0, 2, 2, 2, 3, 4, 5, 12, 15, 99]", Arrays.toString(data6));
  }


  @Test //Partition 10
  public void test_array_with_negative_elements() {
    final Integer[] data1 = {4, -3, 0, 11, -7, 5, 15, 12, -99, 1};
    final Integer[] data2 = {4, -3, 0, 11, -7, 5, 15, 12, -99, 1};
    final Integer[] data3 = {4, -3, 0, 11, -7, 5, 15, 12, -99, 1};
    final Integer[] data4 = {4, -3, 0, 11, -7, 5, 15, 12, -99, 1};
    final Integer[] data5 = {4, -3, 0, 11, -7, 5, 15, 12, -99, 1};
    final Integer[] data6 = {4, -3, 0, 11, -7, 5, 15, 12, -99, 1};

    BubbleSort.bubbleSort(data1);
    InsertionSort.insertionSort(data2);
    SelectionSort.selectionSort(data3);
    MergeSort.mergeSort(data4);
    Heapsort.heapSort(data5);
    Quicksort.quickSort(data6);

    assertEquals("[-99, -7, -3, 0, 1, 4, 5, 11, 12, 15]", Arrays.toString(data1));
    assertEquals("[-99, -7, -3, 0, 1, 4, 5, 11, 12, 15]", Arrays.toString(data2));
    assertEquals("[-99, -7, -3, 0, 1, 4, 5, 11, 12, 15]", Arrays.toString(data3));
    assertEquals("[-99, -7, -3, 0, 1, 4, 5, 11, 12, 15]", Arrays.toString(data4));
    assertEquals("[-99, -7, -3, 0, 1, 4, 5, 11, 12, 15]", Arrays.toString(data5));
    assertEquals("[-99, -7, -3, 0, 1, 4, 5, 11, 12, 15]", Arrays.toString(data6));
  }

  @Test
  public void testBubbleSort() {
      final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
      BubbleSort.bubbleSort(data);
      assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }
  @Test
  public void testInsertionSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    InsertionSort.insertionSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testSelectionSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    SelectionSort.selectionSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testMergeSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    MergeSort.mergeSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testHeapsort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Heapsort.heapSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

  @Test
  public void testQuicksort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    Quicksort.quickSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

}
