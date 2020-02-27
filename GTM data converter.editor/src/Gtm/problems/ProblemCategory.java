package Gtm.problems;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;

public class ProblemCategory {
	
	private List<Diagnostic> children = new ArrayList<Diagnostic>();
	private String name;
	private int severity;

	public ProblemCategory(int severity, String name) {
		this.severity = severity;
		this.name = name;
	}

	public List<Diagnostic> getChildren() {
		return children;
	}

	public void addChild(Diagnostic childDiagnostic) {
		this.children.add(childDiagnostic);
	}

	public void clear() {
		children.clear();
	}

	public String getName() {
		return this.name;
	}

	public int getSeverity() {
		return severity;
	}

}
