/*
 * An XML document type.
 * Localname: getTiposDeServentuarioResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeServentuarioResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeServentuarioResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeServentuarioResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeServentuarioResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeServentuarioResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDESERVENTUARIORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeServentuarioResponse");
    
    
    /**
     * Gets the "getTiposDeServentuarioResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeServentuarioResponse getGetTiposDeServentuarioResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeServentuarioResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeServentuarioResponse)get_store().find_element_user(GETTIPOSDESERVENTUARIORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeServentuarioResponse" element
     */
    public void setGetTiposDeServentuarioResponse(br.jus.tjsc.www.selo.GetTiposDeServentuarioResponse getTiposDeServentuarioResponse)
    {
        generatedSetterHelperImpl(getTiposDeServentuarioResponse, GETTIPOSDESERVENTUARIORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeServentuarioResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeServentuarioResponse addNewGetTiposDeServentuarioResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeServentuarioResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeServentuarioResponse)get_store().add_element_user(GETTIPOSDESERVENTUARIORESPONSE$0);
            return target;
        }
    }
}
