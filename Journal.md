Phase 1: Remote Proxy & Core Interface

In this phase, I created the MediaItem interface with methods for getting the media title, duration, and playing the media. I also created the RealMedia class to represent the actual media object and the RemoteMediaProxy class to manage the connection.

I learned that the common interface allows the client to interact with the proxy without needing to know how the actual media object works or where it is located. The proxy handles the connection before passing requests to the real object.

One challenge was making sure the connection only happens once. I solved this by using a boolean variable called isConnected that changes to true after the first connection.

--------------------

Phase 2: Virtual Proxy (Lazy Loading)

In this phase, I created the VirtualMediaProxy class. It implements the MediaItem interface and delays creating the RealMedia object until one of its methods is called.

I used a null check to determine whether the media had already been loaded. If realMedia is null, the proxy creates the object and displays a loading message. After that, it reuses the same object instead of loading it again.

I learned that the Remote Proxy manages a connection to a remote object, while the Virtual Proxy delays creating an object until it is needed. One challenge was making sure the real media object was only created once. I solved this by using an if statement to check whether realMedia was null.

--------------------

Phase 3: Validation & Reflection

In this phase, I tested my completed Multimedia Management System to make sure both proxies worked correctly. I tested the Remote Proxy multiple times and verified that it only established the connection once. I also tested the Virtual Proxy and confirmed that it only loaded the heavy media assets once.

During testing, I verified that both proxies continued working when their methods were called multiple times. I did not find any major bugs during my testing.

I learned that the Proxy Pattern helps control access to real objects. The Remote Proxy manages connections, while the Virtual Proxy saves resources by delaying object creation until it is needed. Both proxies use the same interface, which allows them to be used interchangeably.
