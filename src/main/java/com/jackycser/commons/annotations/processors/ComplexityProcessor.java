package com.jackycser.commons.annotations.processors;

import com.jackycser.commons.annotations.Complexity;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;
import java.util.Set;

/**
 * @author Jacky Zhang
 * @since 27/12/2016
 */
@SupportedAnnotationTypes("com.jackycser.commons.annotations.Complexity")
@SupportedSourceVersion(SourceVersion.RELEASE_8)
public class ComplexityProcessor extends AbstractProcessor {

    public ComplexityProcessor() {
//        super();
    }

    @Override
    public boolean process(Set<? extends TypeElement> annotations,
                           RoundEnvironment roundEnv) {
        for (Element elem : roundEnv.getElementsAnnotatedWith(Complexity.class)) {
            Complexity complexity = elem.getAnnotation(Complexity.class);
            String message = "annotation found in " + elem.getSimpleName() + " with complexity " + complexity.value();
            processingEnv.getMessager().printMessage(Diagnostic.Kind.NOTE, message);
        }

        return true; // no further processing of this annotation type
    }
}
