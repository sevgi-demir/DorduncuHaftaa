package com.kodluyoruz.DorduncuHaftaa;

/**
 * @author sevgidemir
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/list")
public class ToDoListController {

    @Autowired
    ToDoListService listService;

    @GetMapping("/getList")
    public ToDoList getToDoList(@RequestParam(value = "listId", required = false) int listeId){
        return ToDoListService.getToDoList(listeId);

    }

    @PostMapping("/saveList")
    public boolean saveToDoList(@RequestBody ToDoListSaveRequest listeSaveRequestBody){
        return listService.saveList(listeSaveRequestBody);

    }

    @DeleteMapping("/deleteList")
    public boolean updateToDoList(@RequestParam int listeId){
        return listService.deleteList(listeId);

    }
}
