package log;

import utility.reporting.TestLogger;

/**
 * Created by Mizan on 5/25/2017.
 */
public class CitiBankLog {
    public static void epicLogger(String epic){
        TestLogger.log(epic);
        TestLogger.log("Launch local browser Instance");

    }
}
