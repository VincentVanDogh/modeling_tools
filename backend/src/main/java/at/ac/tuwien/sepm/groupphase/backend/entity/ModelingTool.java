package at.ac.tuwien.sepm.groupphase.backend.entity;

import at.ac.tuwien.sepm.groupphase.backend.type.ProgrammingLanguages;
import at.ac.tuwien.sepm.groupphase.backend.type.Technology;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.EnumType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Enumerated;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "modeling_tool")
public class ModelingTool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column
    private String link;

    @Column(name = "open_source")
    Boolean openSource;

    @Enumerated(EnumType.STRING)
    @Column
    Technology technology;

    @Column(name = "web_app")
    Boolean webApp;

    @Column(name = "desktop_app")
    Boolean desktopApp;

    @Column
    String category;

    @Column(name = "modeling_languages")
    String modelingLanguages;

    @Column(name = "source_code_generation")
    Boolean sourceCodeGeneration;

    @Column(name = "cloud_service")
    Boolean cloudService;

    @Column
    String license;

    @Column(name = "login_required")
    Boolean loginRequired;

    @Column
    String creator;

    @Column
    String platform;

    @Column(name = "real_time_collab")
    Boolean realTimeCollab;

    @Enumerated(EnumType.STRING)
    @Column(name = "programming_languages")
    ProgrammingLanguages programmingLanguages;

    public ModelingTool() {
    }

    public ModelingTool(Long id, String name, String link, Boolean openSource, Technology technology, Boolean webApp, Boolean desktopApp, String category, String modelingLanguages, Boolean sourceCodeGeneration, Boolean cloudService, String license, Boolean loginRequired, String creator, String platform, Boolean realTimeCollab, ProgrammingLanguages programmingLanguages) {
        this.id = id;
        this.name = name;
        this.link = link;
        this.openSource = openSource;
        this.technology = technology;
        this.webApp = webApp;
        this.desktopApp = desktopApp;
        this.category = category;
        this.modelingLanguages = modelingLanguages;
        this.sourceCodeGeneration = sourceCodeGeneration;
        this.cloudService = cloudService;
        this.license = license;
        this.loginRequired = loginRequired;
        this.creator = creator;
        this.platform = platform;
        this.realTimeCollab = realTimeCollab;
        this.programmingLanguages = programmingLanguages;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Boolean getOpenSource() {
        return openSource;
    }

    public void setOpenSource(Boolean openSource) {
        this.openSource = openSource;
    }

    public Technology getTechnology() {
        return technology;
    }

    public void setTechnology(Technology technology) {
        this.technology = technology;
    }

    public Boolean getWebApp() {
        return webApp;
    }

    public void setWebApp(Boolean webApp) {
        this.webApp = webApp;
    }

    public Boolean getDesktopApp() {
        return desktopApp;
    }

    public void setDesktopApp(Boolean desktopApp) {
        this.desktopApp = desktopApp;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getModelingLanguages() {
        return modelingLanguages;
    }

    public void setModelingLanguages(String modelingLanguages) {
        this.modelingLanguages = modelingLanguages;
    }

    public Boolean getSourceCodeGeneration() {
        return sourceCodeGeneration;
    }

    public void setSourceCodeGeneration(Boolean sourceCodeGeneration) {
        this.sourceCodeGeneration = sourceCodeGeneration;
    }

    public Boolean getCloudService() {
        return cloudService;
    }

    public void setCloudService(Boolean cloudService) {
        this.cloudService = cloudService;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Boolean getLoginRequired() {
        return loginRequired;
    }

    public void setLoginRequired(Boolean loginRequired) {
        this.loginRequired = loginRequired;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Boolean getRealTimeCollab() {
        return realTimeCollab;
    }

    public void setRealTimeCollab(Boolean realTimeCollab) {
        this.realTimeCollab = realTimeCollab;
    }

    public ProgrammingLanguages getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(ProgrammingLanguages programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }
}
