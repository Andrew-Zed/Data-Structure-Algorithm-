package com.andrew.special_questions;

public class Question2 {
    public static void main(String[] args) {
//        countTeams();
    }
    public static int countTeams(int[] skills, int minPlayers, int minLevel, int maxLevel) {
        int[] currentSkills = new int[minPlayers];
        int[] used = new int[skills.length];
        return countTeamsHelper(skills, used, currentSkills, minPlayers, minLevel, maxLevel, 0, 0);
    }

    private static int countTeamsHelper(int[] skills, int[] used, int[] currentSkills, int minPlayers,
                                        int minLevel, int maxLevel, int start, int numIncluded) {
        int numTeams = 0;

        if (numIncluded == minPlayers) {
            int minSkill = Integer.MAX_VALUE;
            int maxSkill = Integer.MIN_VALUE;

            for (int skill : currentSkills) {
                if (skill < minSkill) {
                    minSkill = skill;
                }
                if (skill > maxSkill) {
                    maxSkill = skill;
                }
            }

            if (minSkill >= minLevel && maxSkill <= maxLevel) {
                numTeams++;
            }

            return numTeams;
        }

        for (int i = start; i < skills.length; i++) {
            if (used[i] == 0) {
                used[i] = 1;
                currentSkills[numIncluded] = skills[i];
                numTeams += countTeamsHelper(skills, used, currentSkills, minPlayers, minLevel,
                        maxLevel, i + 1, numIncluded + 1);
                used[i] = 0;
            }
        }

        return numTeams;
    }

}
