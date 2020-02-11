package be.derdelinckx.DAL.DAO;

import be.derdelinckx.DAL.entities.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillDAO extends JpaRepository<Skill, Long> {
}
