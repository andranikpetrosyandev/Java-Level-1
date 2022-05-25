package com.homework.week21.button.state;

public class ButtonOnState implements ButtonState {
    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public ColorType color() {
        return ColorType.BLUE;
    }

    @Override
    public ButtonState nextState() {
        return new ButtonOffState();
    }
}
