package murraco;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import murraco.BubbleSort;
import murraco.Heapsort;
import murraco.InsertionSort;
import murraco.MergeSort;
import murraco.Quicksort;
import murraco.SelectionSort;

public class SortingAlgorithmsTest {

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


  @Test
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


  @Test
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
}
