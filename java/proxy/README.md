# Overview
Proxy Design Pattern

# Simple proxy

simple proxy is easies to see.

1. Real Object and Proxy Object are implemented the same interface.
2. Proxy Object have Real Object as member.
3. Real Object's implemented method be called in Proxy Object's implemented method  

see **ProxySimpleDemo.java**

# extends Proxy class
we extend the proxy class. we give the proxy class to add other method.

1. create Wash interface and add wash method to it.
2. create other class with naming ProxyMeEx and implements Person and Wash
3.  wash method be called that follow the pickOrange method.
