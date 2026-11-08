public class Main {

    public static void main(String[] args) {

        System.out.println("===== REMOTE PROXY TEST =====");

        RealMedia media = new RealMedia("Avengers Movie", 7200);

        MediaItem remoteProxy = new RemoteMediaProxy(media);

        System.out.println("Title: " + remoteProxy.getTitle());
        System.out.println("Duration: " + remoteProxy.getDuration());
        remoteProxy.play();

        // Test remote proxy again
        System.out.println("\nTesting remote proxy again:");

        remoteProxy.getTitle();
        remoteProxy.play();

        System.out.println("\n===== VIRTUAL PROXY TEST =====");

        MediaItem virtualProxy =
                new VirtualMediaProxy("Spider-Man Movie", 6500);

        System.out.println("Virtual proxy created.");

        // First method call loads the media
        System.out.println("Title: " + virtualProxy.getTitle());

        System.out.println("Duration: " + virtualProxy.getDuration());

        virtualProxy.play();

        // Test virtual proxy again
        System.out.println("\nTesting virtual proxy again:");

        virtualProxy.getTitle();
        virtualProxy.play();

        System.out.println("\n===== TESTING COMPLETE =====");
    }
}
