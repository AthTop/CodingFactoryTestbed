package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;
import java.util.UUID;

/**
 * Creates a copy of a file in the same path with a new
 * unique name.
 * It then prints metadata.
 */
public class CopyWithMetadata {
    static final String BASE_DIR  = "C:/tmp/";
    /**
     * calls binaryCopier to copy a file
     * @param args not provided
     */
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        String fileName = "";
        System.out.println("Please provide a file name: ");
        fileName = scanner.nextLine();
        Path file = Path.of(BASE_DIR, fileName);
        binaryCopier(file);


    }

    /**
     * Copies a binary file with a new random name in the same directory
     * calls metadataPrinter to print metadata
     * @param source Path to a source file
     */
    public static void binaryCopier(Path source) {
        String originalFileName = source.getFileName().toString();
        Path newFilePath = source.getParent()
                                .resolve(
                                        UUID.randomUUID()
                                        .toString()
                                        .replace(":", "_").concat(originalFileName)
                                );
        try {
            Files.copy(source, newFilePath, StandardCopyOption.REPLACE_EXISTING);
            metadataPrinter(source, newFilePath);
        } catch (IOException e) {
            System.err.println("Copy failed " + e.getMessage());
        }

    }

    /**
     * prints metadata for source and target, such as their path and file extension
     * @param source source path
     * @param target target path
     */
    public static void metadataPrinter(Path source, Path target) {
        System.out.println("Original file: " + source.toString());
        System.out.println("Destination file: " + target.toString());
        System.out.println("File type: "
                + target.toString().substring(target.toString().lastIndexOf(".") + 1));
    }
}
