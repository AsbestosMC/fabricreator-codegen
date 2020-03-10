package asbestos.fabricreator.codegen;

import asbestos.fabricreator.codegen.context.MainClassContext;
import asbestos.fabricreator.codegen.context.model.ModProps;
import asbestos.fabricreator.codegen.context.model.RegistryBlock;
import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.ClassPathTemplateLoader;
import com.github.jknack.handlebars.io.TemplateLoader;

import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        TemplateLoader loader = new ClassPathTemplateLoader();
        loader.setPrefix("/codeTemplates");
        loader.setSuffix(".hbs");
        Handlebars handlebars = new Handlebars(loader);
        handlebars.setPrettyPrint(true);

        Template template = handlebars.compile("mainClass");

        ModProps modProps = new ModProps()
            .setModId("my_mod")
            .setClassName("MyMod")
            .setPackageName("mymod");
        RegistryBlock registryBlock = new RegistryBlock()
            .setType(RegistryBlock.RegistryType.ITEM)
            .setId("itemie");
        MainClassContext mainClassContext = new MainClassContext()
            .setModProps(modProps)
            .setRegistries(Arrays.asList(registryBlock));

        System.out.println(template.apply(mainClassContext));
    }
}
