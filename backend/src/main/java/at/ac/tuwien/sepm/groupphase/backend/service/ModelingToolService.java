package at.ac.tuwien.sepm.groupphase.backend.service;

import at.ac.tuwien.sepm.groupphase.backend.endpoint.dto.ModelingToolDto;
import at.ac.tuwien.sepm.groupphase.backend.exception.NotFoundException;

import java.util.List;

public interface ModelingToolService {

    /**
     * Get all modeling tools stored in the persistence database
     *
     * @return Stream of modeling tool dto's
     */
    List<ModelingToolDto> getModelingTools();

    /**
     * Get modeling tool with the corresponding ID stored in the persistence database
     *
     * @param id the ID of the modeling tool
     * @return the modeling tool with ID {@code id}
     */
    ModelingToolDto getModelingToolById(Long id) throws NotFoundException;

    /**
     * Store a new modeling tool in the persistent data store
     *
     * @param toolDto data of the new modeling tool
     * @return successfully newly stored modeling tool
     */
    ModelingToolDto storeModelingTool(ModelingToolDto toolDto);
}
