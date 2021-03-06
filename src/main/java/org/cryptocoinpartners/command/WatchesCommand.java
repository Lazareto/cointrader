package org.cryptocoinpartners.command;


import org.cryptocoinpartners.bin.ConsoleNotifications;

import javax.inject.Inject;


/**
 * @author Tim Olson
 */
@SuppressWarnings("UnusedDeclaration")
public class WatchesCommand extends CommandBase {

    public void run() {
        out.println("Watching:");
        out.printList(notifications.getWatchList());
    }


    public String getExtraHelp() {
        return "Displays all listings which are currently being watched";
    }


    @Inject
    protected ConsoleNotifications notifications;
}
