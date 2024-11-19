package com.message.com.message;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {
    @Test
    public void test1() {

        String str1 = "0123400056789";
        String count = "2";

        Assertions.assertTrue(Message.ifContains(count, str1));
    }

    @Test
    public void test2() {

        String str1 = "0123456789";
        String count = "2";

        Assertions.assertFalse(Message.ifContains(count, str1));
    }

    @Test
    public void test3() {

        String str1 = "0101056789";
        String count = "3";

        Assertions.assertTrue(Message.ifContains(count, str1));
    }
    @Test
    public void test4() {

        String str1 = "01001056789";
        String count = "3";

        Assertions.assertTrue(Message.ifContains(count, str1));
    }
    @Test
    public void test5() {

        String str1 = "78901056789";
        String count = "3";

        Assertions.assertTrue(Message.ifContains(count, str1));
    }
    @Test
    public void test6() {

        String str1 = "77887788771056789";
        String count = "6";

        Assertions.assertTrue(Message.ifContains(count, str1));
    }
    @Test
    public void test7() {

        String str1 = "1";
        String count = "3";

        Assertions.assertFalse(Message.ifContains(count, str1));
    }
    @Test
    public void test8() {

        String str1 = "001191";
        String count = "0";

        Assertions.assertFalse(Message.ifContains(count, str1));
    }
    @Test
    public void test9() {

        String str1 = "051984";
        String count = "1";

        Assertions.assertFalse(Message.ifContains(count, str1));
    }

}