public class Main {

    public static void main(String[] args) {

        System.out.println("===== REMOTE PROXY TEST =====");

        RealMedia media = new RealMedia("Avengers Movie", 7200);

        MediaItem remoteProxy = new RemoteMediaProxy(media);

        System.out.println("Title: " + remoteProxy.getTitle());
        System.out.println("Duration: " + remoteProxy.getDuration());
        remoteProxy.play();

        System.out.println();

        System.out.println("===== VIRTUAL PROXY TEST =====");

        MediaItem virtualProxy =
                new VirtualMediaProxy("Spider-Man Movie", 6500);

        System.out.println("Virtual proxy created.");

        System.out.println("Title: " + virtualProxy.getTitle());

        System.out.println("Duration: " + virtualProxy.getDuration());

        virtualProxy.play();
    }
}
