/*
 * An XML document type.
 * Localname: getMoedasResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetMoedasResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getMoedasResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetMoedasResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetMoedasResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetMoedasResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMOEDASRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getMoedasResponse");
    
    
    /**
     * Gets the "getMoedasResponse" element
     */
    public br.jus.tjsc.www.selo.GetMoedasResponse getGetMoedasResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetMoedasResponse target = null;
            target = (br.jus.tjsc.www.selo.GetMoedasResponse)get_store().find_element_user(GETMOEDASRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMoedasResponse" element
     */
    public void setGetMoedasResponse(br.jus.tjsc.www.selo.GetMoedasResponse getMoedasResponse)
    {
        generatedSetterHelperImpl(getMoedasResponse, GETMOEDASRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getMoedasResponse" element
     */
    public br.jus.tjsc.www.selo.GetMoedasResponse addNewGetMoedasResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetMoedasResponse target = null;
            target = (br.jus.tjsc.www.selo.GetMoedasResponse)get_store().add_element_user(GETMOEDASRESPONSE$0);
            return target;
        }
    }
}
