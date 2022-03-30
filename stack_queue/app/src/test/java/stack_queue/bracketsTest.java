package stack_queue;

import static org.junit.Assert.*;

import org.junit.Test;

////original solution

public class bracketsTest{
    @Test
    public void testMultiBracketValidation() {
        assertTrue(BracketsValidation.validateBrackets("(())"));
        assertTrue(BracketsValidation.validateBrackets("[]"));
        assertTrue(BracketsValidation.validateBrackets("{}"));
        assertTrue(BracketsValidation.validateBrackets("([{}])"));

        assertFalse(BracketsValidation.validateBrackets("((("));
        assertFalse(BracketsValidation.validateBrackets("[{}]))"));
        assertFalse(BracketsValidation.validateBrackets(")([{}]"));
        assertFalse(BracketsValidation.validateBrackets("}([{)]"));
    }
}