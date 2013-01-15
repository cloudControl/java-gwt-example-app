package com.cloudcontrolled.sample.gwt.server;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

public class GreetingServiceEmbedded {

    public static void main(String[] args) throws Throwable {

        Server server = new Server(Integer.valueOf(System.getenv("PORT")));

        // Create a handler for processing our GWT app
        WebAppContext handler = new WebAppContext();
        handler.setContextPath("/");
        handler.setWar("./target/example-1.0-SNAPSHOT.war");

        // Add it to the server
        server.setHandler(handler);

        // And start it up
        server.start();
        server.join();
    }
}
