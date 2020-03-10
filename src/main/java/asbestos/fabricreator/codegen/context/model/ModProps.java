package asbestos.fabricreator.codegen.context.model;

public class ModProps {
    private String packageName;
    private String className;
    private String modId;

    public String getPackageName() {
        return packageName;
    }

    public ModProps setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public String getClassName() {
        return className;
    }

    public ModProps setClassName(String className) {
        this.className = className;
        return this;
    }

    public String getModId() {
        return modId;
    }

    public ModProps setModId(String modId) {
        this.modId = modId;
        return this;
    }
}
