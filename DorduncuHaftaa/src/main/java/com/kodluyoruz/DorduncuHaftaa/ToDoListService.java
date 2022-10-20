package com.kodluyoruz.DorduncuHaftaa;

/**
 * @author sevgidemir
 */

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Random;

@Service
public class ToDoListService {
    public static ToDoList getToDoList(int listeId) {
        List<ToDoList> List = ToDoListConfiguration.gunlerList;
        for (ToDoList deger : List) {
            if (deger.getId() == listeId) {
                return deger;
            }
        }
        return null;
    }

    public boolean saveList(ToDoListSaveRequest requestBody) {
        String listName = requestBody.getGun();


        ToDoList list = new ToDoList();
        list.setGun(listName);
        int id = getId();
        list.setId(id);

        List<ToDoList> List = ToDoListConfiguration.gunlerList;
        List.add(list);

        return true;
    }

    private int getId() {
        Random random = new Random();
        int id = random.nextInt(1000);
        return id;
    }


    public boolean deleteList(int listeId) {
        List<ToDoList> List = ToDoListConfiguration.gunlerList;
        for (ToDoList deger : List) {
            if (deger.getId() == listeId) {
                List.remove(deger);
            }
        }
        return true;
    }
}
