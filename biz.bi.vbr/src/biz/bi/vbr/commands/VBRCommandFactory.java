/**
 * 
 * This Software has been developed by Business Software Innovations  .
 * Copyright (c)2003 Díaz und Hilterscheid Unternehmensberatung. All rights reserved.
 */
package biz.bi.vbr.commands;

/**
 * @author hcanedo
 * @since 20-09-2005
 */
public interface VBRCommandFactory {
	
	VBRCommandFactory INSTANCE= new VBRCommandFactoryImpl();

}
