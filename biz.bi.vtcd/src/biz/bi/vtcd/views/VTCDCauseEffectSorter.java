/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vtcd.views;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerSorter;

import biz.bi.cmcore.model.CMProxyEffect;

/**
 * @author hcanedo
 * @05-08-2005
 * @hcanedo
 */
public class VTCDCauseEffectSorter extends ViewerSorter {
	private int[] directions;
    private int[] priorities;
    final static int NAME = 0;
    final static int DESCRIPTION = 1;
    final static int USED = 2;
    final static int ASCENDING = 1;
    final static int DESCENDING = -1;
    final static int[] DEFAULT_PRIORITIES = { NAME, DESCRIPTION, USED};
    final static int[] DEFAULT_DIRECTIONS = { ASCENDING, //name
        ASCENDING, //Description
        ASCENDING};//Used

	/**
	 * 
	 */
	public VTCDCauseEffectSorter() {
		super();
		resetState();
	}

	public void resetState() {
        priorities = new int[DEFAULT_PRIORITIES.length];
        System.arraycopy(DEFAULT_PRIORITIES, 0, priorities, 0,
                priorities.length);
        directions = new int[DEFAULT_DIRECTIONS.length];
        System.arraycopy(DEFAULT_DIRECTIONS, 0, directions, 0,
                directions.length);
    }
	public void reverseTopPriority() {
        directions[priorities[0]] *= -1;
    }
	public void setTopPriority(int priority) {
        if (priority < 0 || priority >= priorities.length)
            return;

        int index = -1;
        for (int i = 0; i < priorities.length; i++) {
            if (priorities[i] == priority)
                index = i;
        }

        if (index == -1) {
            resetState();
            return;
        }

        //shift the array
        for (int i = index; i > 0; i--) {
            priorities[i] = priorities[i - 1];
        }
        priorities[0] = priority;
        directions[priority] = DEFAULT_DIRECTIONS[priority];
    }
	public void setTopPriorityDirection(int direction) {
        if (direction == ASCENDING || direction == DESCENDING)
            directions[priorities[0]] = direction;
    }
	public int getTopPriorityDirection() {
        return directions[priorities[0]];
    }

    public int getTopPriority() {
        return priorities[0];
    }

    public int[] getPriorities() {
        return priorities;
    }
    public int compare(Viewer viewer, Object e1, Object e2) {
    	CMProxyEffect effect1=(CMProxyEffect)e1;
    	CMProxyEffect effect2=(CMProxyEffect)e2;
    	return compare(effect1,effect2,0);
    }
    public int compare(CMProxyEffect e1, CMProxyEffect e2, int depth){
    	if (depth >= priorities.length)
            return 0;

        int column = priorities[depth];
        switch (column) {
        case NAME: {
        	String name1=e1.getName();
        	String name2=e2.getName();
        	int result = collator.compare(name1, name2);
            if (result == 0)
                return compare(e1, e2, depth + 1);
            return result * directions[column];
        }
        case DESCRIPTION: {
        	String description1=e1.getDescription();
        	String description2=e2.getDescription();
        	int result = collator.compare(description1, description2);
            if (result == 0)
                return compare(e1, e2, depth + 1);
            return result * directions[column];
        }
        case USED: {
        	String used1=Boolean.toString(e1.isUsed());
        	String used2=Boolean.toString(e2.isUsed());
        	int result = collator.compare(used1, used2);
            if (result == 0)
                return compare(e1, e2, depth + 1);
            return result * directions[column];
  
        }
        }
        return 0;
    }
}
