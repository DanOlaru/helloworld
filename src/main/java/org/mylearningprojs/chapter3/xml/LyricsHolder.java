package org.mylearningprojs.chapter3.xml;

import org.mylearningprojs.chapter3.ContentHolder;

public class LyricsHolder implements ContentHolder {
    private String value = "'You be the DJ, I'll be the driver'";

    @Override
    public String toString() {
        return "LyricHolder: { " + value + "}";
    }
}
