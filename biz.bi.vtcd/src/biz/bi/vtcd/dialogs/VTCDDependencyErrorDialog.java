/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.dialogs;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.text.MessageFormat;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.PluginVersionIdentifier;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import biz.bi.vtcd.provider.VTCDEditPlugin;



/**
 * @author svonborries
 * @01-08-2005
 * @svonborries
 */
public class VTCDDependencyErrorDialog extends AbstractDetailsDialog {

	   private final Object details;
	   
	   public VTCDDependencyErrorDialog(Shell parentShell, String title, Image image, String message, Object details, Image imageTitle) {

			      super(parentShell, getTitle(title, details), getImage(image, details), getMessage(message, details), imageTitle);

			      this.details = details;
	}

	   protected Control createDetailsArea(Composite parent) {

		      // create the details area
		      Composite panel = new Composite(parent, SWT.NONE);
		      panel.setLayoutData(new GridData(GridData.FILL_BOTH));
		      GridLayout layout = new GridLayout();
		      layout.marginHeight = 0;
		      layout.marginWidth = 0;
		      panel.setLayout(layout);

		      // create the details content
		      createProductInfoArea(panel);
		      createDetailsViewer(panel);
		      
		      return panel;
		   }

	   protected Composite createProductInfoArea(
			      Composite parent) {

			      Composite composite = new Composite(parent, SWT.NULL);
			      composite.setLayoutData(new GridData());
			      GridLayout layout = new GridLayout();
			      layout.numColumns = 2;
			      layout.marginWidth =
			         convertHorizontalDLUsToPixels(
			            IDialogConstants.HORIZONTAL_MARGIN);
			      composite.setLayout(layout);

			      new Label(composite, SWT.NONE).setText("Provider:");
			      new Label(composite, SWT.NONE).setText(
			    		  VTCDEditPlugin.INSTANCE.getString("providerName"));
			      new Label(composite, SWT.NONE).setText(
			         "Plug-in Name:");
			      new Label(composite, SWT.NONE).setText(
			    		 VTCDEditPlugin.INSTANCE.getString("pluginName"));
			      new Label(composite, SWT.NONE).setText("Plug-in ID:");
			      new Label(composite, SWT.NONE).setText(
			    		  VTCDEditPlugin.getPlugin().getSymbolicName());
			    	
			      new Label(composite, SWT.NONE).setText("Version:");
			      String version = (String) VTCDEditPlugin.getPlugin().getBundle().getHeaders().get(org.osgi.framework.Constants.BUNDLE_VERSION);
			      new PluginVersionIdentifier(version); 
			      new Label(composite, SWT.NONE).setText(version);
			    		  

			      return composite;
			   }

	
	   protected Control createDetailsViewer(Composite parent) {
		      if (details == null)
		         return null;

		      Text text =
		         new Text(
		            parent,
		            SWT.MULTI
		               | SWT.READ_ONLY
		               | SWT.BORDER
		               | SWT.H_SCROLL
		               | SWT.V_SCROLL);
		      text.setLayoutData(new GridData(GridData.FILL_BOTH));

		      // Create the content
		      StringWriter writer = new StringWriter(1000);
		      if (details instanceof Throwable)
		         appendException(
		            new PrintWriter(writer),
		            (Throwable) details);
		      else if (details instanceof IStatus)
		         appendStatus(
		            new PrintWriter(writer),
		            (IStatus) details,
		            0);
		      text.setText(writer.toString());

		      return text;
		   }

	   public static String getTitle(
			      String title,
			      Object details) {

			      if (title != null)
			         return title;
			      if (details instanceof Throwable) {
			         Throwable e = (Throwable) details;
			         while (e instanceof InvocationTargetException)
			            e =
			               ((InvocationTargetException) e)
			                  .getTargetException();
			         String name = e.getClass().getName();
			         return name.substring(name.lastIndexOf('.') + 1);
			      }
			      return "Exception";
			   }

	   public static Image getImage(
			      Image image,
			      Object details) {

			      if (image != null)
			         return image;
			      ImageRegistry imageRegistry =
			         JFaceResources.getImageRegistry();
			      if (details instanceof IStatus) {
			         switch (((IStatus) details).getSeverity()) {
			            case IStatus.ERROR :
			               return imageRegistry.get(
			                  Dialog.DLG_IMG_MESSAGE_ERROR);
			            case IStatus.WARNING :
			               return imageRegistry.get(
			                  Dialog.DLG_IMG_MESSAGE_WARNING);
			            case IStatus.INFO :
			               return imageRegistry.get(
			                  Dialog.DLG_IMG_MESSAGE_INFO);
			            case IStatus.OK :
			               return null;
			         }
			      }
			      return imageRegistry.get(Dialog.DLG_IMG_MESSAGE_ERROR);
			   }

	   public static String getMessage(
			      String message,
			      Object details) {

			      if (details instanceof Throwable) {
			         Throwable e = (Throwable) details;
			         while (e instanceof InvocationTargetException)
			            e = ((InvocationTargetException) e)
			                  .getTargetException();
			         if (message == null)
			            return e.toString();
			         return MessageFormat.format(
			            message,
			            new Object[] { VTCDEditPlugin.INSTANCE.getString("_UI_VTCDDependencyErrorDialog_DefaultUserError")});
			      }
			      if (details instanceof IStatus) {
			         String statusMessage =
			            ((IStatus) details).getMessage();
			         if (message == null)
			            return statusMessage;
			         return MessageFormat.format(
			            message,
			            new Object[] { statusMessage });
			      }
			      if (message != null)
			         return message;
			      return "An Exception occurred.";
			   }

	   public static void appendException(
			      PrintWriter writer,
			      Throwable ex) {
			      if (ex instanceof CoreException) {
			         appendStatus(
			            writer,
			            ((CoreException) ex).getStatus(),
			            0);
			         writer.println();
			      }
			      appendStackTrace(writer, ex);
			      if (ex instanceof InvocationTargetException)
			         appendException(
			            writer,
			            ((InvocationTargetException) ex)
			               .getTargetException());
			   }

	   public static void appendStatus(
			      PrintWriter writer,
			      IStatus status,
			      int nesting) {
			      for (int i = 0; i < nesting; i++)
			         writer.print("  ");
			      writer.println(status.getMessage());
			      IStatus[] children = status.getChildren();
			      for (int i = 0; i < children.length; i++)
			         appendStatus(writer, children[i], nesting + 1);
			   }

	   public static void appendStackTrace(
			      PrintWriter writer,
			      Throwable ex) {
			      ex.printStackTrace(writer);
			   }

	   
	   
}
