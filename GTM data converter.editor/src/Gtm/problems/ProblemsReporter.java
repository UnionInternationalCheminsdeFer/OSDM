package Gtm.problems;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.emf.validation.marker.MarkerUtil;
import org.eclipse.emf.validation.model.IConstraintStatus;
import org.eclipse.emf.validation.service.IValidationListener;
import org.eclipse.emf.validation.service.ValidationEvent;

public class ProblemsReporter implements IValidationListener {
    public void validationOccurred(ValidationEvent event) {
        if (event.matches(IStatus.WARNING | IStatus.ERROR)) {
            // fabricate a multi-status for the MarkerUtil to consume
            List<?> results = event.getValidationResults(); 
            IConstraintStatus multi = (IConstraintStatus) new MultiStatus(
                  "org.eclipse.example.MyPlugin", 1,
                  (IStatus[]) results.toArray(new IStatus[results.size()]),
                  "Problems were found by validation", null);

            try {
                // create problem markers on the appropriate resources
                MarkerUtil.createMarkers(multi);
            } catch (CoreException e) {
                // creation of problem markers failed for some reason
                //
            }
        }
    }    
}
