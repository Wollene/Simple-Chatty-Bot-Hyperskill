import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = reader.readLine();
        String secondLine = reader.readLine();
        String noSpacesFirst = firstLine.replace(" ", "");
        String noSpacesSecond = secondLine.replace(" ", "");
        System.out.println(noSpacesFirst.equals(noSpacesSecond));
    }
}