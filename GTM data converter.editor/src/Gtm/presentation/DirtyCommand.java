package Gtm.presentation;

import java.util.Collection;

import org.eclipse.emf.common.command.Command;

public class DirtyCommand implements Command {
	
	public DirtyCommand() {
		
	}

	@Override
	public boolean canExecute() {
		return true;
	}

	@Override
	public void execute() {
		//do nothing
	}

	@Override
	public boolean canUndo() {
		return false;
	}

	@Override
	public void undo() {
		//do nothing
	}

	@Override
	public void redo() {
		//do nothing
	}

	@Override
	public Collection<?> getResult() {
		return null;
	}

	@Override
	public Collection<?> getAffectedObjects() {
		return null;
	}

	@Override
	public String getLabel() {
		return "stack cleared";
	}

	@Override
	public String getDescription() {
		return "stack cleared";
	}

	@Override
	public void dispose() {

	}

	@Override
	public Command chain(Command command) {
		return null;
	}

}
