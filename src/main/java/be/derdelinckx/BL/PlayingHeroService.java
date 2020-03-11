package be.derdelinckx.BL;

import be.derdelinckx.DAL.entities.Bonus;
import be.derdelinckx.DAL.entities.PlayingHero;
import be.derdelinckx.DAL.entities.Skill;

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

}
