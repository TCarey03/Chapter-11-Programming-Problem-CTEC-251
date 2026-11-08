public class VirtualMediaProxy implements MediaItem {

    private RealMedia realMedia;
    private String title;
    private int duration;

    public VirtualMediaProxy(String title, int duration) {
        this.title = title;
        this.duration = duration;

        System.out.println("Virtual Proxy created. Media not loaded yet.");
    }

    private void loadMedia() {
        if (realMedia == null) {
            System.out.println("Loading heavy assets into memory...");
            realMedia = new RealMedia(title, duration);
        }
    }

    @Override
    public String getTitle() {
        loadMedia();
        return realMedia.getTitle();
    }

    @Override
    public int getDuration() {
        loadMedia();
        return realMedia.getDuration();
    }

    @Override
    public void play() {
        loadMedia();
        realMedia.play();
    }
}
