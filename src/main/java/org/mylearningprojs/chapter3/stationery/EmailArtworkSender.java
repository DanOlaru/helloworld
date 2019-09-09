package org.mylearningprojs.chapter3.stationery;

public class EmailArtworkSender implements ArtworkSender {
    private String artwork;

    public void setArtwork(String artwork) {
        this.artwork = artwork;
    }

    @Override
    public void sendArtwork(String artworkPath, Recipient recipient) {
        System.out.println("sending artwork via email");
    }

    @Override
    public String getFriendlyName() {
        return "Electronic mail";
    }

    @Override
    public String getShortName() {
        return "e-mail";
    }

    @Override
    public String toString() {
        return "EmailArtworkSender{" +
                "artwork='" + artwork + '\'' +
                '}';
    }
}
