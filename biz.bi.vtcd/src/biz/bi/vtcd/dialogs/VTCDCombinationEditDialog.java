package biz.bi.vtcd.dialogs;

import java.awt.Toolkit;
import java.util.Iterator;
import java.util.Vector;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowData;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;



import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.custom.LineStyleListener;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.ui.PlatformUI;

import biz.bi.cmcore.model.CMProxyEffect;
import biz.bi.cmcore.model.CMProxyRiskObject;
import biz.bi.vtcd.model.VTCDFigureElement;
import biz.bi.vtcd.provider.VTCDEditPlugin;
import biz.bi.vtcd.provider.VTCDImages;

/**
* This code was generated using CloudGarden's Jigloo
* SWT/Swing GUI Builder, which is free for non-commercial
* use. If Jigloo is being used commercially (ie, by a corporation,
* company or business for any purpose whatever) then you
* should purchase a license for each developer using Jigloo.
* Please visit www.cloudgarden.com for details.
* Use of Jigloo implies acceptance of these licensing terms.
* *************************************
* A COMMERCIAL LICENSE HAS NOT BEEN PURCHASED
* for this machine, so Jigloo or this code cannot be used legally
* for any corporate or commercial purpose.
* *************************************
*/
public class VTCDCombinationEditDialog extends org.eclipse.swt.widgets.Dialog {

	private Shell dialogShell;
	private CTabFolder cTabFolderCombination;
	private Group groupAllowedTC;
	private StyledText styledTextCombinTC;
	private Group groupCombinTC;
	private StyledText styledTextAllowedTC;
	private Button buttonPassTC;
	private CTabItem cTabItemEditCombination;
	private CTabItem cTabItemAssignTestCase;
	private CTabItem cTabItemAssignEffect;
	private Button buttonOK;
	private Button backwardButton;
	private Button buttonReturnTC;
	private Composite composite2;
	private Button buttonAllBackward;
	private Button buttonAllForward;
	private List m_AssignedEffects;
	private List m_AvailableEffects;
	private Button forwardButton;
	private Group groupEffects;
	private Group groupAvailaEffects;
	private Composite composite1;
	private Label labelRiskLevel;
	private Label labeState;
	private Button buttonCancel;
	private StyledText styledTextDescription;
	private Group groupDescription;
	private Combo comboRiskLevel;
	private Combo comboState;
	private Text textCombinationName;
	private Label labelID;
	private Group groupEditComb;

	
	private boolean m_Cancelled = false;
	private boolean m_OK = false;
	
