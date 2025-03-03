package com.kenner.mathutil.core;

import org.junit.jupiter.api.Test;
//IMPORT STATIC LÀ CÁCH KHAI BÁO TRƯỚC TÊN CLASS CHỨA HÀM STATIC
//ĐỂ Ở DƯỚI GỌI HÀM STATIC NGẮN GỌN NHƯ BÊN PASCAL, C: GỌI HÀM KO CẦN DẤU CHẤM TÊN CLASS
//NẾU CÓ NHIỀU HÀM STATIC, THÌ TA CHỈ CẦN IMPORT STATIC TÊN CLASS
import static com.kenner.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //CLASS NÀY XÀI BỘ THƯ VIÊN JUNIT, ĐC TẢI TRÊN MẠNG VỀ TỰ ĐỘNG BỜI MAVEN
    //BỘ THƯ VIỆN NÀY ĐỂ TEST CÁC HÀM CỦA CLASS CHÍNH
    //NÓ SẼ TỰ ĐỘNG CHẠY KHI ĐÓNG GÓI APP, ĐỂ CHECK XEM CÁC HÀM CÓ CHẠY ĐÚNG KO
    //ĐÚNG TỨC LÀ EXPECTED == ACTUAL
    //NẾU CÓ NHIỀU TEST CASE, THÌ NÓ SẼ GOM STATUS CỦA CÁC TEST CASE LẠI THÀNH 2 MÀU XANH, ĐỎ, MẮT DÂN DEV CHỈ CẦN NHÌN 2 MÀU XANH - PASSED
    //ĐỎ - FAILED MÀ KO CẦN NHÌN TỪNG TEST CASE COI PASSED HAY FAILED
    //Y CHANG CHO CÁC NGÔN NGỮ LẬP TRÌNH KHÁC - LÀ CHUẨN TEST CODE RỒI
    //BỘ THƯ VIỆN NÀY CÒN ĐC GỌI LÀ FRAMEWORK , JUNIT TESTING FRAMEWORK

    //TEST CASE #3: 5!
    @Test
    public void testFactorialGivenRightArgument5ReturnWell() {
        assertEquals(120, getFactorial(5));
        //5!            hy vọng trả về 120
        //so sánh 2 giá trị expected và actual nhưng ko viết sout
        //assert là hàm so 2 giá trị có == nhau hay không, của thư viện JUnit
    }

    //TEST CASE #3: 4!
    @Test
    public void testFactorialGivenRightArgument4ReturnWell() {
        assertEquals(24, getFactorial(4));
        //4!            hy vọng trả về 24
        //so sánh 2 giá trị expected và actual nhưng ko viết sout
        //assert là hàm so 2 giá trị có == nhau hay không, của thư viện JUnit
    }

    //TEST CASE #2: 1!
    @Test
    public void testFactorialGivenRightArgument1ReturnWell() {
        int n = 1; //1!
        long expectedResult = 1; //hy vọng trả về 1
        long actualResult = getFactorial(n);
        assertEquals(expectedResult, actualResult);
        //so sánh 2 giá trị expected và actual nhưng ko viết sout
    }

    //TEST CASE #1: VERIFY GET FACTORIAL WITH N=0, EXPECTED RESULT = 1
    @Test
    public void testFactorialGivenRightArgument0ReturnWell() {
        int n = 0; //0!
        long expectedResult = 1; //hy vọng trả về 1
        long actualResult = getFactorial(n); //thực tế sẽ là mấy

        //di so sánh 2 giá trị coi expected == actual???
        //System.out.println("Expected: " + expectedResult + "vs. Actual: " + actualResult);
        //System.out.println(expectedResult == actualResult); //true/false

        assertEquals(expectedResult, actualResult);
        //so sánh 2 giá trị expected và actual nhưng ko viết sout
    }

}