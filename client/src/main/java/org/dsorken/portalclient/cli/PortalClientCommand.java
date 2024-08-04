package org.dsorken.portalclient.cli;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import picocli.CommandLine;


@CommandLine.Command(
    name = "portal-client", 
    mixinStandardHelpOptions = true, 
    version = "Portal Client 1.0",
    description = "Java Portal Network Client")
public class PortalClientCommand implements Runnable {
    private static final Logger logger = LoggerFactory.getLogger(PortalClientCommand.class);

    @CommandLine.Option(names={"--verbose-logging"}, description = "Enable Verbose Logging")
    private boolean verboseLogging;

    @CommandLine.Option(names={"--portal-host"}, description = "Portal Host")
    private String portalHost;

    @CommandLine.Option(names={"--portal-port"}, description = "Portal Port")
    private int portalPort = 2;

    @CommandLine.Option(names={"--portal-interface"}, description = "Portal Interface")
    private String portalInterface;

    @CommandLine.Option(names={"--max-peers"}, description = "Max Peers")
    private int maxPeers = 2;

    @CommandLine.Option(names={"--destination-host"}, description = "Destination Host")
    private String destinationHost;

    @CommandLine.Option(names={"--destination-port"}, description = "Destination Port")
    private int destinationPort = 2;

    @CommandLine.Option(names={"--discv5-type"}, description = "Discv5 Packet Type")
    private int discv5Type = 2;

    

    @Override
    public void run() {
        logger.info("Command Line");
        System.out.println("Portal Host: " + portalHost);
        System.out.println("Portal Port: " + portalPort);
        System.out.println("Portal Interface: " + portalInterface);
        System.out.println("Max Peers: " + maxPeers);
        System.out.println("Destination Host: " + destinationHost);
        System.out.println("Destination Port: " + destinationPort);
        System.out.println("Discv5 Type: " + discv5Type);
    }
}