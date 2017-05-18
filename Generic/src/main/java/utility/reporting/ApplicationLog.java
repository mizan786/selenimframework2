package utility.reporting;

import base.CommonAPI;

/**
 * Created by Mizan on 5/16/2017.
 */
public class ApplicationLog {
    public static void epicLogger(String epic){
        TestLogger.log(epic);
        TestLogger.log("Launch local browser Instance");
    }
}
