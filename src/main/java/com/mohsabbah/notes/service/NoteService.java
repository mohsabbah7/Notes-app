package com.mohsabbah.notes.service;

import com.mohsabbah.notes.model.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class NoteService {

    private final List<Note> notes = new ArrayList<>();
    private int nextId = 1;

    public List<Note> getNotes(){
        return notes;
    }

    public void addNotes(String title, String content){
        notes.add(new Note(nextId++, title, content));
    }

    public void deleteNote(int id){
        notes.removeIf(note -> note.getId() == id);
    }

    public void UpdateNote(int id, String title, String content){
        for(Note note : notes){
            if (note.getId() == id){
                note.setTitle(title);
                note.setContent(content);
            }
        }
    }



}
