// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

 /*
 * This file was automatically generated by com.microsoft.tfs.core.ws.generator.Generator
 * from the /complexType.vm template.
 */
package ms.tfs.workitemtracking.clientservices._03;

import com.microsoft.tfs.core.ws.runtime.*;
import com.microsoft.tfs.core.ws.runtime.serialization.*;
import com.microsoft.tfs.core.ws.runtime.types.*;
import com.microsoft.tfs.core.ws.runtime.util.*;
import com.microsoft.tfs.core.ws.runtime.xml.*;

import ms.tfs.workitemtracking.clientservices._03._ClientService3Soap_GetChangedWorkItemIdsResponse;
import ms.tfs.workitemtracking.clientservices._03._WorkItemId;

import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.XMLStreamWriter;

/**
 * Automatically generated complex type class.
 */
public class _ClientService3Soap_GetChangedWorkItemIdsResponse
    implements ElementDeserializable
{
    // No attributes    

    // Elements
    protected _WorkItemId[] getChangedWorkItemIdsResult;

    public _ClientService3Soap_GetChangedWorkItemIdsResponse()
    {
        super();
    }

    public _ClientService3Soap_GetChangedWorkItemIdsResponse(final _WorkItemId[] getChangedWorkItemIdsResult)
    {
        // TODO : Call super() instead of setting all fields directly?
        setGetChangedWorkItemIdsResult(getChangedWorkItemIdsResult);
    }

    public _WorkItemId[] getGetChangedWorkItemIdsResult()
    {
        return this.getChangedWorkItemIdsResult;
    }

    public void setGetChangedWorkItemIdsResult(_WorkItemId[] value)
    {
        this.getChangedWorkItemIdsResult = value;
    }

    public void readFromElement(final XMLStreamReader reader)
        throws XMLStreamException
    {
        String localName;

        // This object uses no attributes

        // Elements
        int event;

        do
        {
            event = reader.next();

            if (event == XMLStreamConstants.START_ELEMENT)
            {
                localName = reader.getLocalName();

                if (localName.equalsIgnoreCase("GetChangedWorkItemIdsResult"))
                {
                    /*
                     * The element type is an array.
                     */
                    int event0;
                    final List list0 = new ArrayList();

                    do
                    {
                        event0 = reader.nextTag();

                        if (event0 == XMLStreamConstants.START_ELEMENT)
                        {
                            _WorkItemId complexObject0 = new _WorkItemId();
                            complexObject0.readFromElement(reader);
                            list0.add(complexObject0);
                        }
                    }
                    while (event0 != XMLStreamConstants.END_ELEMENT);

                    this.getChangedWorkItemIdsResult = (_WorkItemId[]) list0.toArray(new _WorkItemId[list0.size()]);
                }
                else
                {
                    // Read the unknown child element until its end
                    XMLStreamReaderHelper.readUntilElementEnd(reader);
                }
            }
        }
        while (event != XMLStreamConstants.END_ELEMENT);
    }
}
