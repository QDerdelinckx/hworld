package be.derdelinckx.RestControllers;

import be.derdelinckx.DAL.DAO.SkillDAO;
import be.derdelinckx.DAL.entities.Skill;
import be.derdelinckx.DTO.Skill.SkillDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("api/skill")
public class SkillController {

    public final SkillDAO skillDAO;

    public SkillController(SkillDAO skillDAO) {
        this.skillDAO = skillDAO;
    }

    @GetMapping("")
    public ResponseEntity<List<SkillDTO>> getAll(){
        List<Skill> skills = skillDAO.findAll();

        List<SkillDTO> dtos = skills.stream().map(SkillDTO::new).collect(Collectors.toList());

        return ResponseEntity.ok(dtos);
    }
}
