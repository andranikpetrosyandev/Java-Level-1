package com.homework.week21.button.state;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ButtonStateTest {
    private ButtonState buttonOnState;

    @Test
    public void testChangeStateToOff() {
        buttonOnState = new ButtonOnState();
        Assertions.assertEquals(buttonOnState.color(), ColorType.BLUE);
        Assertions.assertTrue(buttonOnState.isEnabled());

        ButtonState buttonState = buttonOnState.nextState();

        Assertions.assertEquals(buttonState.color(), ColorType.GRAY);
        Assertions.assertFalse(buttonState.isEnabled());
    }


    @Test
    public void testChangeStateToOn() {
       buttonOnState = new ButtonOffState();
        Assertions.assertEquals(buttonOnState.color(), ColorType.GRAY);
        Assertions.assertFalse(buttonOnState.isEnabled());

        ButtonState buttonState = buttonOnState.nextState();

        Assertions.assertEquals(buttonState.color(), ColorType.BLUE);
        Assertions.assertTrue(buttonState.isEnabled());
    }

}