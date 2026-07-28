package com.job_intel.backend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.tomcat.util.http.fileupload.IOUtils;

public class JsonEx {
    /*
     * // Source - https://stackoverflow.com/a/18784142 // Posted by mrswadge //
     * Retrieved 2026-07-26, License - CC BY-SA 3.0
     * 
     * public static final String CONSTANT =
     * org.apache.commons.lang.StringUtils.join( new String[] {
     * "This string is long", "really long...", "really, really LONG!!!" } );
     * 
     */
    // Source - https://stackoverflow.com/a/18784142
    // Posted by mrswadge
    // Retrieved 2026-07-26, License - CC BY-SA 3.0
    /*
     * public static final String CONSTANT = org.apache.commons.lang.StringUtils
     * .join(new String[] { "This string is long", "really long...",
     * "really, really LONG!!!" });
     */

    // Source - https://stackoverflow.com/a/18784142
    // Posted by mrswadge
    // Retrieved 2026-07-26, License - CC BY-SA 3.0

    public static String jsonTemp() {
        String text = "";
        try {
            FileInputStream fis = new FileInputStream("src/test/java/com/job_intel/backend/jsonformatter.txt");

            text = new String(fis.readAllBytes(), StandardCharsets.UTF_8);
            return text;
        } catch (IOException ex) {
            System.out.println("Exception caught: " + ex);
        }
        return text;

    }
}
