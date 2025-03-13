package com.kenner.mathutil.core;


public class MathUtility {
    //class này cung ấp các hàm liên quan đến toán học.
    //nó là thư viên toán học. Mà thư viên tính toán thì các hàm thường sẽ là static
    //hàm tính n!
    //n! = 1.2.3...n, trong đó
    //0! = 1! = 1
    //mình ko tính quá 20! vì 21! kiểu long chứa ko nổi, sẻ tính sai
    //mình chỉ tính từ 0...20!
    //hàm nhận vào n, trả vể n! (n trong đoạn từ [0...20])


    public static long getFactorial(int n) {
        //kĩ thuật nhồi con heo đất, ốc nhồi thịt, tiếp chiêu
        //kĩ thuật nhân dồn, cộng dồn giá trị

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n, n must be in the range [0...20]");
        }

        if (n < 0 || n > 20)
            return 1;

        return n * getFactorial(n - 1); //xong đệ quy
    }

    //5! = 1.2.3.4.5
    //   = 4! x 5 tính rượt đuồi
    //4! = 3! x 4
    //3! = 2! x 3
    //2! = 1! x 2
    //1! = 1
    //đệ quy - recursion
    //gọi lại chính mình với quy mô nhỏ hơn - búp bê Nga
    //n! = n x (n-1)!

//    public static long getFactorial(int n) {
//        //kĩ thuật nhồi con heo đất, ốc nhồi thịt, tiếp chiêu
//        //kĩ thuật nhân dồn, cộng dồn giá trị
//
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid n, n must be in the range [0...20]");
//        }
//
//        long result = 1; //bài tổng thì ban đầu = 0
//        if  (n == 0)
//            return 1; //thoát sớm khi có thể, return ngay khi có thể
//        //if và for nếu chỉ có 1 lệnh ko cần{ ... 1 lệnh}
//        //return sớm thì ko cần else luôn
//
//        //n = 1,2,3,4 -> nhân dồn result = result * i;
//        for (int i = 1; i <= n; i++ ) {
//            //result = result * i;
//            result *= i; //nhân dồn từ 1 đến n, tăng từ  1 2 3, dồn vào sau
//        }
//        return result;
//    }
}
