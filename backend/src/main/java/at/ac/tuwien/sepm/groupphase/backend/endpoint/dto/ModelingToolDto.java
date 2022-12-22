package at.ac.tuwien.sepm.groupphase.backend.endpoint.dto;

import at.ac.tuwien.sepm.groupphase.backend.type.ProgrammingLanguages;
import at.ac.tuwien.sepm.groupphase.backend.type.Technology;

// TODO:
//  category -> enum
//  license -> enum
//  platform -> enum
//  modelingLanguages needs to be a String array (manyToOne relationship)
//  programmingLanguages needs to be a String array (manyToOne relationship)
public record ModelingToolDto(
        Long id,
        String name,
        String link,
        Boolean openSource,
        Technology technology,
        Boolean webApp,
        Boolean desktopApp,
        String category,
        String modelingLanguages,
        Boolean sourceCodeGeneration,
        Boolean cloudService,
        String license,
        Boolean loginRequired,
        String creator,
        String platform,
        Boolean realTimeCollab,
        ProgrammingLanguages programmingLanguages
) {
}
