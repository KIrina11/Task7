package ru.vsu.cs.kislova_i_v;

import org.junit.*;

public class TestCase {

    @BeforeClass
    public static void reportAboutStartOfTests() {
        System.out.println("Testing of the program begins...");
        System.out.println();
    }

    @Before
    public void reportOnTestOperation() {
        System.out.print("Test is running...");
    }

    @Test
    public void testWithSmallNumbers() {
        int[] array1 = ArrayUtils.toIntArray("0, 1, 4, 0");
        int[] sortedArray1 = Main.bubbleSortArray(array1);
        Main.printArray(array1);
        int max = calculateMaxNumberOfDuplicateElements.calculateMaxNumberOfDuplicateElements(sortedArray1);
        Main.printResult(max);
        Assert.assertEquals(max, 2);
    }

    @Test
    public void testWithSameNumbersModulo() {
        int[] array2 = ArrayUtils.toIntArray("-1000, 0, -10, -15, 15, 10, 1000");
        int[] sortedArray2 = Main.bubbleSortArray(array2);
        Main.printArray(array2);
        int max = calculateMaxNumberOfDuplicateElements.calculateMaxNumberOfDuplicateElements(sortedArray2);
        Main.printResult(max);
        Assert.assertEquals(max, 1);
    }

    @Test
    public void testWithExactlySameNumbers() {
        int[] array3 = ArrayUtils.toIntArray("1, 1, 1, 1, 1, 1, 1, 1, 1");
        int[] sortedArray3 = Main.bubbleSortArray(array3);
        Main.printArray(array3);
        int max = calculateMaxNumberOfDuplicateElements.calculateMaxNumberOfDuplicateElements(sortedArray3);
        Main.printResult(max);
        Assert.assertEquals(max, 9);
    }

    @Test
    public void testWithNumbersConsistingOfSingleRepeatingDigit() {
        int[] array4 = ArrayUtils.toIntArray("3, 33, 333, 3333, 333333, 3333, 333, 33, 3, 3, 33");
        int[] sortedArray4 = Main.bubbleSortArray(array4);
        Main.printArray(array4);
        int max = calculateMaxNumberOfDuplicateElements.calculateMaxNumberOfDuplicateElements(sortedArray4);
        Main.printResult(max);
        Assert.assertEquals(max, 3);
    }

    @Test
    public void testWithNumbersConsistingOfIdenticalDigitsInDifferentCombinations() {
        int[] array5 = ArrayUtils.toIntArray("13465, 13645, 13564, 13546, 13456, 13564, 13654, 13465");
        int[] sortedArray5 = Main.bubbleSortArray(array5);
        Main.printArray(array5);
        int max = calculateMaxNumberOfDuplicateElements.calculateMaxNumberOfDuplicateElements(sortedArray5);
        Main.printResult(max);
        Assert.assertEquals(max, 2);
    }

    @Test
    public void testOfNegativeNumbersConsistingOf1And0() {
        int[] array6 = ArrayUtils.toIntArray("-1000000, -1000, -1000000, -1, -1000000, -100000, -10, -1000000");
        int[] sortedArray6 = Main.bubbleSortArray(array6);
        Main.printArray(array6);
        int max = calculateMaxNumberOfDuplicateElements.calculateMaxNumberOfDuplicateElements(sortedArray6);
        Main.printResult(max);
        Assert.assertEquals(max, 4);
    }

    @Test
    public void testConsistingOfSingleNumberContainingAllDigits() {
        int[] array7 = ArrayUtils.toIntArray("1234567890");
        int[] sortedArray7 = Main.bubbleSortArray(array7);
        Main.printArray(array7);
        int max = calculateMaxNumberOfDuplicateElements.calculateMaxNumberOfDuplicateElements(sortedArray7);
        Main.printResult(max);
        Assert.assertEquals(max, 1);
    }

    @Test
    public void testWithNegativeAndPositiveRepeatingNumbers() {
        int[] array8 = ArrayUtils.toIntArray("-53840, 980, 553, -53841, 556, 980, 647, 1, 0, 980, 553, 556, -53840");
        int[] sortedArray8 = Main.bubbleSortArray(array8);
        Main.printArray(array8);
        int max = calculateMaxNumberOfDuplicateElements.calculateMaxNumberOfDuplicateElements(sortedArray8);
        Main.printResult(max);
        Assert.assertEquals(max, 3);
    }

    @Test
    public void testWithTwoNumbersEqualInModulus() {
        int[] array9 = ArrayUtils.toIntArray("-2146758965, 2146758965");
        int[] sortedArray9 = Main.bubbleSortArray(array9);
        Main.printArray(array9);
        int max = calculateMaxNumberOfDuplicateElements.calculateMaxNumberOfDuplicateElements(sortedArray9);
        Main.printResult(max);
        Assert.assertEquals(max, 1);
    }

    @Test
    public void testWithSameNumberOfRepeatedNumbersConsistingOfSameDigit() {
        int[] array10 = ArrayUtils.toIntArray("666, 66, 666, 66, 666, 66, 666, 66");
        int[] sortedArray10 = Main.bubbleSortArray(array10);
        Main.printArray(array10);
        int max = calculateMaxNumberOfDuplicateElements.calculateMaxNumberOfDuplicateElements(sortedArray10);
        Main.printResult(max);
        Assert.assertEquals(max, 4);
    }

    @After
    public void reportCompletionOfTest() {
        System.out.println("Test execution completed");
    }

    @AfterClass
    public static void reportAboutEndOfTests() {
        System.out.println();
        System.out.print("Testing of the program is completed");
    }
}
