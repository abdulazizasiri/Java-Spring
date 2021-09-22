### Web Service and APIs

Web services, APIs, and microservices

- Web services are designed to communicate with other services, or programs. 


###  Web services and API overview

A web service is a way to share data between two disparate systems. The communication typically happens between a client and a server.


Client - The client makes a request for data.
Server - The server responds to the client's request.


The means of communication between the client and server is via a standard web protocol like HTTP (or HTTPS) on the world wide web, that uses a common language like JSON or XML.

A client invokes a web service by sending an XML (or JSON) message, then waits for a corresponding XML response from the server.


### Web service vs API vs microservices

APIs and microserrvices are evloutions of WS

### REST 

REST stands for REpresentational State Transfer. It’s a set of guidelines application developers use to design APIs.


Data and functionality in the API are considered “resources” and identified through something called the URI, or Uniform Resource Identifier. These are accessed by web links.
Resources are manipulated using a fixed set of operations. GET retrieves a resource. POST creates one. Use PUT to update the resource, and of course, DELETE will remove it.
Resources can be represented in multiple formats, such as HTML, XML, plain text, and other formats defined by a media type.
Communication between the client and server (i.e. endpoint) is stateless. This means the server will not remember or store any state about the client that made the call.