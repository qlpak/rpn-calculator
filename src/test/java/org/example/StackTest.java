package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    private Stack sut;

    @BeforeEach
    public void setup() {
        sut = new Stack(10);
    }

    @Test
    public void testPopAfterPush() {
        sut.push("hello");
        String result = sut.pop();
        assertEquals("hello", result);
    }

    @Test
    public void checkIfCanCreateSut() {
        assertNotNull(sut, "Stack should not be null");
    }

    @Test
    public void push_SingleStringAddedToStack_WhenPeekStringIsTheSame() {
        sut.push("test");
        String result = sut.peek();
        assertEquals("test", result);
    }

    @Test
    public void push_TwoStringsAddedToStack_LastOnePeeked() {
        sut.push("first");
        sut.push("second");
        String result = sut.peek();
        assertEquals("second", result);
    }

    @Test
    public void pop_TwoStringsPushedToStack_CorrectStringReturnedByTheSecondPop() {
        sut.push("first");
        sut.push("second");
        sut.pop();
        String result = sut.pop();
        assertEquals("first", result);
    }

    @Test
    public void push_ThousandElementsPushedAndAllPopped_FirstPushedReturned() {
        for (int i = 0; i < 1000; i++) {
            sut.push("Element " + i);
        }
        String result = "";
        for (int i = 0; i < 1000; i++) {
            result = sut.pop();
        }
        assertEquals("Element 0", result);
    }

    @Test
    public void pop_TooManyPopsCalled_ThrowsEmptyStackException() {
        sut.push("one");
        sut.pop();
        assertThrows(EmptyStackException.class, sut::pop);
    }

    @Test
    public void peek_StackIsEmpty_ThrowsEmptyStackException() {
        assertThrows(EmptyStackException.class, sut::peek);
    }

    @Test
    public void isEmpty_StackIsEmpty_ReturnsTrue() {
        assertTrue(sut.isEmpty());
    }

    @Test
    public void isEmpty_StackHasElements_ReturnsFalse() {
        sut.push("one");
        assertFalse(sut.isEmpty());
    }
}

