// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.sql.reporting.reportingservices;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.sql.reporting.reportingservices._Property;
import ms.sql.reporting.reportingservices._ReportingService2005Soap_CreateModel;

import java.lang.String;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ReportingService2005Soap_CreateModel
    implements ElementSerializable
{
    // No attributes    

    // Elements
    protected String model;
    protected String parent;
    protected byte[] definition;
    protected _Property[] properties;

    public _ReportingService2005Soap_CreateModel()
    {
        super();
    }

    public _ReportingService2005Soap_CreateModel(
        final String model,
        final String parent,
        final byte[] definition,
        final _Property[] properties)
    {
        // TODO : Call super() instead of setting all fields directly?
        setModel(model);
        setParent(parent);
        setDefinition(definition);
        setProperties(properties);
    }

    public String getModel()
    {
        return this.model;
    }

    public void setModel(String value)
    {
        this.model = value;
    }

    public String getParent()
    {
        return this.parent;
    }

    public void setParent(String value)
    {
        this.parent = value;
    }

    public byte[] getDefinition()
    {
        return this.definition;
    }

    public void setDefinition(byte[] value)
    {
        this.definition = value;
    }

    public _Property[] getProperties()
    {
        return this.properties;
    }

    public void setProperties(_Property[] value)
    {
        this.properties = value;
    }

    public void writeAsElement(
        final XMLStreamWriter writer,
        final String name)
        throws XMLStreamException
    {
        writer.writeStartElement(name);

        // Elements
        XMLStreamWriterHelper.writeElement(
            writer,
            "Model",
            this.model);
        XMLStreamWriterHelper.writeElement(
            writer,
            "Parent",
            this.parent);
        XMLStreamWriterHelper.writeElement(
            writer,
            "Definition",
            this.definition);

        if (this.properties != null)
        {
            /*
             * The element type is an array.
             */
            writer.writeStartElement("Properties");

            for (int iterator0 = 0; iterator0 < this.properties.length; iterator0++)
            {
                this.properties[iterator0].writeAsElement(
                    writer,
                    "Property");
            }

            writer.writeEndElement();
        }

        writer.writeEndElement();
    }
}
