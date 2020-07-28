package com.cakefactory.cakefactory.Service;

import com.cakefactory.cakefactory.Domain.Item;
import com.cakefactory.cakefactory.Repositories.ItemRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemRepoServi {

    private final ItemRepo itemRepo;

    public ItemRepoServi(ItemRepo itemRepo) {
        this.itemRepo = itemRepo;
    }

    public List<Item> listAll(){
        return itemRepo.findAll();
    }
}