	private String m_StateString="+";
    private String m_RiskLevelString="0";
    private String m_DescriptionString=""; 
    private String m_IdString="";
    private int m_StateIndex=0;
    private java.util.List m_lEffectList;
    private java.util.List  m_lAvailableEffectList;
	/**
	* Auto-generated main method to display this 
	* org.eclipse.swt.widgets.Dialog inside a new Shell.
	*/
	public static void main(String[] args) {
		try {
			Display display = Display.getDefault();
			Shell shell = new Shell(display);
			VTCDCombinationEditDialog inst = new VTCDCombinationEditDialog(shell, SWT.NULL);
			inst.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public VTCDCombinationEditDialog(Shell parent, int style) {
		super(parent, style);
		m_lEffectList = new Vector();
        m_lAvailableEffectList = new Vector();
       
	}

	public void open() {
		try {
			Shell parent = getParent();
			dialogShell = new Shell(parent, SWT.DIALOG_TRIM | SWT.APPLICATION_MODAL);
			
			 Rectangle parentSize = dialogShell.getParent().getBounds(); 
			 Rectangle mySize = dialogShell.getBounds(); 

			 int locationX, locationY; 
			 locationX = (parentSize.width - mySize.width)/2+parentSize.x; 
			 locationY = (parentSize.height - mySize.height)/2+parentSize.y; 

			 dialogShell.setLocation(locationX, locationY); 
			    
		
			{
				cTabFolderCombination = new CTabFolder(dialogShell, SWT.NONE);
				{
					cTabItemEditCombination = new CTabItem(cTabFolderCombination, SWT.NONE);
					cTabItemEditCombination.setText("Edit Combination");
					{
						groupEditComb = new Group(
							cTabFolderCombination,
							SWT.NONE);
						FormLayout groupEditCombLayout = new FormLayout();
						groupEditComb.setLayout(groupEditCombLayout);
						cTabItemEditCombination.setControl(groupEditComb);
						groupEditComb.setText("Combination");
						{
							labelRiskLevel = new Label(groupEditComb, SWT.RIGHT);
							FormData labelRiskLevelLData = new FormData();
							labelRiskLevelLData.width = 60;
							labelRiskLevelLData.height = 17;
							labelRiskLevelLData.left =  new FormAttachment(0, 1000, 351);
							labelRiskLevelLData.top =  new FormAttachment(0, 1000, 33);
							labelRiskLevel.setLayoutData(labelRiskLevelLData);
							labelRiskLevel.setText("Risk Level");
						}
						{
							labeState = new Label(groupEditComb, SWT.RIGHT);
							FormData labeStateLData = new FormData();
							labeStateLData.width = 67;
							labeStateLData.height = 13;
							labeStateLData.left =  new FormAttachment(0, 1000, 345);
							labeStateLData.top =  new FormAttachment(0, 1000, 6);
							labeState.setLayoutData(labeStateLData);
							labeState.setText("State");
						}
						{
							groupDescription = new Group(
								groupEditComb,
								SWT.NONE);
							GridLayout groupDescriptionLayout = new GridLayout();
							groupDescriptionLayout.makeColumnsEqualWidth = true;
							groupDescription.setLayout(groupDescriptionLayout);
							FormData groupDescriptionLData = new FormData();
							groupDescriptionLData.width = 589;
							groupDescriptionLData.height = 116;
							groupDescriptionLData.left =  new FormAttachment(0, 1000, 6);
							groupDescriptionLData.top =  new FormAttachment(0, 1000, 67);
							groupDescription.setLayoutData(groupDescriptionLData);
							groupDescription.setText("Description");
							{
								GridData styledTextDescriptionLData = new GridData();
								styledTextDescriptionLData.widthHint = 570;
								styledTextDescriptionLData.heightHint = 105;
								styledTextDescription = new StyledText(
									groupDescription,
									SWT.BORDER);
								styledTextDescription.setLayoutData(styledTextDescriptionLData);
								styledTextDescription.setText(getDescriptionString());
							}
						}
						{
							labelID = new Label(groupEditComb, SWT.NONE);
							FormData labelIDLData = new FormData();
							labelIDLData.width = 23;
							labelIDLData.height = 22;
							labelIDLData.left =  new FormAttachment(13, 1000, 0);
							labelIDLData.right =  new FormAttachment(55, 1000, 0);
							labelIDLData.top =  new FormAttachment(126, 1000, 0);
							labelIDLData.bottom =  new FormAttachment(331, 1000, 0);
							labelID.setLayoutData(labelIDLData);
							labelID.setText("ID");
						}
						{
							FormData textCombinationNameLData = new FormData();
							textCombinationNameLData.width = 126;
							textCombinationNameLData.height = 15;
							textCombinationNameLData.left =  new FormAttachment(53, 1000, 0);
							textCombinationNameLData.right =  new FormAttachment(281, 1000, 0);
							textCombinationNameLData.top =  new FormAttachment(117, 1000, 0);
							textCombinationNameLData.bottom =  new FormAttachment(218, 1000, 0);
							textCombinationName = new Text(
								groupEditComb,
								SWT.READ_ONLY | SWT.BORDER);
							textCombinationName.setLayoutData(textCombinationNameLData);
							textCombinationName.setText(m_IdString);
						}
						{
							comboState = new Combo(groupEditComb, SWT.READ_ONLY);
							FormData comboStateLData = new FormData();
							comboStateLData.width = -1;
							comboStateLData.height = 21;		
							comboStateLData.top =  new FormAttachment(0, 1000, 4);
							comboStateLData.left =  new FormAttachment(0, 1000, 422);

							comboState.setLayoutData(comboStateLData);	
						//	comboState.setItems(new java.lang.String[] {"+","-","F","I"});
							//this.setM_State(new );
							this.setM_State(CMProxyRiskObject.STATE_NAMES);
							comboState.setText(getStateString());
						}
						{
							comboRiskLevel = new Combo(groupEditComb, SWT.READ_ONLY);
							FormData comboRiskLevelLData = new FormData(15, 21);
							comboRiskLevelLData.width = -1;
							comboRiskLevelLData.height = 21;
							comboRiskLevelLData.left =  new FormAttachment(0, 1000, 421);
							comboRiskLevelLData.top =  new FormAttachment(0, 1000, 32);
							comboRiskLevel.setLayoutData(comboRiskLevelLData);							
							this.setM_RiskLevel(CMProxyRiskObject.RISK_LEVELS);						
							comboRiskLevel.setText(new Integer(getRiskLevelString()).toString());
							comboRiskLevel.setSize(15, 21);

						}
					}
				}
				{
					cTabItemAssignEffect = new CTabItem(cTabFolderCombination, SWT.NONE);
					cTabItemAssignEffect.setText("Assign Effect");
					{
						composite1 = new Composite(
							cTabFolderCombination,
							SWT.NONE);
						FormLayout composite1Layout = new FormLayout();
						composite1.setLayout(composite1Layout);
						cTabItemAssignEffect.setControl(composite1);
						{
							buttonAllBackward = new Button(composite1, SWT.PUSH
								| SWT.CENTER);
							FormData buttonAllBackwardLData = new FormData();
							buttonAllBackwardLData.width = 60;
							buttonAllBackwardLData.height = 26;
							buttonAllBackwardLData.left =  new FormAttachment(0, 1000, 271);
							buttonAllBackwardLData.top =  new FormAttachment(0, 1000, 166);
							buttonAllBackward.setLayoutData(buttonAllBackwardLData);
							buttonAllBackward.setText("<<");
							
							buttonAllBackward.addMouseListener(new MouseListener() {
					            public void mouseDoubleClick(MouseEvent e) {
					            }
					            public void mouseDown(MouseEvent e) {
					            }
					            public void mouseUp(MouseEvent e) {
					            	
					            	for (int i = 0; i < m_AssignedEffects.getItemCount(); i++) {
										m_AvailableEffects.add(m_AssignedEffects.getItem(i));
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
									
									
									m_AssignedEffects.removeAll();
					            	
					            }
					        });
						}
						{
							buttonAllForward = new Button(composite1, SWT.PUSH
								| SWT.CENTER);
							FormData buttonAllForwardLData = new FormData();
							buttonAllForwardLData.width = 60;
							buttonAllForwardLData.height = 26;
							buttonAllForwardLData.left =  new FormAttachment(0, 1000, 272);
							buttonAllForwardLData.top =  new FormAttachment(0, 1000, 134);
							buttonAllForward.setLayoutData(buttonAllForwardLData);
							buttonAllForward.setText(">>");
							buttonAllForward.addMouseListener(new MouseListener() {
					            public void mouseDoubleClick(MouseEvent e) {
					            }
					            public void mouseDown(MouseEvent e) {
					            }
					            public void mouseUp(MouseEvent e) {
					            	
					            	for (int i = 0; i < m_AvailableEffects.getItemCount(); i++) {
										m_AssignedEffects.add(m_AvailableEffects.getItem(i));
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
									
										m_AvailableEffects.removeAll();
									
					            	
					            }
					        });
						}
						{
							backwardButton = new Button(composite1, SWT.PUSH
								| SWT.CENTER);
							FormData buttonReturnLData = new FormData();
							buttonReturnLData.width = 60;
							buttonReturnLData.height = 26;
							buttonReturnLData.left =  new FormAttachment(0, 1000, 272);
							buttonReturnLData.top =  new FormAttachment(0, 1000, 101);
							backwardButton.setLayoutData(buttonReturnLData);
							backwardButton.setText("<");
							
							backwardButton.addMouseListener(new MouseListener() {
					            public void mouseDoubleClick(MouseEvent e) {
					            }
					            public void mouseDown(MouseEvent e) {
					            }
					            public void mouseUp(MouseEvent e) {
					            	if ((m_AssignedEffects.getItemCount() != 0) && (m_AssignedEffects.getSelectionIndex()>-1)){
										for (int i = 0; i < m_AssignedEffects.getItemCount(); i++) {
											if (m_AssignedEffects.isSelected(i))
											{
												
												m_AvailableEffects.add(m_AssignedEffects.getItem(i));
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
										
										m_AssignedEffects.remove(m_AssignedEffects.getSelectionIndices());
										
									}
									
					            }
					        });
						}
						{
							forwardButton = new Button(composite1, SWT.PUSH
								| SWT.CENTER);
							FormData buttonGoLData = new FormData();
							buttonGoLData.width = 60;
							buttonGoLData.height = 28;
							buttonGoLData.left =  new FormAttachment(0, 1000, 271);
							buttonGoLData.top =  new FormAttachment(0, 1000, 67);
							forwardButton.setLayoutData(buttonGoLData);
							forwardButton.setText(">");
							
							forwardButton.addMouseListener(new MouseListener() {
					            public void mouseDoubleClick(MouseEvent e) {
					            }
					            public void mouseDown(MouseEvent e) {
					            }
					            public void mouseUp(MouseEvent e) {
					            	if((m_AvailableEffects.getItemCount() != 0)&&(m_AvailableEffects.getSelectionIndex()>-1)){
										
										for (int i = 0; i < m_AvailableEffects.getItemCount(); i++) {
											if(m_AvailableEffects.isSelected(i)){
												
												m_AssignedEffects.add(m_AvailableEffects.getItem(i));
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
											m_AvailableEffects.remove(m_AvailableEffects.getSelectionIndices());	
										}
									
								
					            }
					        });
							
							///
							
						}
						{
							groupAvailaEffects = new Group(composite1, SWT.NONE);
							FormLayout group1Layout = new FormLayout();
							groupAvailaEffects.setLayout(group1Layout);
							FormData group1LData = new FormData();
							group1LData.width = 239;
							group1LData.height = 156;
							group1LData.left =  new FormAttachment(30, 1000, 0);
							group1LData.right =  new FormAttachment(430, 1000, 0);
							group1LData.top =  new FormAttachment(136, 1000, 0);
							group1LData.bottom =  new FormAttachment(904, 1000, 0);
							groupAvailaEffects.setLayoutData(group1LData);
							groupAvailaEffects.setText("Availables Effects");
							{
								FormData styledTextEffectsLData = new FormData();
								styledTextEffectsLData.width = 224;
								styledTextEffectsLData.height = 146;
								styledTextEffectsLData.left =  new FormAttachment(23, 1000, 0);
								styledTextEffectsLData.right =  new FormAttachment(976, 1000, 0);
								styledTextEffectsLData.top =  new FormAttachment(28, 1000, 0);
								styledTextEffectsLData.bottom =  new FormAttachment(990, 1000, 0);
								m_AvailableEffects = new List(
									groupAvailaEffects,
									SWT.BORDER | SWT.H_SCROLL | SWT.MULTI);
								m_AvailableEffects.setLayoutData(styledTextEffectsLData);
								
								for (Iterator i = m_lAvailableEffectList.iterator();i.hasNext();)
						        {
						        	CMProxyEffect effect = ((CMProxyEffect)i.next());
						        	if (!this.m_lEffectList.contains(effect))
									this.m_AvailableEffects.add(effect.getName());
						        }
						       
						        

							}
						}
						{
							groupEffects = new Group(composite1, SWT.NONE);
							FormLayout group2Layout = new FormLayout();
							groupEffects.setLayout(group2Layout);
							FormData group2LData = new FormData(239, 156);
							group2LData.width = 239;
							group2LData.height = 156;
							group2LData.left =  new FormAttachment(559, 1000, 0);
							group2LData.right =  new FormAttachment(958, 1000, 0);
							group2LData.top =  new FormAttachment(136, 1000, 0);
							group2LData.bottom =  new FormAttachment(886, 1000, 0);
							groupEffects.setLayoutData(group2LData);
							groupEffects.setText("Assigned Effects");
							groupEffects.setSize(245, 172);
							{
								FormData styledTextAvailEffLData = new FormData(224, 142);
								styledTextAvailEffLData.width = 228;
								styledTextAvailEffLData.height = 150;
								styledTextAvailEffLData.left =  new FormAttachment(31, 1000, 0);
								styledTextAvailEffLData.right =  new FormAttachment(981, 1000, 0);
								styledTextAvailEffLData.top =  new FormAttachment(29, 1000, 0);
								styledTextAvailEffLData.bottom =  new FormAttachment(990, 1000, 0);
								m_AssignedEffects = new List(
									groupEffects,
									SWT.BORDER | SWT.H_SCROLL | SWT.MULTI);
								m_AssignedEffects.setLayoutData(styledTextAvailEffLData);							
								m_AssignedEffects.setSize(224, 142);								
						
								for (Iterator i = m_lEffectList.iterator();i.hasNext();)
									this.m_AssignedEffects.add(((CMProxyEffect)i.next()).getName());
									
							}
						}
					}
				}
				{
					cTabItemAssignTestCase = new CTabItem(
						cTabFolderCombination,
						SWT.NONE);
					cTabItemAssignTestCase.setText("Assign to Test Case");
					{
						composite2 = new Composite(
							cTabFolderCombination,
							SWT.NONE);
						cTabItemAssignTestCase.setControl(composite2);
						FormLayout composite2Layout = new FormLayout();
						composite2.setLayout(composite2Layout);
						{
							buttonReturnTC = new Button(composite2, SWT.PUSH
								| SWT.CENTER);
							FormData button1LData = new FormData();
							button1LData.width = 60;
							button1LData.height = 26;
							button1LData.left = new FormAttachment(0, 1000, 272);
							button1LData.top = new FormAttachment(0, 1000, 115);
							buttonReturnTC.setLayoutData(button1LData);
							buttonReturnTC.setText("<");
						}
						{
							buttonPassTC = new Button(composite2, SWT.PUSH
								| SWT.CENTER);
							FormData button2LData = new FormData();
							button2LData.width = 60;
							button2LData.height = 28;
							button2LData.left = new FormAttachment(0, 1000, 271);
							button2LData.top = new FormAttachment(0, 1000, 67);
							buttonPassTC.setLayoutData(button2LData);
							buttonPassTC.setText(">");
						}
						{
							groupAllowedTC = new Group(composite2, SWT.NONE);
							FormLayout group1Layout1 = new FormLayout();
							groupAllowedTC.setLayout(group1Layout1);
							FormData group1LData1 = new FormData();
							group1LData1.width = 239;
							group1LData1.height = 156;
							group1LData1.left =  new FormAttachment(30, 1000, 0);
							group1LData1.right =  new FormAttachment(430, 1000, 0);
							group1LData1.top =  new FormAttachment(136, 1000, 0);
							group1LData1.bottom =  new FormAttachment(904, 1000, 0);
							groupAllowedTC.setLayoutData(group1LData1);
							groupAllowedTC.setText("Allowed Test Cases");
							{
								styledTextAllowedTC = new StyledText(groupAllowedTC, SWT.BORDER);
								FormData styledText1LData = new FormData();
								styledText1LData.width = 224;
								styledText1LData.height = 146;
								styledText1LData.left = new FormAttachment(
									23,
									1000,
									0);
								styledText1LData.right = new FormAttachment(
									976,
									1000,
									0);
								styledText1LData.top = new FormAttachment(
									28,
									1000,
									0);
								styledText1LData.bottom = new FormAttachment(
									990,
									1000,
									0);
								styledTextAllowedTC.setLayoutData(styledText1LData);
								styledTextAllowedTC.setOrientation(SWT.VERTICAL);
								styledTextAllowedTC.setEditable(false);
							}
						}
						{
							groupCombinTC = new Group(composite2, SWT.NONE);
							FormLayout group2Layout1 = new FormLayout();
							groupCombinTC.setLayout(group2Layout1);
							groupCombinTC.setText("Combination in Test Cases");
							FormData group2LData1 = new FormData(239, 156);
							group2LData1.width = 239;
							group2LData1.height = 156;
							group2LData1.left =  new FormAttachment(559, 1000, 0);
							group2LData1.right =  new FormAttachment(958, 1000, 0);
							group2LData1.top =  new FormAttachment(136, 1000, 0);
							group2LData1.bottom =  new FormAttachment(886, 1000, 0);
							groupCombinTC.setLayoutData(group2LData1);
							groupCombinTC.setSize(245, 172);
							{
								styledTextCombinTC = new StyledText(groupCombinTC, SWT.BORDER);
								styledTextCombinTC.setOrientation(SWT.VERTICAL);
								FormData styledText2LData = new FormData(
									220,
									138);
								styledText2LData.width = 220;
								styledText2LData.height = 138;
								styledText2LData.left = new FormAttachment(
									31,
									1000,
									0);
								styledText2LData.right = new FormAttachment(
									981,
									1000,
									0);
								styledText2LData.top = new FormAttachment(
									29,
									1000,
									0);
								styledText2LData.bottom = new FormAttachment(
									990,
									1000,
									0);
								styledTextCombinTC.setLayoutData(styledText2LData);
								styledTextCombinTC.setSize(224, 142);
								styledTextCombinTC.setEditable(false);
							}
						}
					}
					FormData cTabFolderCombinationLData = new FormData();
					cTabFolderCombinationLData.width = 612;
					cTabFolderCombinationLData.height = 224;
					cTabFolderCombinationLData.left =  new FormAttachment(7, 1000, 0);
					cTabFolderCombinationLData.right =  new FormAttachment(997, 1000, 0);
					cTabFolderCombinationLData.top =  new FormAttachment(8, 1000, 0);
					cTabFolderCombinationLData.bottom =  new FormAttachment(865, 1000, 0);
					cTabFolderCombination.setLayoutData(cTabFolderCombinationLData);
					cTabFolderCombination.setSelection(0);
				}
			}
			FormLayout dialogShellLayout = new FormLayout();
			dialogShell.setLayout(dialogShellLayout);
			{
				buttonCancel = new Button(dialogShell, SWT.PUSH | SWT.CENTER);
				FormData buttonCancelLData = new FormData();
				buttonCancelLData.width = 70;
				buttonCancelLData.height = 23;
				buttonCancelLData.left =  new FormAttachment(0, 1000, 215);
				buttonCancelLData.top =  new FormAttachment(0, 1000, 255);
				buttonCancel.setLayoutData(buttonCancelLData);
				buttonCancel.setText("Cancel");
				buttonCancel.addMouseListener(new MouseListener() {
					
					public void mouseDoubleClick(MouseEvent p_e) {		
					}
					public void mouseDown(MouseEvent p_e) {	
					}
					public void mouseUp(MouseEvent p_e) {
						// TODO Auto-generated method stub
						dialogShell.close();
					}
					
				});
				buttonOK = new Button(dialogShell, SWT.PUSH | SWT.CENTER);
				FormData buttonOKLData = new FormData();
				buttonOKLData.width = 72;
				buttonOKLData.height = 24;
				buttonOKLData.left =  new FormAttachment(0, 1000, 315);
				
				buttonOKLData.top =  new FormAttachment(0, 1000, 255);
				
				buttonOK.setLayoutData(buttonOKLData);
				buttonOK.setText("OK");
				buttonOK.addMouseListener(new MouseListener() {
					
					public void mouseDoubleClick(MouseEvent p_e) {		
					}
					public void mouseDown(MouseEvent p_e) {	
					}
					public void mouseUp(MouseEvent p_e) {
						// TODO Auto-generated method stub
						buttonOKPressed();
						dialogShell.close();
					}
					
				});
			}
			dialogShell.layout();
			dialogShell.pack();
			dialogShell.setSize(630, 321);
			dialogShell.setText("Visual Test Cases Design - Combination");
			dialogShell.open();
			Display display = dialogShell.getDisplay();
			while (!dialogShell.isDisposed()) {
				if (!display.readAndDispatch())
					display.sleep();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void close() {
		dialogShell.close();
	}	

	public String getIdString() {
		return this.m_IdString;
	}

	
	public void setIdString(String p_idString) {
		this.m_IdString = p_idString;		
	}
	
	public java.util.List getAvailableEffectList() {
		return this.m_lEffectList;
	}
	
	public void setAvailableEffectList(java.util.List p_availableEffectList) {
		this.m_lAvailableEffectList.addAll(p_availableEffectList) ;
	}
	
	public java.util.List getEffectList() {
		return this.m_lEffectList;
	}
	
	public void setEffectList(java.util.List p_effectList) {
		this.m_lEffectList.addAll(p_effectList);
	}
	
	private void setM_State(String[] p_State) {
		comboState.setItems(p_State);
	}
	
	
	
	private void setM_RiskLevel(String[] p_risklevel){
		comboRiskLevel.setItems(p_risklevel);
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

	public String getStateString() {
		return this.m_StateString;
	}
	
	public void setStateString(int p_i) {
		this.m_StateString = CMProxyRiskObject.STATE_NAMES[p_i];
	}
	
	public int getIndexFromString(String p_StateString){
		int index=0;
		for(int i=0;i<comboState.getItemCount();i++){
			if (comboState.getItem(i).equals(p_StateString)){
				index=i;
				setStateValue(index);
				break;
			}
		}
		return index;
	}
	public String getRiskLevelString() {
		return this.m_RiskLevelString;
	}
	
	public int getRiskLevelValue() {
		return new Integer(this.m_RiskLevelString).intValue();
	}	
	
	public void setRiskLevelString(String p_riskLevelString) {
		this.m_RiskLevelString = p_riskLevelString;
	}
	
	public void setStateValue(int p_StateValue) {		
		this.m_StateIndex = p_StateValue;
	}
	
	public int getStateValue() {
		
		return this.m_StateIndex;
	}
	
	public boolean isCancelled() {
		return this.m_Cancelled;
	}
	
	public boolean isOK() {
		return this.m_OK;
	}
	
	public boolean enabledButton(){
		return m_Cancelled;
		
	}
	
	public void setCancelled(boolean p_cancelled) {
		this.m_Cancelled = p_cancelled;
	}
	
	public void setOK(boolean p_OK) {
		this.m_OK = p_OK;
	}
	public void buttonOKPressed () {
		this.setOK(true);
		this.setCancelled(false);
		this.setDescriptionString(styledTextDescription.getText());			
		this.setRiskLevelString(this.comboRiskLevel.getText());
		this.setStateString(getIndexFromString(this.comboState.getText()));
		this.setAvailableEffectList(m_lAvailableEffectList);
		this.setEffectList(m_lEffectList);
		
	}
	
}
