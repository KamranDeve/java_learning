package in.co.srdt.BeHappy.service;

import in.co.srdt.BeHappy.entity.ToDo;
import in.co.srdt.BeHappy.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ToDoService{

    @Autowired
    private  TodoRepository todoRepository;

    public ToDo createToDo(ToDo toDo){
        return todoRepository.save(toDo);
    }

    public List <ToDo> getAllToDos(){
        return todoRepository.findAll();
    }

    public ToDo getToDoById(Long id){
        Optional<ToDo> todoOptional = todoRepository.findById(id);
        if(todoOptional.isPresent()){
            return todoOptional.get();
        }else {
            throw new RuntimeException("ToDo not found with id: " + id);
        }
    }
/*
    public ToDo updateTodo(Long id, ToDo todoDetails) {
        ToDo existingTodo = getToDoById(id);
        existingTodo.
        existingTodo.setDescription(todoDetails.getDescription());
        existingTodo.setCompleted(todoDetails.isCompleted());
        return todoRepository.save(existingTodo);
    }*/

    public void deleteToDo(Long id){
        todoRepository.deleteById(id);
    }
}
