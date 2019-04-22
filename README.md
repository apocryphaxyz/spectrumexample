# Simple Rest Service

---

## Code Excercise for postion with [Spectrum](https://jobs.spectrum.com/)

### Exercise Specification

> Create a standalone JavaEE project that can run on WLS, which provides a RESTful service that we can post 2 integers to,
> and the service will add the integers together and return the sum in JSON format.

### Solution

With the idea that they requested it as a J2EE project I decided to skip most modern frameworks as with a Spring Boot Starter this exercise could be done in about 15 minutes including full project startup time. So I created a project using Jersey and tried to stick to older versions of Java that might be more inline with what the expected technology stack is, While certain things could have been easier using Java 1.7 or 1.8 in my experience larger corporations are still working to adopt these versions fully even though there are newer versions of java than these available. I deliberately eschewed the use of other older frame works like EJB because I did not want to over engineer a simple project like this.

### Testing

 I did not have a Weblogic server to test on, but I did test this simple deployment on Jetty once up and running I was able to send a POST request via Postman and get the desired result back.
