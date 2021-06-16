package edu.desarrollowi.javatests.passwords;

import org.junit.Test;

import static edu.desarrollowi.javatests.passwords.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {

        assertEquals(WEAK, PasswordUtil.assesPassword("123aa!"));
    }

    @Test
    public void weak_when_has_only_letters() {

        assertEquals(WEAK, PasswordUtil.assesPassword("abcdefghjk"));
    }

    @Test
    public void medium_when_has_letters_and_numbers() {

        assertEquals(MEDIUM, PasswordUtil.assesPassword("abcd12345"));
    }

    @Test
    public void weak_when_has_letters_numbers_and_symbols() {

        assertEquals(STRONG, PasswordUtil.assesPassword("abcd123!"));
    }
}