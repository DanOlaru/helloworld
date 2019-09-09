package org.mylearningprojs.chapter3.stationery;

public class FtpArtworkSender implements ArtworkSender {
    private String artwork;

    public void setArtwork(String artwork) {
        this.artwork = artwork;
    }

    @Override
    public void sendArtwork(String artworkPath, Recipient recipient) {
        //ftp logic here
        System.out.println("sending artwork via FTP");
    }

    @Override
    public String getFriendlyName() {
        return "File Transfer Protocol";
    }

    @Override
    public String getShortName() {
        return "ftp";
    }

    @Override
    public String toString() {
        return "FtpArtworkSender{" +
                "artwork='" + artwork + '\'' +
                '}';
    }
}
