/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.dialogs;

import java.util.Iterator;
import java.util.Vector;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.MouseEvent;
import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyRiskObject;
import biz.bi.vtcd.provider.VTCDEditPlugin;


/**
 * @author svonborries
 * @08-ago-2005
 * @Malon
 */
public class VTCDEquivalenceClassDialog extends Dialog {

	private List m_EffectList;
    private List m_AvailableEffectList;
    private Text m_DescriptionText;
    private Combo m_RiskLevelCombo;
    private Combo m_StateCombo;
    private Text m_ValueText;
    private Text m_IdText;
    
    private java.util.List m_lEffectList;
    private java.util.List  m_lAvailableEffectList;
    
        
    private String m_StateString="+";
    private String m_RiskLevelString="0";
    private String m_DescriptionString="";
    private String m_ValueString="";
    private String m_IdString="";
    private int m_StateIndex=0;
    public VTCDEquivalenceClassDialog(Shell parentShell) {
    	
        super(parentShell);
        m_lEffectList = new Vector();
        m_lAvailableEffectList = new Vector();
    }

    protected Control createDialogArea(Composite parent) {
        Composite container = (Composite) super.createDialogArea(parent);
        container.setLayout(new FormLayout());

        Group equivalenceClassGroup = new Group(container, SWT.NONE);
        equivalenceClassGroup.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDEquivalenceClassDialog_equivalenceClassGroup"));
        FormData formDataEquivalenceClassGroup = new FormData();
        formDataEquivalenceClassGroup.right = new FormAttachment(100, -5);
        formDataEquivalenceClassGroup.bottom = new FormAttachment(100, -5);
        formDataEquivalenceClassGroup.top = new FormAttachment(0, 5);
        formDataEquivalenceClassGroup.left = new FormAttachment(0, 5);
        equivalenceClassGroup.setLayoutData(formDataEquivalenceClassGroup);
        equivalenceClassGroup.setLayout(new FormLayout());

        Label idLabel = new Label(equivalenceClassGroup, SWT.NONE);
        FormData formDataIDLabel = new FormData();
        formDataIDLabel.top = new FormAttachment(0, 5);
        formDataIDLabel.left = new FormAttachment(0, 24);
        idLabel.setLayoutData(formDataIDLabel);
        idLabel.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDEquivalenceClassDialog_idLabel"));

        Label valueLabel = new Label(equivalenceClassGroup, SWT.NONE);
        FormData formDataValueLabel = new FormData();
        formDataValueLabel.top = new FormAttachment(0, 33);
        formDataValueLabel.left = new FormAttachment(0, 6);
        valueLabel.setLayoutData(formDataValueLabel);
        valueLabel.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDEquivalenceClassDialog_valueLabel"));

        m_IdText = new Text(equivalenceClassGroup, SWT.BORDER);
        m_IdText.setEnabled(false);
        FormData formDataIDText = new FormData();
        formDataIDText.top = new FormAttachment(0, 3);
        formDataIDText.right = new FormAttachment(0, 135);
        formDataIDText.bottom = new FormAttachment(0, 26);
        formDataIDText.left = new FormAttachment(0, 50);
        m_IdText.setLayoutData(formDataIDText);
        m_IdText.setText(getIdString());
        
        m_ValueText = new Text(equivalenceClassGroup, SWT.BORDER);
        FormData formDataValueText = new FormData();
        formDataValueText.top = new FormAttachment(0, 33);
        formDataValueText.left = new FormAttachment(0, 50);
        formDataValueText.right = new FormAttachment(0, 185);
        formDataValueText.bottom = new FormAttachment(0, 55);
        m_ValueText.setLayoutData(formDataValueText);
        m_ValueText.setText(getValueString());
        
        Label stateLabel = new Label(equivalenceClassGroup, SWT.NONE);
        FormData formDataStateLabel = new FormData();
        formDataStateLabel.top = new FormAttachment(m_IdText, 0, SWT.TOP);
        formDataStateLabel.left = new FormAttachment(0, 355);
        stateLabel.setLayoutData(formDataStateLabel);
        stateLabel.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDEquivalenceClassDialog_stateLabel"));

        Label riskLevelLabel = new Label(equivalenceClassGroup, SWT.NONE);
        FormData formDataRiskLevelLabel = new FormData();
        formDataRiskLevelLabel.top = new FormAttachment(0, 33);
        formDataRiskLevelLabel.left = new FormAttachment(0, 329);
        riskLevelLabel.setLayoutData(formDataRiskLevelLabel);
        riskLevelLabel.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDEquivalenceClassDialog_riskLevelLabel"));
        
        m_StateCombo = new Combo(equivalenceClassGroup, SWT.READ_ONLY);
        FormData formDataStateCombo = new FormData();
        formDataStateCombo.top = new FormAttachment(0, 0);
        formDataStateCombo.bottom = new FormAttachment(0, 24);
        formDataStateCombo.left = new FormAttachment(0, 395);
        m_StateCombo.setLayoutData(formDataStateCombo);
        this.setM_State(CMProxyRiskObject.STATE_NAMES);
        //m_StateCombo.select(new Integer(getStateString()).intValue());
        m_StateCombo.setText(getStateString());
        
        m_RiskLevelCombo = new Combo(equivalenceClassGroup, SWT.READ_ONLY);
        FormData formDataRiskLevelCombo = new FormData();
        formDataRiskLevelCombo.top = new FormAttachment(0, 30);
        formDataRiskLevelCombo.left = new FormAttachment(0, 395);
        m_RiskLevelCombo.setLayoutData(formDataRiskLevelCombo);
        this.setM_RiskLevel(CMProxyRiskObject.RISK_LEVELS);
        m_RiskLevelCombo.select(0);
        m_RiskLevelCombo.setText(new Integer(getRiskLevelString()).toString());
        
        Group descriptionGroup = new Group(equivalenceClassGroup, SWT.NONE);
        descriptionGroup.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDEquivalenceClassDialog_descriptionGroup"));
        FormData formDataDescriptionGroup = new FormData();
        formDataDescriptionGroup.bottom = new FormAttachment(0, 150);
        formDataDescriptionGroup.right = new FormAttachment(0, 565);
        formDataDescriptionGroup.top = new FormAttachment(m_ValueText, 5, SWT.BOTTOM);
        formDataDescriptionGroup.left = new FormAttachment(valueLabel, 0, SWT.LEFT);
        descriptionGroup.setLayoutData(formDataDescriptionGroup);
        descriptionGroup.setLayout(new FormLayout());

        m_DescriptionText = new Text(descriptionGroup, SWT.V_SCROLL | SWT.BORDER | SWT.H_SCROLL | SWT.MULTI);
        FormData formDataDescriptionText = new FormData();
        formDataDescriptionText.right = new FormAttachment(100, -5);
        formDataDescriptionText.bottom = new FormAttachment(100, -5);
        formDataDescriptionText.top = new FormAttachment(0, 5);
        formDataDescriptionText.left = new FormAttachment(0, 5);
        m_DescriptionText.setLayoutData(formDataDescriptionText);
        m_DescriptionText.setText(getDescriptionString());

        Group effectGroup = new Group(equivalenceClassGroup, SWT.NONE);
        effectGroup.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDEquivalenceClassDialog_availableEffectGroup"));
        FormData formDataEffectGroup = new FormData();
        formDataEffectGroup.right = new FormAttachment(0, 255);
        formDataEffectGroup.bottom = new FormAttachment(100, -5);
        formDataEffectGroup.top = new FormAttachment(descriptionGroup, 5, SWT.BOTTOM);
        formDataEffectGroup.left = new FormAttachment(descriptionGroup, 0, SWT.LEFT);
        effectGroup.setLayoutData(formDataEffectGroup);
        effectGroup.setLayout(new FormLayout());

        m_AvailableEffectList = new List(effectGroup, SWT.V_SCROLL | SWT.BORDER | SWT.H_SCROLL| SWT.MULTI);
        FormData formDataEffectList = new FormData();
        formDataEffectList.right = new FormAttachment(100, -5);
        formDataEffectList.bottom = new FormAttachment(100, -5);
        formDataEffectList.top = new FormAttachment(0, 5);
        formDataEffectList.left = new FormAttachment(0, 5);
        m_AvailableEffectList.setLayoutData(formDataEffectList);
        
        for (Iterator i = m_lAvailableEffectList.iterator();i.hasNext();)
        {
        	CMProxyEffect effect = ((CMProxyEffect)i.next());
        	if (!this.m_lEffectList.contains(effect))
			this.m_AvailableEffectList.add(effect.getName());
        }

        Group availableEffectGroup = new Group(equivalenceClassGroup, SWT.NONE);
        availableEffectGroup.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDEquivalenceClassDialog_effectGroup"));
        FormData formDataAvailableEffectGroup = new FormData();
        formDataAvailableEffectGroup.left = new FormAttachment(0, 320);
        formDataAvailableEffectGroup.right = new FormAttachment(100, -5);
        formDataAvailableEffectGroup.top = new FormAttachment(0, 155);
        formDataAvailableEffectGroup.bottom = new FormAttachment(0, 285);
        availableEffectGroup.setLayoutData(formDataAvailableEffectGroup);
        availableEffectGroup.setLayout(new FormLayout());

        m_EffectList = new List(availableEffectGroup, SWT.V_SCROLL | SWT.BORDER | SWT.H_SCROLL | SWT.MULTI);
        FormData formDataAvailableEffectList = new FormData();
        formDataAvailableEffectList.right = new FormAttachment(100, -5);
        formDataAvailableEffectList.bottom = new FormAttachment(100, -5);
        formDataAvailableEffectList.top = new FormAttachment(0, 5);
        formDataAvailableEffectList.left = new FormAttachment(0, 5);
        m_EffectList.setLayoutData(formDataAvailableEffectList);
        
        for (Iterator i = m_lEffectList.iterator();i.hasNext();)
			this.m_EffectList.add(((CMProxyEffect)i.next()).getName());
	
        

        Button forwardButton = new Button(equivalenceClassGroup, SWT.NONE);
        forwardButton.addMouseListener(new MouseListener() {
            public void mouseDoubleClick(MouseEvent e) {
            }
            public void mouseDown(MouseEvent e) {
            }
            public void mouseUp(MouseEvent e) {
            	if((m_AvailableEffectList.getItemCount() != 0)&&(m_AvailableEffectList.getSelectionIndex()>-1)){
					
					for (int i = 0; i < m_AvailableEffectList.getItemCount(); i++) {
						if(m_AvailableEffectList.isSelected(i)){
							
							m_EffectList.add(m_AvailableEffectList.getItem(i));
							m_lEffectList.add(m_lAvailableEffectList.get(i));
							
						}
					}
					
					java.util.List tempEffectList;
					tempEffectList = new Vector();
					tempEffectList.addAll(m_lAvailableEffectList);
					java.util.List tempAvailableEffect;
					tempAvailableEffect = new Vector();
					tempAvailableEffect.addAll(m_lEffectList);
					
						for (Iterator iter = tempEffectList.iterator(); iter.hasNext();) {
							CMProxyEffect element = (CMProxyEffect) iter.next();
							for (Iterator iterator = m_lEffectList.iterator(); iterator
									.hasNext();) {
								CMProxyEffect element1 = (CMProxyEffect) iterator.next();
								if (element.equals(element1)){
									m_lAvailableEffectList.remove(element1);
								}
							}
						}
						m_AvailableEffectList.remove(m_AvailableEffectList.getSelectionIndices());	
					}
				
			
            }
        });
        FormData formDataFordwardButton = new FormData();
        formDataFordwardButton.right = new FormAttachment(0, 315);
        formDataFordwardButton.top = new FormAttachment(0, 167);
        formDataFordwardButton.left = new FormAttachment(0, 260);
        forwardButton.setLayoutData(formDataFordwardButton);
        forwardButton.setText(">");

        Button backwardButton = new Button(equivalenceClassGroup, SWT.NONE);
        backwardButton.addMouseListener(new MouseListener() {
            public void mouseDoubleClick(MouseEvent e) {
            }
            public void mouseDown(MouseEvent e) {
            }
            public void mouseUp(MouseEvent e) {
            	if ((m_EffectList.getItemCount() != 0) && (m_EffectList.getSelectionIndex()>-1)){
					for (int i = 0; i < m_EffectList.getItemCount(); i++) {
						if (m_EffectList.isSelected(i))
						{
							
							m_AvailableEffectList.add(m_EffectList.getItem(i));
							m_lAvailableEffectList.add(m_lEffectList.get(i));
						}
					}
					java.util.List tempEffectList;
					tempEffectList = new Vector();
					tempEffectList.addAll(m_lAvailableEffectList);
					java.util.List tempAvailableEffect;
					tempAvailableEffect = new Vector();
					tempAvailableEffect.addAll(m_lEffectList);
					
					for (Iterator iter = tempAvailableEffect.iterator(); iter.hasNext();) {
						CMProxyEffect element = (CMProxyEffect) iter.next();
						for (Iterator iterator = m_lAvailableEffectList.iterator(); iterator
								.hasNext();) {
							CMProxyEffect element1 = (CMProxyEffect) iterator.next();
							if (element.equals(element1)){
								m_lEffectList.remove(element1);
							}
						}
					}
					
					m_EffectList.remove(m_EffectList.getSelectionIndices());
					
				}
				
            }
        });
        FormData formDataBackwardButton = new FormData();
        formDataBackwardButton.top = new FormAttachment(0, 196);
        formDataBackwardButton.left = new FormAttachment(0, 260);
        formDataBackwardButton.right = new FormAttachment(0, 315);
        backwardButton.setLayoutData(formDataBackwardButton);
        backwardButton.setText("<");

        Button allFordwardButton = new Button(equivalenceClassGroup, SWT.NONE);
        allFordwardButton.addMouseListener(new MouseListener() {
            public void mouseDoubleClick(MouseEvent e) {
            }
            public void mouseDown(MouseEvent e) {
            }
            public void mouseUp(MouseEvent e) {
            	
            	for (int i = 0; i < m_AvailableEffectList.getItemCount(); i++) {
					m_EffectList.add(m_AvailableEffectList.getItem(i));
					m_lEffectList.add(m_lAvailableEffectList.get(i));
				}

				java.util.List tempEffectList;
				tempEffectList = new Vector();
				tempEffectList.addAll(m_lAvailableEffectList);
				java.util.List tempAvailableEffect;
				tempAvailableEffect = new Vector();
				tempAvailableEffect.addAll(m_lEffectList);
				
					for (Iterator iter = tempEffectList.iterator(); iter.hasNext();) {
						CMProxyEffect element = (CMProxyEffect) iter.next();
						for (Iterator iterator = m_lEffectList.iterator(); iterator
								.hasNext();) {
							CMProxyEffect element1 = (CMProxyEffect) iterator.next();
							if (element.equals(element1)){
								m_lAvailableEffectList.remove(element1);
							}
						}
					}	
				
					m_AvailableEffectList.removeAll();
				
            	
            }
        });
        FormData formDataAllFordwardButton = new FormData();
        formDataAllFordwardButton.right = new FormAttachment(0, 315);
        formDataAllFordwardButton.top = new FormAttachment(0, 225);
        formDataAllFordwardButton.left = new FormAttachment(0, 260);
        allFordwardButton.setLayoutData(formDataAllFordwardButton);
        allFordwardButton.setText(">>");

        Button allBackwardButton = new Button(equivalenceClassGroup, SWT.NONE);
        allBackwardButton.addMouseListener(new MouseListener() {
            public void mouseDoubleClick(MouseEvent e) {
            }
            public void mouseDown(MouseEvent e) {
            }
            public void mouseUp(MouseEvent e) {
            	
            	for (int i = 0; i < m_EffectList.getItemCount(); i++) {
					m_AvailableEffectList.add(m_EffectList.getItem(i));
					m_lAvailableEffectList.add(m_lEffectList.get(i));
					
				}
		
				java.util.List tempEffectList;
				tempEffectList = new Vector();
				tempEffectList.addAll(m_lAvailableEffectList);
				java.util.List tempAvailableEffect;
				tempAvailableEffect = new Vector();
				tempAvailableEffect.addAll(m_lEffectList);
				
				for (Iterator iter = tempAvailableEffect.iterator(); iter.hasNext();) {
					CMProxyEffect element = (CMProxyEffect) iter.next();
					for (Iterator iterator = m_lAvailableEffectList.iterator(); iterator
							.hasNext();) {
						CMProxyEffect element1 = (CMProxyEffect) iterator.next();
						if (element.equals(element1)){
							m_lEffectList.remove(element1);
						}
					}
				}
				
				
				m_EffectList.removeAll();
            	
            }
        });
        FormData formDataAllBackwardButton = new FormData();
        formDataAllBackwardButton.right = new FormAttachment(0, 315);
        formDataAllBackwardButton.top = new FormAttachment(0, 254);
        formDataAllBackwardButton.left = new FormAttachment(0, 260);
        allBackwardButton.setLayoutData(formDataAllBackwardButton);
        allBackwardButton.setText("<<");
        //
        return container;
    }

