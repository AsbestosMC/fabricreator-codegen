package asbestos.fabricreator.codegen.context.model;

public class RegistryBlock {
    private RegistryType type;
    private String id;

    public String getId() {
        return id;
    }

    public RegistryBlock setId(String id) {
        this.id = id;
        return this;
    }

    public RegistryType getType() {
        return type;
    }

    public RegistryBlock setType(RegistryType type) {
        this.type = type;
        return this;
    }

    public enum RegistryType {
        ITEM, BLOCK
    }
}
