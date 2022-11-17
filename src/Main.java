import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.lang.String;
import java.io.*;

public class Main {
    //creates a Commandmenu that has as a title DOCKER SCRIPT

    public static void main(String[] args) throws IOException {
        List<String> cmds = Arrays.asList("cmd.exe", "/C", "start", "docker", "ps");
        ProcessBuilder builder = new ProcessBuilder(cmds);

        Map<String, String> env = builder.environment();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
            //check if GoLand is in the path
            if (envName.equals("PATH")) {
                System.out.println("GoLand is in the path");
            }
        }
        builder.directory(new File("C://Windows//System32//"));
        Process proc = builder.start();
        OutputStream out = proc.getOutputStream();

        //check if the process is running
            new Thread(() -> {
                try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out))) {
                    bw.write("[command here]");
                    bw.flush();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            }).start();


        }

    }
