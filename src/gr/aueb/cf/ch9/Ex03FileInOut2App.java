package gr.aueb.cf.ch9;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ex03FileInOut2App {

    public static void main(String[] args) {
        File inFd = new File("C:/temp/file6.txt");
        File outFd = new File("C:/temp/file6out.txt");
        String line;
        String[] tokes;

        try (Scanner in = new Scanner(inFd);
             PrintStream ps = new PrintStream(outFd, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokes = line.split(" +");

                for (String token : tokes) {
                    ps.printf("%s ", token);
                    ps.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
