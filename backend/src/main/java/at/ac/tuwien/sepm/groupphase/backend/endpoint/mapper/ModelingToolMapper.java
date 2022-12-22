package at.ac.tuwien.sepm.groupphase.backend.endpoint.mapper;

import at.ac.tuwien.sepm.groupphase.backend.endpoint.dto.ModelingToolDto;
import at.ac.tuwien.sepm.groupphase.backend.entity.ModelingTool;
import org.mapstruct.Mapper;

@Mapper
public interface ModelingToolMapper {
    ModelingToolDto modelingToolToModelingToolDto(ModelingTool modelingTool);

    ModelingTool modelingToolDtoToModelingTool(ModelingToolDto modelingToolDto);
}
