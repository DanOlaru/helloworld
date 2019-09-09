package org.mylearningprojs.chapter3.stationery;

public class SecureCopyProtocolArtworkSender implements ArtworkSender {

    private String artwork;

    public void setArtwork(String artwork) {
        this.artwork = artwork;
    }

    public String getArtwork() {return artwork;}

    @Override
    public void sendArtwork(String artworkPath, Recipient recipient) {
        System.out.println("sending artwork via SCP");
    }

    @Override
    public String getFriendlyName() {
        return "Secure Copy Protocol";
    }

    @Override
    public String getShortName() {
        return "SCP";
    }

    @Override
    public String toString() {
        return "SecureCopyProtocolArtworkSender{" +
                "artwork='" + artwork + '\'' +
                '}';
    }
}
