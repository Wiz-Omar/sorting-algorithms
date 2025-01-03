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
  public void testEqualValuesAreNotSwitched(){
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
    final Integer[] originalArray = {1, 1, 1, 1, 1};

    Integer[] arrayToBeSorted = originalArray.clone();
    BubbleSort.bubbleSort(arrayToBeSorted);
    assertArrayEquals(originalArray, arrayToBeSorted, "Error in repeated element sorting in bubblesort");

    arrayToBeSorted = originalArray.clone();
    Heapsort.heapSort(arrayToBeSorted);
    assertArrayEquals(originalArray, arrayToBeSorted, "Error in repeated element sorting in heapSort");

    arrayToBeSorted = originalArray.clone();
    InsertionSort.insertionSort(arrayToBeSorted);
    assertArrayEquals(originalArray, arrayToBeSorted, "Error in repeated element sorting in insertionSort");

    arrayToBeSorted = originalArray.clone();
    MergeSort.mergeSort(arrayToBeSorted);
    assertArrayEquals(originalArray, arrayToBeSorted, "Error in repeated element sorting in mergeSort");

    arrayToBeSorted = originalArray.clone();
    SelectionSort.selectionSort(arrayToBeSorted);
    assertArrayEquals(originalArray, arrayToBeSorted, "Error in repeated element sorting in selectionSort");

    arrayToBeSorted = originalArray.clone();
    Quicksort.quickSort(arrayToBeSorted);
    assertArrayEquals(originalArray, arrayToBeSorted, "Error in repeated element sorting in quickSort");
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
  public void testBubbleSort() {
    final Integer[] data = {4, 3, 0, 11, 7, 5, 15, 12, 99, 1};
    BubbleSort.bubbleSort(data);
    assertEquals("[0, 1, 3, 4, 5, 7, 11, 12, 15, 99]", Arrays.toString(data));
  }

}
