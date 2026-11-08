Phase 1: Remote Proxy & Core Interface

In this phase, I created the MediaItem interface with methods for getting the media title, duration, and playing the media. I also created the RealMedia class to represent the actual media object and the RemoteMediaProxy class to manage the connection.

I learned that the common interface allows the client to interact with the proxy without needing to know how the actual media object works or where it is located. The proxy handles the connection before passing requests to the real object.

One challenge was making sure the connection only happens once. I solved this by using a boolean variable called isConnected that changes to true after the first connection.
