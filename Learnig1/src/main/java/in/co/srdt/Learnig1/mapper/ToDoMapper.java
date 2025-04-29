package in.co.srdt.Learnig1.mapper;

import in.co.srdt.Learnig1.dto.ToDoDto;
import in.co.srdt.Learnig1.entity.ToDo;
import org.springframework.stereotype.Component;

@Component
public class ToDoMapper {

    public ToDoDto toDto(ToDo toDo) {

        ToDoDto toDoDto = new ToDoDto();

        return toDoDto;
    }

    public ToDo toEntity(ToDoDto toDoDto) {

        ToDo toDo = new ToDo();
        return toDo;
    }
}
