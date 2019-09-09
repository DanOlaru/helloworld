package org.mylearningprojs.chapter3.annoAndXml;

import org.mylearningprojs.chapter3.ContentHolder;
import org.springframework.stereotype.Service;

@Service("lyricsHolderAnno")
public class LyricsHolderAnno implements ContentHolder {
    private String value = "'Alternative: You be the DJ, I'll be the driver'";

    @Override
    public String toString() {
        return "LyricHolder: { " + value + "}";
    }
}
