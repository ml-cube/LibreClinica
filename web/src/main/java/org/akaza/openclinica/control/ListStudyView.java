/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.control;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.servlet.http.HttpServletRequest;

import org.akaza.openclinica.i18n.util.ResourceBundleProvider;
import org.jmesa.view.html.HtmlBuilder;
import org.jmesa.view.html.HtmlSnippets;

public class ListStudyView  extends DefaultView{
	
	
	   private final ResourceBundle resword;
	   private boolean showTitle= false;

	public ListStudyView(Locale locale,HttpServletRequest request)
	{
		 resword = ResourceBundleProvider.getWordsBundle(locale);
		 if(request.getRequestURI().contains("MainMenu"))
         	showTitle = true;
		 
	}
	
	public Object render() {
	        HtmlSnippets snippets = getHtmlSnippets();
	        HtmlBuilder html = new HtmlBuilder();
	    
	        html.append(snippets.themeStart());
	        html.append(snippets.tableStart());
	      
	        html.append(snippets.theadStart());
	        
	        html.append(customHeader());
	        html.append(snippets.toolbar());
	        html.append(snippets.header());
	        html.append(snippets.filter());
	        html.append(snippets.theadEnd());
	        html.append(snippets.tbodyStart());
	        setCustomCellEditors();
	        html.append(snippets.body());
	        html.append(snippets.tbodyEnd());
	        html.append(snippets.footer());
	        html.append(snippets.statusBar());
	        html.append(snippets.tableEnd());
	        html.append(snippets.themeEnd());
	        html.append(snippets.initJavascriptLimit());
	        return html.toString();
	    }
	    /**
	     * Setting the group cell editor.
	     */
	    private void setCustomCellEditors(){
	    	getTable().setCaption("Subject Enrollment");	     
	    }
	        private String customHeader(){
	        		
	        	HtmlBuilder html = new HtmlBuilder();
	        	
	        		        html.tr(1).styleClass("header").width("100%").close();
	        		        if(showTitle)
	        		        html.td(0).style("border-bottom: 1px solid white;background-color:white;color:black;").align("center").close().append(resword.getString("subject_matrix")).tdEnd();
	        		        
	        		        html.trEnd(1);
	        	
	        		       
	        		        return html.toString();
	        		    }

}
