package pl.teksusik.aoc;

import pl.teksusik.aoc.challenge.Day01;
import pl.teksusik.aoc.challenge.Day02;

public class AdventOfCode {
    public static void main(String[] args) {
        ChallengeService challengeService = new ChallengeService();

        challengeService.addChallenge(new Day01(1, "01.txt"));
        challengeService.addChallenge(new Day02(2, "02.txt"));

        if (args.length == 0) {
            challengeService.runAllChallenges();
            return;
        }

        if (!isInteger(args[0])) {
            throw new IllegalArgumentException("Arguments must be integer");
        }

        int day = Integer.parseInt(args[0]);
        if (!challengeService.exists(day)) {
            throw new IllegalArgumentException("Provided challenge not exists");
        }

        challengeService.runChallenge(day);
    }

    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException ignored) {
            return false;
        }
    }
}
