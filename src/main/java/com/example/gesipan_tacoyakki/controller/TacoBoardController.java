package com.example.gesipan_tacoyakki.controller;

import com.example.gesipan_tacoyakki.service.TacoBoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("/tacoboard")

public class TacoBoardController {
    private final TacoBoardService tacoBoardService;

    @GetMapping("/")
    public String home() {
        return "redirect:/tacoboard/list";
    }


    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("tacoBoards", tacoBoardService.findAll());
        return "tacoboard/list";
    }
    @GetMapping("/write")
    public String writeForm() {
        return "tacoboard/write";
    }
    @PostMapping("/write")
    public String write(@RequestParam String title, @RequestParam String content) {
        tacoBoardService.write(title, content);
        return "redirect:/tacoboard/list";
    }
    @GetMapping("/{id}")
    public String detail(@PathVariable Long id, Model model) {
        model.addAttribute("tacoBoard", tacoBoardService.findOne(id));
        return "tacoboard/detail";
    }
    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("tacoBoard", tacoBoardService.findOne(id));
        return "tacoboard/edit";
    }

    @PostMapping("/{id}/edit")
    public String edit(@PathVariable Long id, @RequestParam String title, @RequestParam String content) {
        tacoBoardService.update(id, title, content);
        return "redirect:/tacoboard/" + id;
    }
    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        tacoBoardService.delete(id);
        return "redirect:/tacoboard/list";
    }

}
