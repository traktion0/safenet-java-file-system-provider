package org.traktion0.safenet;

/**
 * Created by paul on 23/09/16.
 */
public class SafenetFileSystemIntegrationTest {

    /*@Test
    public void testListFiles() throws IOException {
        Map<String, String> env = new HashMap<>();
        env.put("create", "true");
        // locate file system by using the syntax
        // defined in java.net.JarURLConnection
        URI uri = URI.create("safe://traktion0/");

        try (FileSystem safeFs = FileSystems.newFileSystem(uri, env)) {
            Path safeFile = safeFs.getPath("/SomeTextFile.txt");

            assertEquals(safeFile.toString(), "");
        }
    }*/
}
