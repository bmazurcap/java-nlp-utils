package adamw.compilator;

import java.io.*;
import java.util.function.Supplier;

public class Compiler implements Supplier<Integer> {

    public static void main(String args[]) {
        Integer i = new Compiler().get();
        String asd = "asd";
    }

    @Override
    public Integer get() {
        try {
//            ProcessBuilder processBuilder = new ProcessBuilder().redirectErrorStream(true)
//                    .inheritIO()
//                    .command("C:\\Users\\bartmazu\\AppData\\Local\\Temp\\java-nlp-utils\\build.bat");
//            Process process = processBuilder.start();
//            int i = process.waitFor();
//            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
//            String line;
//            while ((line = reader.readLine()) != null) {
//                System.out.println(line);
//            }
            File file = new File("temp.output." + System.currentTimeMillis());
            ProcessBuilder processBuilder = new ProcessBuilder(
                    "C:\\Users\\bartmazu\\AppData\\Local\\Temp\\java-nlp-utils\\build.bat"// Replace with your file name
            );

            // Redirect error stream to capture errors

            file.createNewFile();
            processBuilder.redirectError(file);
            // Start the process
            Process process = processBuilder.start();
            return process.waitFor();
            ;
            return 1;
        } catch (IOException e) {
            return 2;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
