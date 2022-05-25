package com.homework.week21.button.state;

public class ButtonOffState implements ButtonState {
    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public ColorType color() {
        return ColorType.GRAY;
    }

    @Override
    public ButtonState nextState() {
        return new ButtonOnState();
    }
}
