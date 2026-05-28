package com.mohsabbah.notes.controller;

import com.mohsabbah.notes.model.Note;
import com.mohsabbah.notes.service.NoteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/notes")
public class NoteController {

    private final NoteService noteService;

    public NoteController(NoteService noteService) {
        this.noteService = noteService;
    }

    @GetMapping
    public String getNotes(org.springframework.ui.Model model) {
        model.addAttribute("notes", noteService.getNotes());
        return "notes";
    }

    @PostMapping("/add")
    public String addNote(@RequestParam String title, @RequestParam String content) {
        noteService.addNotes(title, content);
        return "redirect:/notes";
    }

    @GetMapping("/delete/{id}")
    public String deleteNote(@PathVariable int id) {
        noteService.deleteNote(id);
        return "redirect:/notes";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, org.springframework.ui.Model model) {
        Note note = noteService.getNotes().stream()
                .filter(n -> n.getId() == id)
                .findFirst().orElse(null);
        model.addAttribute("note", note);
        return "edit";
    }

    @PostMapping("/edit/{id}")
    public String updateNote(@PathVariable int id, @RequestParam String title, @RequestParam String content) {
        noteService.UpdateNote(id, title, content);
        return "redirect:/notes";
    }
}