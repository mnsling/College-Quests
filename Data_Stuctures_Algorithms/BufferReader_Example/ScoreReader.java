package main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        int[] scoreRanges = new int[8];

        int[] rangeLimits = { 0, 25, 50, 75, 100, 125, 150, 175, 200 };

        try {
            BufferedReader br = new BufferedReader(new FileReader("input.txt"));
            readAndCountScores(br, scoreRanges, rangeLimits);
            br.close();
            displayScoreRanges(scoreRanges, rangeLimits);
        } catch (IOException e) {
            System.err.println("Error reading the input file.");
        }
    }

    private static void readAndCountScores(BufferedReader br, int[] scoreRanges, int[] rangeLimits) throws IOException {
        String line;
        while ((line = br.readLine()) != null) {
            try {
                int score = Integer.parseInt(line);
                updateScoreRanges(score, scoreRanges, rangeLimits);
            } catch (NumberFormatException e) {
                System.err.println("Skipping invalid score: " + line);
            }
        }
    }

    private static void updateScoreRanges(int score, int[] scoreRanges, int[] rangeLimits) {
        for (int i = 0; i < rangeLimits.length - 1; i++) {
            if (score >= rangeLimits[i] && score <= rangeLimits[i + 1]) {
                scoreRanges[i]++;
                break;
            }
        }
    }

    private static void displayScoreRanges(int[] scoreRanges, int[] rangeLimits) {
        for (int i = 0; i < rangeLimits.length - 1; i++) {
            int lowerLimit = rangeLimits[i];
            int upperLimit = rangeLimits[i + 1] - 1;
            int count = scoreRanges[i];
            System.out.printf("%d-%d: %d%n", lowerLimit, upperLimit, count);
        }
    }
}
