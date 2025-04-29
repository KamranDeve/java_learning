package in.co.srdt.BeHappy.mapper;

import in.co.srdt.BeHappy.dto.ToDoDto;
import in.co.srdt.BeHappy.entity.ToDo;
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
