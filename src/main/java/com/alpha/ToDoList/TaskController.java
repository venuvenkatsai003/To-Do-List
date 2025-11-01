package com.alpha.ToDoList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tasks")
@CrossOrigin(origins = "http://localhost:5173")
public class TaskController {

    @Autowired
    private TaskRepository taskRepo;

    @PostMapping
    public ResponseEntity<Tasks> saveTask(@RequestBody Tasks task) {
        Tasks savedTask = taskRepo.save(task);
        return ResponseEntity.ok(savedTask);
    }
    
    @GetMapping
    public List<Tasks> getAll() {
        return taskRepo.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tasks> updateTask(@PathVariable int id, @RequestBody Tasks task) {
        Optional<Tasks> optTask = taskRepo.findById(id);
        if (optTask.isPresent()) {
            Tasks existingTask = optTask.get();
            existingTask.setTitle(task.getTitle());
            existingTask.setDescription(task.getDescription());
            existingTask.setStatus(task.getStatus());
            return ResponseEntity.ok(taskRepo.save(existingTask));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteTask(@PathVariable int id) {
        Optional<Tasks> optTask = taskRepo.findById(id);
        if (optTask.isPresent()) {
            taskRepo.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
