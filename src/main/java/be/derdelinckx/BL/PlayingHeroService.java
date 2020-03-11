package be.derdelinckx.BL;

import be.derdelinckx.DAL.entities.Bonus;
import be.derdelinckx.DAL.entities.PlayingHero;
import be.derdelinckx.DAL.entities.Skill;

public class PlayingHeroService {

    public PlayingHero powerUp(PlayingHero hero){
        int counterSkill = 0;
        int counterBonus = 0;
        if (hero.getRoleCrew() != null) {
            for (Skill heroSkill : hero.getSkills()) {
                counterSkill++;
                System.out.println("Skill Loop :" + counterSkill);
                for (Bonus bonus : hero.getRoleCrew().getBonus()) {
                    counterBonus++;
                    if (bonus.getAffected().equals(heroSkill.getArchetype1()) || bonus.getAffected().equals(heroSkill.getArchetype2())) {
                        heroSkill.setScore(heroSkill.getScore() + bonus.getBonus());
                    }
                    System.out.println(bonus.getAffected() + "/" + heroSkill.getArchetype1());
                    System.out.println(bonus.getAffected() + "/" + heroSkill.getArchetype2());
                }
            }
        }
        return hero;
    }

}
