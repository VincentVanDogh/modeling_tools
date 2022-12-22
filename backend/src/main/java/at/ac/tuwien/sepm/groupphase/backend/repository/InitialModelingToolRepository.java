package at.ac.tuwien.sepm.groupphase.backend.repository;

import at.ac.tuwien.sepm.groupphase.backend.entity.ModelingTool;
import at.ac.tuwien.sepm.groupphase.backend.type.ProgrammingLanguages;
import at.ac.tuwien.sepm.groupphase.backend.type.Technology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract class InitialModelingToolRepository implements JpaRepository<ModelingTool, Long> {

    @Autowired
    public InitialModelingToolRepository() {
        /*
        save(
                new ModelingTool(1L, "Test", false, Technology.APP, false, true, "Test Category", "C", false, true, "FREE", false, "Me", "Widnows", true, ProgrammingLanguages.C)
        );
         */
    }
}
