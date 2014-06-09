package com.rubensworks.custommealery;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Simple logger.
 * @author rubensworks
 *
 */
public class LoggerHelper
{
	private static Logger logger = LogManager.getLogger(Reference.MOD_NAME);

    /**
     * Initialize the logger.
     */
    public static void init() { }
    
    /**
     * Log a new message.
     * @param logLevel The level to log at.
     * @param message The message to log.
     */
    public static void log(Level logLevel, String message) {
        logger.log(logLevel, message);
    }
}
