package com.example.menga.sorting;

/**
 * @author Cyril
 *
 */
class codeDay {
public static void insertionSort (int [] array)
{
	int scan;
	int unsortedValue;
for (int index = 1; index < array.length; index++)
{
	unsortedValue = array[index];
	scan = index;
while (scan >  0 && array[scan-1] > unsortedValue)
{
	array[scan] = array[scan-1];
	scan --;
}
array[scan] = unsortedValue;
}
}
}