package com.homework.week21.button.state;

public interface ButtonState {
    boolean isEnabled();
    ColorType color();
    ButtonState nextState();
}
