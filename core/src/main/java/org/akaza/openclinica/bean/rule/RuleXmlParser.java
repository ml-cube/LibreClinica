/*
 * I3LUNG is distributed under the
 * GNU Lesser General Public License (GNU LGPL).

 * For details see: https://I3LUNG.org/license
 * I3LUNG, copyright (C) 2020
 */
package org.akaza.openclinica.bean.rule;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/*
 * A simple xml parser based on SAX. This parser will parse
 * rule xml data.
 *
 * @author Krikor Krumlian
 */
public class RuleXmlParser extends DefaultHandler {

    protected final Logger logger = LoggerFactory.getLogger(getClass().getName());
    List<HashMap<String, String>> allRules;
    private HashMap<String, String> rule;
    private String tempVal;

    public RuleXmlParser() {
        allRules = new ArrayList<HashMap<String, String>>();
    }

    public List<HashMap<String, String>> getData(File f) {
        parseDocument(f);
        printData();
        return allRules;
    }

    private void parseDocument(File f) {

        // get a factory
        SAXParserFactory spf = SAXParserFactory.newInstance();
        try {

            // get a new instance of parser
            SAXParser sp = spf.newSAXParser();

            // parse the file and also register this class for call backs
            sp.parse(f, this);

        } catch (SAXException se) {
            se.printStackTrace();
        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    /**
     * Iterate through the list and print the contents
     */
    private void printData() {

        logger.info("No of Records '" + allRules.size() + "'.");

        for (HashMap<String, String> map : allRules) {
            logger.info(map.toString());
        }
    }

    // Event Handlers
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        // reset
        tempVal = "";
        if (qName.equalsIgnoreCase("rule")) {
            rule = new HashMap<String, String>();

        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        tempVal = new String(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        if (qName.equalsIgnoreCase("rule")) {
            // add it to the list
            allRules.add(rule);
        } else if (qName.equalsIgnoreCase("rules")) {
            // do nothing
        } else {
            rule.put(qName, tempVal);
        }
    }

}
