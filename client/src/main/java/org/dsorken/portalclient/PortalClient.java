package org.dsorken.portalclient;

import org.dsorken.portalclient.cli.PortalClientCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import picocli.CommandLine;

public class PortalClient {
    private static final Logger logger = LoggerFactory.getLogger(PortalClient.class);
    public static void main(String[] args) {
        logger.info("Starting Portal Client");

        int exitcode = new CommandLine(new PortalClientCommand()).execute(args);
        //client
        System.exit(exitcode);
    }
}

