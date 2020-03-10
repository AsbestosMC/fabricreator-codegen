package asbestos.fabricreator.codegen.context;

import asbestos.fabricreator.codegen.context.model.ModProps;
import asbestos.fabricreator.codegen.context.model.RegistryBlock;

import java.util.List;

public class MainClassContext {
    private ModProps modProps;
    private List<RegistryBlock> registries;

    public ModProps getModProps() {
        return modProps;
    }

    public MainClassContext setModProps(ModProps modProps) {
        this.modProps = modProps;
        return this;
    }

    public List<RegistryBlock> getRegistries() {
        return registries;
    }

    public MainClassContext setRegistries(List<RegistryBlock> registries) {
        this.registries = registries;
        return this;
    }
}
