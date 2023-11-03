/*
 * An XML document type.
 * Localname: getTiposDeTelefoneResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeTelefoneResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeTelefoneResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeTelefoneResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeTelefoneResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeTelefoneResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDETELEFONERESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeTelefoneResponse");
    
    
    /**
     * Gets the "getTiposDeTelefoneResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeTelefoneResponse getGetTiposDeTelefoneResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeTelefoneResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeTelefoneResponse)get_store().find_element_user(GETTIPOSDETELEFONERESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeTelefoneResponse" element
     */
    public void setGetTiposDeTelefoneResponse(br.jus.tjsc.www.selo.GetTiposDeTelefoneResponse getTiposDeTelefoneResponse)
    {
        generatedSetterHelperImpl(getTiposDeTelefoneResponse, GETTIPOSDETELEFONERESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeTelefoneResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeTelefoneResponse addNewGetTiposDeTelefoneResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeTelefoneResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeTelefoneResponse)get_store().add_element_user(GETTIPOSDETELEFONERESPONSE$0);
            return target;
        }
    }
}
