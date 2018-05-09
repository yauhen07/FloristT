package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputData {
    private BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public int numberOfFlowers() throws IOException {
        return Integer.parseInt(input.readLine());
    }

    public String inputFlowers() throws IOException {
        return input.readLine();
    }
}
