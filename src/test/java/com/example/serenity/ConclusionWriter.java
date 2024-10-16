package com.example.serenity;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ConclusionWriter {

    public static void writeConclusion(String conclusion) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("conclusions.txt", true))) {
            writer.write(conclusion);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
