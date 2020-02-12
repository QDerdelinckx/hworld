package be.derdelinckx.RestControllers;

import be.derdelinckx.DAL.DAO.ItemDAO;
import be.derdelinckx.DAL.entities.Item;
import be.derdelinckx.DTO.Item.ItemDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin
@RequestMapping("/api/item")
public class ItemController {

    private final ItemDAO itemDao;

    public ItemController(ItemDAO itemDao) {
        this.itemDao = itemDao;
    }

    @GetMapping("")
    public ResponseEntity<List<ItemDTO>> getAll(){
        List<Item> items = itemDao.findAll();

        return ResponseEntity.ok(items.stream().map(ItemDTO::new).collect(Collectors.toList()));
    }
}
