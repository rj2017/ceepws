package com.example.ceepws.controller

import com.example.ceepws.NoteRepository
import com.example.ceepws.model.Note
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("notes")
class NoteController {

    @Autowired
    lateinit var noteRepository : NoteRepository

    @GetMapping
    fun list() : List<Note>{
        return noteRepository.findAll().toList()
    }
    @PostMapping
    fun add(@RequestBody note : Note) : Note{
        return noteRepository.save(note)
    }
}