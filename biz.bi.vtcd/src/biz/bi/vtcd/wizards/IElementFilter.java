/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.wizards;

import java.util.Collection;

import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @author hcanedo
 * @24-08-2005
 * @hcanedo
 */
public interface IElementFilter {
	 public void filterElements(Collection elements, IProgressMonitor monitor)
     throws InterruptedException;

public void filterElements(Object[] elements, IProgressMonitor monitor)
     throws InterruptedException;

}
