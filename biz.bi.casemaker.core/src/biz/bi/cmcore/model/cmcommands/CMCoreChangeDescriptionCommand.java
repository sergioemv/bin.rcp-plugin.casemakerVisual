/**
 * 
 */
package biz.bi.cmcore.model.cmcommands;

import org.eclipse.gef.commands.Command;

import biz.bi.cmcore.model.CMProxyObject;

/**
 * @author hcanedo
 *
 */
public class CMCoreChangeDescriptionCommand extends Command {

	private CMProxyObject m_ProxyObject;
	private String m_NewDescription, m_OldDescription;
	/**
	 * 
	 */
	public CMCoreChangeDescriptionCommand(CMProxyObject p_ProxyObject, String p_Description) {
		super("Change Description");
		m_ProxyObject=p_ProxyObject;
		m_NewDescription=p_Description;
		m_OldDescription=p_ProxyObject.getDescription();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#execute()
	 */
	public void execute() {
		m_ProxyObject.setDescription(m_NewDescription);
		super.execute();
	}
	/* (non-Javadoc)
	 * @see org.eclipse.gef.commands.Command#redo()
	 */
	public void undo() {
		m_ProxyObject.setDescription(m_OldDescription);
		super.undo();
	}


}
