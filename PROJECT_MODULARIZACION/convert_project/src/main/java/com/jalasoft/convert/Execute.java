package com.jalasoft.convert;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Execute implements IExecuter {
    public boolean run(String command) {
        try {
            ProcessBuilder builder = new ProcessBuilder("cmd", "/c", "\"" + command + "\"");
            builder.redirectErrorStream();

            Process process = builder.start();
            process.waitFor();

            InputStreamReader streamReader = new InputStreamReader(process.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            StringBuilder result = new StringBuilder();
            while (reader.ready()) {
                result.append((char) reader.read());
            }
            return true;

        } catch (IOException | InterruptedException ex) {
            return false;
        }
    }
}
