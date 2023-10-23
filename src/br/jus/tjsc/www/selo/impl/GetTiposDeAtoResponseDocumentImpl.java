/*
 * An XML document type.
 * Localname: getTiposDeAtoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeAtoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeAtoResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeAtoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeAtoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeAtoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDEATORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeAtoResponse");
    
    
    /**
     * Gets the "getTiposDeAtoResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeAtoResponse getGetTiposDeAtoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeAtoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeAtoResponse)get_store().find_element_user(GETTIPOSDEATORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeAtoResponse" element
     */
    public void setGetTiposDeAtoResponse(br.jus.tjsc.www.selo.GetTiposDeAtoResponse getTiposDeAtoResponse)
    {
        generatedSetterHelperImpl(getTiposDeAtoResponse, GETTIPOSDEATORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeAtoResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeAtoResponse addNewGetTiposDeAtoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeAtoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeAtoResponse)get_store().add_element_user(GETTIPOSDEATORESPONSE$0);
            return target;
        }
    }
}
