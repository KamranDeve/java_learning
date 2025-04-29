package in.co.srdt.ToDo.mapper;

import in.co.srdt.ToDo.dto.ToDoDto;
import in.co.srdt.ToDo.entity.ToDo;
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
