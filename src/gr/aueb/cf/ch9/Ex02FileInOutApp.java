package gr.aueb.cf.ch9;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Ex02FileInOutApp {

    public static void main(String[] args) {
        File inFd = new File("C:/temp/file6.txt");
        File outFd = new File("C:/temp/file6out.txt");
        String line;
        String[] tokes;

        try (Scanner in = new Scanner(inFd);
            PrintWriter pw = new PrintWriter(outFd, StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                line = in.nextLine();
                tokes = line.split(" +");

                for (String token : tokes) {
                    pw.printf("%s ", token);
                    pw.flush();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
