/*
 * An XML document type.
 * Localname: getTiposDeSeloResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeSeloResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeSeloResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeSeloResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeSeloResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeSeloResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDESELORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeSeloResponse");
    
    
    /**
     * Gets the "getTiposDeSeloResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeSeloResponse getGetTiposDeSeloResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeSeloResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeSeloResponse)get_store().find_element_user(GETTIPOSDESELORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeSeloResponse" element
     */
    public void setGetTiposDeSeloResponse(br.jus.tjsc.www.selo.GetTiposDeSeloResponse getTiposDeSeloResponse)
    {
        generatedSetterHelperImpl(getTiposDeSeloResponse, GETTIPOSDESELORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeSeloResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeSeloResponse addNewGetTiposDeSeloResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeSeloResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeSeloResponse)get_store().add_element_user(GETTIPOSDESELORESPONSE$0);
            return target;
        }
    }
}
