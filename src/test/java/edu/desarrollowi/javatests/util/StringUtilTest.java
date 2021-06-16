package edu.desarrollowi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {

    @Test
    public void repeat_string_once(){
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }
    @Test
    public void repeat_multiple_times(){
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }
    @Test
    public void repeat_string_zero_times(){
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }
    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_input(){
        StringUtil.repeat("hola", -1);
    }

    @Test
    public void any_string(){
        Assert.assertFalse(StringUtil.isEmpty("E"));
    }

    @Test
    public void empty_string(){
        Assert.assertTrue(StringUtil.isEmpty(""));
    }
    @Test
    public void null_string(){
        String string = null;
        Assert.assertTrue(StringUtil.isEmpty(string));
    }
    @Test
    public void string_with_blank_spaces(){
        String string = "   ";
        Assert.assertTrue(StringUtil.isEmpty(string.trim()));
    }
}