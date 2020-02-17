package Gtm.presentation;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.BinaryResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class GtmResourceUtils {
	
	public static void registerBinaryResourceFactory(ResourceSet resourceSet) {
		
		Resource.Factory binaryResourceFactory = new Resource.Factory() {
			
			public Resource createResource(URI uri) {
				return new BinaryResourceImpl(uri);
			}
		};
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("gtm", binaryResourceFactory);
		
	}
	
	public static Map<Object, Object> getBinaryOptions() {
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(BinaryResourceImpl.OPTION_BUFFER_CAPACITY, 64000);
		return options;
	}
	
	public static Resource createResource(URI fileURI) {
		
		ResourceSet resourceSet = new ResourceSetImpl();
		
		registerBinaryResourceFactory(resourceSet);
		
		return resourceSet.createResource(fileURI);
		
	}

	
	public static Map<Object, Object> getBinarySaveOptions() {
		Map<Object, Object> options = new HashMap<Object, Object>();
		options.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
		options.put(Resource.OPTION_LINE_DELIMITER, Resource.OPTION_LINE_DELIMITER_UNSPECIFIED);
		options.put(BinaryResourceImpl.OPTION_BUFFER_CAPACITY, 64000);
		return options;
	}
	
	
	

}
