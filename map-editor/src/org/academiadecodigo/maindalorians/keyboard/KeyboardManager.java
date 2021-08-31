package org.academiadecodigo.maindalorians.keyboard;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardManager {

    public static void init(KeyboardHandler handler){
        Keyboard kb = new Keyboard(handler);

        for(KEY k: KEY.values()){
            KeyboardEvent event = new KeyboardEvent();
            event.setKeyboardEventType(k.type);
            event.setKey(k.key);
            kb.addEventListener(event);
        }
    }

    private enum KEY{
        UP_PRESS(KeyboardEventType.KEY_PRESSED, KeyboardEvent.KEY_UP ),
        DOWN_PRESS(KeyboardEventType.KEY_PRESSED, KeyboardEvent.KEY_DOWN),
        LEFT_PRESS(KeyboardEventType.KEY_PRESSED, KeyboardEvent.KEY_LEFT),
        RIGHT_PRESS(KeyboardEventType.KEY_PRESSED, KeyboardEvent.KEY_RIGHT),
        C_RELEASE(KeyboardEventType.KEY_RELEASED, KeyboardEvent.KEY_C),
        L_RELEASE(KeyboardEventType.KEY_RELEASED, KeyboardEvent.KEY_L),
        Q_RELEASE(KeyboardEventType.KEY_RELEASED, KeyboardEvent.KEY_Q),
        S_RELEASE(KeyboardEventType.KEY_RELEASED, KeyboardEvent.KEY_S),
        SPACE_PRESSED(KeyboardEventType.KEY_PRESSED, KeyboardEvent.KEY_SPACE);

        private KeyboardEventType type;
        private int key;

        KEY(KeyboardEventType type, int key) {
            this.type = type;
            this.key = key;
        }
    }
}
