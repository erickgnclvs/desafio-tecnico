/*
 * An XML document type.
 * Localname: getTiposDeDocumentoResponse
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetTiposDeDocumentoResponseDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getTiposDeDocumentoResponse(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetTiposDeDocumentoResponseDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetTiposDeDocumentoResponseDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetTiposDeDocumentoResponseDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETTIPOSDEDOCUMENTORESPONSE$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getTiposDeDocumentoResponse");
    
    
    /**
     * Gets the "getTiposDeDocumentoResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeDocumentoResponse getGetTiposDeDocumentoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeDocumentoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeDocumentoResponse)get_store().find_element_user(GETTIPOSDEDOCUMENTORESPONSE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getTiposDeDocumentoResponse" element
     */
    public void setGetTiposDeDocumentoResponse(br.jus.tjsc.www.selo.GetTiposDeDocumentoResponse getTiposDeDocumentoResponse)
    {
        generatedSetterHelperImpl(getTiposDeDocumentoResponse, GETTIPOSDEDOCUMENTORESPONSE$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getTiposDeDocumentoResponse" element
     */
    public br.jus.tjsc.www.selo.GetTiposDeDocumentoResponse addNewGetTiposDeDocumentoResponse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetTiposDeDocumentoResponse target = null;
            target = (br.jus.tjsc.www.selo.GetTiposDeDocumentoResponse)get_store().add_element_user(GETTIPOSDEDOCUMENTORESPONSE$0);
            return target;
        }
    }
}
