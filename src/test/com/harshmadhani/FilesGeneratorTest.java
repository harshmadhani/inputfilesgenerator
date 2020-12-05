package com.harshmadhani;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilesGeneratorTest {
    @Test
    void testFileGeneration() throws IOException {
        String[] args = new String[]{"7","89"};
        FilesGenerator.main(args);
        assertEquals(82,Files.readAllLines(Paths.get("inputfile.txt")).size());
    }
}
