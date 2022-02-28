package videos;

public class Channel {
    private String channelName;
    private int subscribers;
    private int uploaded;

    public Channel(String channelName, int subscribers, int uploaded) {
        this.channelName = channelName;
        this.subscribers = subscribers;
        this.uploaded = uploaded;
    }

    public int getUploaded() {
        return uploaded;
    }

    public String getChannelName() {
        return channelName;
    }

    public int getSubscribers() {
        return subscribers;
    }
}