    protected void createButtonsForButtonBar(Composite parent) {
        createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
                true);
        createButton(parent, IDialogConstants.CANCEL_ID,
                IDialogConstants.CANCEL_LABEL, false);
    }

    protected Point getInitialSize() {
        return new Point(598, 403);
    }
    protected void configureShell(Shell newShell) {
        super.configureShell(newShell);
        newShell.setText(VTCDEditPlugin.INSTANCE.getString("_UI_VTCDEquivalenceClassDialog_DialogTitle"));
    }
    protected void buttonPressed(int buttonId) {
        if (buttonId == IDialogConstants.OK_ID) {
            		
        			this.setDescriptionString(m_DescriptionText.getText());
					this.setIdString(this.m_IdText.getText());
					this.setRiskLevelString(this.m_RiskLevelCombo.getText());
					this.m_StateIndex = this.m_StateCombo.getSelectionIndex();
		            this.m_ValueString = this.m_ValueText.getText();
		            
		            
		
            
        }
        super.buttonPressed(buttonId);
    }

	/**
	 * @return Returns the availableEffectList.
	 */
	public java.util.List getAvailableEffectList() {
		return this.m_lEffectList;
	}

	/**
	 * @param p_availableEffectList The availableEffectList to set.
	 */
	public void setAvailableEffectList(java.util.List p_availableEffectList) {
		this.m_lAvailableEffectList.addAll(p_availableEffectList) ;
	}

	/**
	 * @return Returns the descriptionText.
	 */
