package com.server;
import fi.iki.elonen.NanoHTTPD;
import java.io.IOException;

public class SimpleHTTPServer extends NanoHTTPD {
    private final BoxMover boxMover;

    public SimpleHTTPServer(int port, BoxMover boxMover) throws IOException {
        super(port);
        this.boxMover = boxMover;
        start(NanoHTTPD.SOCKET_READ_TIMEOUT, false);
        System.out.println("\nServer running on port " + port + "\n");
    }

    @Override
    public Response serve(IHTTPSession session) {
        String html = "<!DOCTYPE html><html><head><title>Box Mover</title></head><body>" +
                "<h1>Use arrow keys to move the box</h1>" +
                "</body></html>";
        return newFixedLengthResponse(html);
    }

    public static void main(String[] args) {
        try {
            BoxMover boxMover = new BoxMover();
            SimpleHTTPServer server = new SimpleHTTPServer(8080, boxMover);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
