package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

/**
 * Reads a CSV-styled file with Location, Latitude, Longitude
 * and writes each entry as JSON style to another file
 * Won't actually run.
 */
public class ToJson {

    /**
     * Application entry point
     * @param args not used
     * @throws IOException if the input file cannot be read or output cannot be written
     */
    public static void main(String[] args) throws IOException {
        Path inputFile = Path.of("locations.txt");
        Path outputFile = Path.of("locationsModified.txt");

        List<String> lines = Files.readAllLines(inputFile);
        for (String line : lines) {
            String[] parts = line.trim().split(",");

            if (parts.length != 3) {
                    System.err.println("Invalid line, skipping " + line);
                    continue;
            }
            String modifiedLine = String.format(
                        "{ location: '%s', latitude: %s, longitude: %s }%n",
                        parts[0], parts[1], parts[2]
            );

            Files.writeString(
                    outputFile,
                    modifiedLine,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
        }
    }
}
