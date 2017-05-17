package com.etong.MyBatisTool;

import java.util.Properties;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.internal.DefaultCommentGenerator;

public class MyCommentGenerator extends DefaultCommentGenerator {

	public MyCommentGenerator(){
		super();
	}


	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
	    if (introspectedColumn.getRemarks() != null && !introspectedColumn.getRemarks().equals("")) {
	    	String desc = introspectedColumn.getRemarks();
	    	if(desc.contains("\n")){
	    		System.out.println(desc);
	    		desc = desc.replace("\n", "\n        ");
	    	}
	    	field.addJavaDocLine("/** "+desc+" */");
	        
//	        field.addJavaDocLine(" * " + introspectedColumn.getRemarks());
////	        addJavadocTag(field, false);
//	        field.addJavaDocLine(" */");
	    }
	}


}
