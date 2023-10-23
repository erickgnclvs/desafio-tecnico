/*
 * An XML document type.
 * Localname: getSelosResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetSelosResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getSelosResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetSelosResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetSelosResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSelosResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSELOSRESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelosResponse");
    
    
    /**
     * Gets the "getSelosResponse" element
     */
    public br.jus.tjsc.www.selo.GetSelosResponse getGetSelosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSelosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetSelosResponse)get_store().find_element_user(GETSELOSRESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getSelosResponse" element
     */
    public void setGetSelosResponse(br.jus.tjsc.www.selo.GetSelosResponse getSelosResponse)
    {
        generatedSetterHelperImpl(getSelosResponse, GETSELOSRESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getSelosResponse" element
     */
    public br.jus.tjsc.www.selo.GetSelosResponse addNewGetSelosResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSelosResponse target = null;
            target = (br.jus.tjsc.www.selo.GetSelosResponse)get_store().add_element_user(GETSELOSRESPONSE$0);
            return target;
        }
    }
}
