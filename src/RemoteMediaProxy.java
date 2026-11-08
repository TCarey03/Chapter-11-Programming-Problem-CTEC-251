public class RemoteMediaProxy implements MediaItem {

    private RealMedia realMedia;
    private boolean isConnected = false;

    public RemoteMediaProxy(RealMedia realMedia) {
        this.realMedia = realMedia;
    }

    private void connect() {
        if (!isConnected) {
            System.out.println("Remote Proxy: Establishing connection...");
            isConnected = true;
        }
    }

    @Override
    public String getTitle() {
        connect();
        return realMedia.getTitle();
    }

    @Override
    public int getDuration() {
        connect();
        return realMedia.getDuration();
    }

    @Override
    public void play() {
        connect();
        realMedia.play();
    }
}
