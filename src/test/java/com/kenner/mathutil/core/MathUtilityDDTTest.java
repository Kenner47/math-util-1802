package com.kenner.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.kenner.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {
    //chuẩn bị cộng data, các cập x! kì vọng bằng mấy
    //chính là mảng 2 chiều
    //hàm này phải là public static đề các hàm @Test mò vào lấy data đề test run
    public static Object[][] initData() { //DTT - DATA DRIVEN TESTING
        return new Object[][] {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120}, //5! hy vọng 120
                {6, 720}
        };
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgumentReturnWell(int n, long expecttedResult) {
        assertEquals(expecttedResult, getFactorial(n));
    }

}