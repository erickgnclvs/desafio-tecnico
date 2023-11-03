/*
 * An XML document type.
 * Localname: getTiposDeProcuracaoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeProcuracaoResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeProcuracaoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeProcuracaoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDEPROCURACAORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeProcuracaoResponse");
    
    
    /**
     * Gets the "getTiposDeProcuracaoResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponse getGetTiposDeProcuracaoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponse)get_store().find_element_user(GETTIPOSDEPROCURACAORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeProcuracaoResponse" element
     */
    public void setGetTiposDeProcuracaoResponse(br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponse getTiposDeProcuracaoResponse)
    {
        generatedSetterHelperImpl(getTiposDeProcuracaoResponse, GETTIPOSDEPROCURACAORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeProcuracaoResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponse addNewGetTiposDeProcuracaoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeProcuracaoResponse)get_store().add_element_user(GETTIPOSDEPROCURACAORESPONSE$0);
            return target;
        }
    }
}
