package at.ac.tuwien.sepm.groupphase.backend.endpoint;

import at.ac.tuwien.sepm.groupphase.backend.endpoint.dto.ModelingToolDto;
import at.ac.tuwien.sepm.groupphase.backend.service.ModelingToolService;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Stream;

@RestController
@RequestMapping(value = ModelingToolEndpoint.basePath)
public class ModelingToolEndpoint {
    static final String basePath = "/api/v1/modeling_tools";
    private final ModelingToolService service;

    public ModelingToolEndpoint(ModelingToolService service) {
        this.service = service;
    }

    @GetMapping
    public Stream<ModelingToolDto> getModelingTools() {
        System.out.println("HERE");
        return service.getModelingTools().stream();
    }

    @GetMapping("{id}")
    public ModelingToolDto getModelingToolById(@PathVariable Long id) {
        return service.getModelingToolById(id);
    }

    @PostMapping
    public ModelingToolDto storeModelingTool(@RequestBody ModelingToolDto toolDto) {
        return service.storeModelingTool(toolDto);
    }
}
