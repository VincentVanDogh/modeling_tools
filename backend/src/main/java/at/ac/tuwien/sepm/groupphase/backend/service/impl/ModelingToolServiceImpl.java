package at.ac.tuwien.sepm.groupphase.backend.service.impl;

import at.ac.tuwien.sepm.groupphase.backend.endpoint.dto.ModelingToolDto;
import at.ac.tuwien.sepm.groupphase.backend.endpoint.mapper.ModelingToolMapper;
import at.ac.tuwien.sepm.groupphase.backend.entity.ModelingTool;
import at.ac.tuwien.sepm.groupphase.backend.exception.NotFoundException;
import at.ac.tuwien.sepm.groupphase.backend.repository.ModelingToolRepository;
import at.ac.tuwien.sepm.groupphase.backend.service.ModelingToolService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ModelingToolServiceImpl implements ModelingToolService {
    private final ModelingToolRepository repository;
    private final ModelingToolMapper mapper;

    public ModelingToolServiceImpl(ModelingToolRepository repository, ModelingToolMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<ModelingToolDto> getModelingTools() {
        List<ModelingToolDto> result = new ArrayList<>();
        List<ModelingTool> repo = repository.findAll();

        for (ModelingTool tool : repo) {
            result.add(mapper.modelingToolToModelingToolDto(tool));
        }

        return result;
    }

    @Override
    public ModelingToolDto getModelingToolById(Long id) throws NotFoundException {
        Optional<ModelingTool> tool = repository.findById(id);

        if (tool.isEmpty()) {
            throw new NotFoundException("Modeling Tool with ID number " + id + " could not be found");
        }

        return mapper.modelingToolToModelingToolDto(tool.get());
    }

    @Override
    public ModelingToolDto storeModelingTool(ModelingToolDto toolDto) {
        System.out.println("HERE 2");
        return mapper.modelingToolToModelingToolDto(repository.save(mapper.modelingToolDtoToModelingTool(toolDto)));
    }
}
