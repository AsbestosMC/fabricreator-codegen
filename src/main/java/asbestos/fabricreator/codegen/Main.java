package asbestos.fabricreator.codegen;

import com.github.jknack.handlebars.Handlebars;
import com.github.jknack.handlebars.Template;
import com.github.jknack.handlebars.io.ClassPathTemplateLoader;
import com.github.jknack.handlebars.io.TemplateLoader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        TemplateLoader loader = new ClassPathTemplateLoader();
        loader.setPrefix("/codeTemplates");
        loader.setSuffix(".hbs");
        Handlebars handlebars = new Handlebars(loader);

        Template template = handlebars.compile("mainClass");
        System.out.println(template.apply(new Object() {
            public Object getModProps() {
                return modProps;
            }

            public Object getCode() {
                return code;
            }

            public Object modProps = new Object() {
                public String getPackageName() {
                    return packageName;
                }

                public String getClassName() {
                    return className;
                }

                public String packageName = "mymod";
                public String className = "MyMod";
            };
            public Object code = new Object() {
                public String getRegistries() {
                    return registries;
                }

                public String registries = "";
            };
        }));
    }
}
