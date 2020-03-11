package be.derdelinckx.BL;

import be.derdelinckx.DAL.entities.Hero;
import be.derdelinckx.DAL.entities.PlayingHero;
import be.derdelinckx.DAL.entities.Skill;
import be.derdelinckx.DAL.entities.User;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

public class ShopService {

    public boolean verifyCrystals(User currentUser, Hero chosenHero){
        int userBudget = currentUser.getCrystals();
        int chosenPrice = chosenHero.getPrice();
        if (userBudget >= chosenPrice) {
            return true;
        }
        return false;
    }

    public PlayingHero cloneHero(Hero chosenHero){

        PlayingHero newHero = new PlayingHero();

        newHero.setSkin(chosenHero.getSkin());
        newHero.setName(chosenHero.getName());
        newHero.setDescription(chosenHero.getDescription());
        newHero.setLevel(1);
        newHero.setStrength(chosenHero.getStrength());
        newHero.setIntelligence(chosenHero.getIntelligence());
        newHero.setCharisma(chosenHero.getCharisma());
        newHero.setLuck(chosenHero.getLuck());
        newHero.setFaction(chosenHero.getFaction());

        Set<Skill> newSkills = chosenHero.getSkills().stream().collect(Collectors.toSet());
        newHero.setSkills(newSkills);

        return newHero;

    }

    public User buyAndUpdate(User currentUser, PlayingHero newHero, Hero chosenHero){
        Integer currentUserCrystals = currentUser.getCrystals();
        Set<PlayingHero> currentUserHeroes = currentUser.getHeroes();

        for(PlayingHero h : currentUserHeroes){
            if(h.getName().equals(chosenHero.getName())) {
                return currentUser;
            }
        }

        if(currentUser.getCrystals() >= chosenHero.getPrice()) {
            currentUserHeroes.add(newHero);
            currentUser.setCrystals(currentUserCrystals - chosenHero.getPrice());
        }

        return currentUser;
    }

}
