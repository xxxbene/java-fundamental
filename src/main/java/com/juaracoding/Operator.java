package com.juaracoding;

public class Operator {
    /*
        +	Addition	Adds together two values	x + y
        -	Subtraction	Subtracts one value from another	x - y
        *	Multiplication	Multiplies two values	x * y
        /	Division	Divides one value by another	x / y
        %	Modulus	Returns the division remainder	x % y
        ++	Increment	Increases the value of a variable by 1	++x
        --	Decrement	Decreases the value of a variable by 1	--x
     */
    public static void main(String[] args) {

        // sisa bagi hasil
        int result = 5 % 2;
        int result2 = 11 % 3;
        System.out.println(result);
        System.out.println(result2);

        int x = 2;
        int number1= 10 * x++; //suffix
        System.out.println(number1);
        System.out.println(10*x);

        int y = 2;
        int number2= 10 * ++y; //prefix
        System.out.println(number2);

        int number3 = 5 + 2 * 10; // * / % lebih didahulukan daripada + -
//        tetep pake ( ) yang paling tinggi dan didahulukan
//        int number3 = (5 + 2) * 10;
        System.out.println(number3);

        /*
        OPERATOR ASSIGNMENT
        Operator	        Example	Same As
        =	                x = 5	x = 5
        +=	                x += 3	x = x + 3
        -=	                x -= 3	x = x - 3
        *=	                x *= 3	x = x * 3
        /=	                x /= 3	x = x / 3
        %=	                x %= 3	x = x % 3
        &=	                x &= 3	x = x & 3
        |=	                x |= 3	x = x | 3
        ^=	                x ^= 3	x = x ^ 3
        >>=	                x >>= 3	x = x >> 3
        <<=	                x <<= 3	x = x << 3
         */

        int a = 10;
        a += 5;
        System.out.println(a);

        /*
        COMPARISON
        Operator	        Name	                Example
            ==	            Equal to	               x == y
            !=	            Not equal	               x != y
            >	            Greater than	           x > y
            <	            Less than	               x < y
            >=	            Greater than or equal to   x >= y
            <=	            Less than or equal to	   x <= y
         */
        boolean isResult = -1 < 5;
        System.out.println(isResult);

        int bitwise = 10 & 12;
        System.out.println(bitwise);

// Kondisi: if, if else, switch
// Perulangan: for, while, do while
// Keluar dari pengulangan: break, continue, return




    }


}
