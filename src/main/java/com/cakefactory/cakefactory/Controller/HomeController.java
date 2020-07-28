package com.cakefactory.cakefactory.Controller;

import com.cakefactory.cakefactory.Domain.Item;
import com.cakefactory.cakefactory.Service.ItemRepoServi;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HomeController {

    private final ItemRepoServi itemRepoServi;

    public HomeController(ItemRepoServi itemRepoServi) {
        this.itemRepoServi = itemRepoServi;
    }

    @GetMapping
    public String showHomepage(Model model){
        List<Item> itemList = itemRepoServi.listAll();
        model.addAttribute("catalog",itemList);
        return "index";
    }

}
