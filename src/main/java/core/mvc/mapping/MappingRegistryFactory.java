package core.mvc.mapping;

import core.mvc.handler.HandlerMapping;

import java.util.ArrayList;
import java.util.List;

public class MappingRegistryFactory {

    public static MappingRegistry create(String basePackage) {
        List<HandlerMapping> handlerMappings = new ArrayList<>();
        handlerMappings.add(new AnnotationHandlerMapping(basePackage));
        handlerMappings.add(new LegacyHandlerMapping());
        return new MappingRegistry(handlerMappings);
    }

}