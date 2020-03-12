package be.derdelinckx.BL;

import be.derdelinckx.DAL.entities.*;

import java.util.HashSet;
import java.util.Set;

public class PlayingHeroService {

    public PlayingHero powerUp(PlayingHero hero){
        if (hero.getRoleCrew() != null) {
            for (Skill heroSkill : hero.getSkills()) {
                for (Bonus bonus : hero.getRoleCrew().getBonus()) {
                    if (bonus.getAffected().equals(heroSkill.getArchetype1()) || bonus.getAffected().equals(heroSkill.getArchetype2())) {
                        heroSkill.setScore(heroSkill.getScore() + bonus.getBonus());
                    }
                }
            }
        }
        return hero;
    }

    public boolean isSuccesful(EpisodeOption episodeOption, PlayingHero playingHero){
        Set<Requirement> currentRequirements = episodeOption.getRequirements();
        int minToReach = 0;
        for (Requirement requirement : currentRequirements){
            minToReach += requirement.getRequiredScore();
        }

        int heroPerformance = 0;
        for (Requirement requirement : currentRequirements){
            for (Skill skill : playingHero.getSkills()) {
                if (skill.getArchetype1().equals(requirement.getArchetype().getArchetype_name()) ||
                    skill.getArchetype2().equals(requirement.getArchetype().getArchetype_name())) {
                    System.out.println(skill.getScore());
                    heroPerformance += skill.getScore();
                }
            }
        }

        double successRate = ((double) heroPerformance/(double) minToReach)*100;
        return (successRate >= 100);
    }

}
