package com.cakefactory.cakefactory.Repositories;

import com.cakefactory.cakefactory.Domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepo extends JpaRepository<Item,String> {
}
