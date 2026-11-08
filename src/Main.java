public class Main {

    public static void main(String[] args) {

        RealMedia media = new RealMedia("Avengers Movie", 7200);

        MediaItem proxy = new RemoteMediaProxy(media);

        System.out.println("Media Title: " + proxy.getTitle());

        System.out.println("Media Duration: " + proxy.getDuration() + " seconds");

        proxy.play();
    }
}
