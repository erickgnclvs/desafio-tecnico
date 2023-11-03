/*
 * An XML document type.
 * Localname: getTiposDeEnderecoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeEnderecoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeEnderecoResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeEnderecoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeEnderecoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeEnderecoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDEENDERECORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeEnderecoResponse");
    
    
    /**
     * Gets the "getTiposDeEnderecoResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeEnderecoResponse getGetTiposDeEnderecoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeEnderecoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeEnderecoResponse)get_store().find_element_user(GETTIPOSDEENDERECORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeEnderecoResponse" element
     */
    public void setGetTiposDeEnderecoResponse(br.jus.tjsc.www.selo.GetTiposDeEnderecoResponse getTiposDeEnderecoResponse)
    {
        generatedSetterHelperImpl(getTiposDeEnderecoResponse, GETTIPOSDEENDERECORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeEnderecoResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeEnderecoResponse addNewGetTiposDeEnderecoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeEnderecoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeEnderecoResponse)get_store().add_element_user(GETTIPOSDEENDERECORESPONSE$0);
            return target;
        }
    }
}