//	public String getDescriptionText() {
//		this.m_DescriptionString = this.m_DescriptionText.getText();
//		return this.m_DescriptionString;
//	}

	

	/**
	 * @return Returns the effectList.
	 */
	public java.util.List getEffectList() {
		return this.m_lEffectList;
	}

	/**
	 * @param p_effectList The effectList to set.
	 */
	public void setEffectList(java.util.List p_effectList) {
		this.m_lEffectList.addAll(p_effectList);
	}


	
	

	/**
	 * @param p_valueText The valueText to set.
	 */
	

	private void setM_State(String[] p_State) {
		m_StateCombo.setItems(p_State);
	}
	
	
	
	private void setM_RiskLevel(String[] p_risklevel){
		m_RiskLevelCombo.setItems(p_risklevel);
	}
	
		

	/**
	 * @return Returns the descriptionString.
	 */
	public String getDescriptionString() {
		return this.m_DescriptionString;
	}

	/**
	 * @param p_descriptionString The descriptionString to set.
	 */
	public void setDescriptionString(String p_descriptionString) {
		this.m_DescriptionString = p_descriptionString;
	}

	

	/**
	 * @return Returns the stateString.
	 */
	public String getStateString() {
		return this.m_StateString;
	}

	/**
	 * @param p_i The stateString to set.
	 */
	public void setStateString(int p_i) {
		this.m_StateString = CMProxyRiskObject.STATE_NAMES[p_i];
	}

	/**
	 * @return Returns the valueString.
	 */
	public String getValueString() {
		return this.m_ValueString;
	}

	/**
	 * @param p_valueString The valueString to set.
	 */
	public void setValueString(String p_valueString) {
		this.m_ValueString = p_valueString;
	}

	/**
	 * @return Returns the idString.
	 */
	public String getIdString() {
		return this.m_IdString;
	}

	/**
	 * @param p_idString The idString to set.
	 */
	public void setIdString(String p_idString) {
		this.m_IdString = p_idString;
	}

	/**
	 * @return Returns the riskLevelString.
	 */
	public String getRiskLevelString() {
		return this.m_RiskLevelString;
	}
	
	public int getRiskLevelValue() {
		return new Integer(this.m_RiskLevelString).intValue();
	}

	/**
	 * @param p_riskLevelString The riskLevelString to set.
	 */
	public void setRiskLevelString(String p_riskLevelString) {
		this.m_RiskLevelString = p_riskLevelString;
	}

	/**
	 * @return
	 */
	public int getStateValue() {
		
		return this.m_StateIndex;
	}
	
	
}

	

