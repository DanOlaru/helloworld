package org.mylearningprojs.chapter3.stationery;

import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.List;

public class ArtworkManager {
    private List<ArtworkSender> artwork;

    static int itemsNo = 0;

    public static void main(String... args) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/artwork-context.xml");
        ctx.refresh();

        ArtworkManager instance = (ArtworkManager) ctx.getBean("waysToSendArtwork");

        instance.selectWaysToPrint();
        ctx.close();
    }

    private void selectWaysToPrint() {
        artwork.forEach(art -> {
//            System.out.println(art.getFriendlyName());
//            art.sendArtwork("home", new Recipient());
            System.out.println("Item " + ++itemsNo + ": " + art);
        });
    }

    public void setArtwork(List<ArtworkSender> artwork) {
        this.artwork = artwork;
    }
}